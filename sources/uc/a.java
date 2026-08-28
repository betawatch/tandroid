package uc;

import java.lang.reflect.Method;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class a {
    public static final Method a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        i.b(methods);
        int length = methods.length;
        int i9 = 0;
        while (true) {
            method = null;
            if (i9 >= length) {
                break;
            }
            Method method2 = methods[i9];
            if (i.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                i.d(parameterTypes, "getParameterTypes(...)");
                if (i.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i9++;
        }
        a = method;
        int length2 = methods.length;
        for (int i10 = 0; i10 < length2 && !i.a(methods[i10].getName(), "getSuppressed"); i10++) {
        }
    }
}
