package qa;

import g7.t6;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b extends t6 {
    public final Method a = Class.class.getMethod("isRecord", null);
    public final Method b = Class.class.getMethod("getRecordComponents", null);
    public final Method c;
    public final Method d;

    public b() {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.c = cls.getMethod("getName", null);
        this.d = cls.getMethod("getType", null);
    }

    @Override // g7.t6
    public final Method a(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }

    @Override // g7.t6
    public final Constructor b(Class cls) {
        try {
            Object[] objArr = (Object[]) this.b.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i9 = 0; i9 < objArr.length; i9++) {
                clsArr[i9] = (Class) this.d.invoke(objArr[i9], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }

    @Override // g7.t6
    public final String[] c(Class cls) {
        try {
            Object[] objArr = (Object[]) this.b.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i9 = 0; i9 < objArr.length; i9++) {
                strArr[i9] = (String) this.c.invoke(objArr[i9], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }

    @Override // g7.t6
    public final boolean d(Class cls) {
        try {
            return ((Boolean) this.a.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }
}
