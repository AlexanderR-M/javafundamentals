package reflection.alexr.di;

//Contenedor que usa reflexión para crear e inyectar dependencias

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

// Contenedor simple que crea objetos e inyecta dependencias con reflexión
public class Container {

    private final Map<Class<?>, Object> beans = new HashMap<>();

    // Registra una clase concreta anotada con @Component
    public void register(Class<?> clazz) {
        if (clazz.isAnnotationPresent(Component.class)) {
            try {
                Object instance = clazz.getDeclaredConstructor().newInstance();
                beans.put(clazz, instance);
                System.out.println("Registrado: " + clazz.getSimpleName());
            } catch (Exception e) {
                throw new RuntimeException("Error al crear el bean: " + clazz.getSimpleName(), e);
            }
        }
    }

    // Inyecta todas las dependencias marcadas con @Inject
    public void initialize() {
        try {
            injectDependencies();
        } catch (Exception e) {
            throw new RuntimeException("Error al inyectar dependencias", e);
        }
    }

    // Busca dependencias por tipo exacto o por compatibilidad con interfaces
    private void injectDependencies() throws IllegalAccessException {
        for (Object bean : beans.values()) {
            Class<?> beanClass = bean.getClass();
            Field[] fields = beanClass.getDeclaredFields();

            for (Field field : fields) {
                if (field.isAnnotationPresent(Inject.class)) {
                    field.setAccessible(true);

                    Class<?> requiredType = field.getType();
                    Object dependency = findDependency(requiredType);

                    if (dependency == null) {
                        throw new RuntimeException("No hay dependencia para: " + requiredType.getSimpleName());
                    }

                    field.set(bean, dependency);
                    System.out.println("Inyectado " + requiredType.getSimpleName() + " en " + beanClass.getSimpleName());
                }
            }
        }
    }

    // Busca una dependencia que coincida exactamente o que implemente la interfaz pedida
    private Object findDependency(Class<?> requiredType) {
        Object exactMatch = beans.get(requiredType);
        if (exactMatch != null) {
            return exactMatch;
        }

        for (Object bean : beans.values()) {
            if (requiredType.isAssignableFrom(bean.getClass())) {
                return bean;
            }
        }

        return null;
    }

    // Devuelve un bean ya creado
    @SuppressWarnings("unchecked")
    public <T> T getBean(Class<T> clazz) {
        Object bean = beans.get(clazz);

        if (bean != null) {
            return (T) bean;
        }

        for (Object value : beans.values()) {
            if (clazz.isAssignableFrom(value.getClass())) {
                return (T) value;
            }
        }

        return null;
    }
}