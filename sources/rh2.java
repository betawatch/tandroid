// default package

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class rh2 {
    public static final rh2 c = new rh2();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap hashMap, qh2 qh2Var, u06 u06Var, Class cls) {
        u06 u06Var2 = (u06) hashMap.get(qh2Var);
        if (u06Var2 == null) {
            hashMap.put(qh2Var, u06Var);
            return;
        }
        if (u06Var == u06Var2) {
            return;
        }
        throw new IllegalArgumentException("Method " + qh2Var.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + u06Var2 + ", new value " + u06Var);
    }

    public final ph2 a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.a;
        if (superclass != null) {
            ph2 ph2Var = (ph2) hashMap2.get(superclass);
            if (ph2Var == null) {
                ph2Var = a(superclass, null);
            }
            hashMap.putAll(ph2Var.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            ph2 ph2Var2 = (ph2) hashMap2.get(cls2);
            if (ph2Var2 == null) {
                ph2Var2 = a(cls2, null);
            }
            for (Map.Entry entry : ph2Var2.b.entrySet()) {
                b(hashMap, (qh2) entry.getKey(), (u06) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            ep7 ep7Var = (ep7) method.getAnnotation(ep7.class);
            if (ep7Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!e16.class.isAssignableFrom(parameterTypes[0])) {
                        w26.j("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                u06 value = ep7Var.value();
                if (parameterTypes.length > 1) {
                    if (!u06.class.isAssignableFrom(parameterTypes[1])) {
                        w26.j("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (value != u06.ON_ANY) {
                        w26.j("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    w26.j("cannot have more than 2 params");
                    return null;
                }
                b(hashMap, new qh2(i, method), value, cls);
                z = true;
            }
        }
        ph2 ph2Var3 = new ph2(hashMap);
        hashMap2.put(cls, ph2Var3);
        this.b.put(cls, Boolean.valueOf(z));
        return ph2Var3;
    }
}
