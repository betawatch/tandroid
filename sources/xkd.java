// default package

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class xkd extends ibd {
    private static Map<Object, xkd> zzjr = new ConcurrentHashMap();
    protected g0e zzjp;
    private int zzjq;

    public xkd() {
        this.zzex = 0;
        this.zzjp = g0e.e;
        this.zzjq = -1;
    }

    public static Object b(Method method, xkd xkdVar, Object... objArr) {
        Throwable e;
        String str;
        try {
            return method.invoke(xkdVar, objArr);
        } catch (IllegalAccessException e2) {
            e = e2;
            str = "Couldn't use Java reflection to implement protocol message reflection.";
            rjb.k(str, e);
            return null;
        } catch (InvocationTargetException e3) {
            e = e3.getCause();
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            if (e instanceof Error) {
                throw ((Error) e);
            }
            str = "Unexpected exception thrown by generated accessor method.";
            rjb.k(str, e);
            return null;
        }
    }

    public static void c(Class cls, xkd xkdVar) {
        zzjr.put(cls, xkdVar);
    }

    public static xkd d(Class cls) {
        xkd xkdVar = zzjr.get(cls);
        if (xkdVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                xkdVar = zzjr.get(cls);
            } catch (ClassNotFoundException e) {
                wa3.h("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (xkdVar != null) {
            return xkdVar;
        }
        String name = cls.getName();
        throw new IllegalStateException(name.length() != 0 ? "Unable to get default instance for: ".concat(name) : new String("Unable to get default instance for: "));
    }

    public abstract Object a(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((xkd) a(6)).getClass().isInstance(obj)) {
            return false;
        }
        wvd wvdVar = wvd.c;
        wvdVar.getClass();
        return wvdVar.a(getClass()).f(this, (xkd) obj);
    }

    public final int hashCode() {
        int i = this.zzex;
        if (i != 0) {
            return i;
        }
        wvd wvdVar = wvd.c;
        wvdVar.getClass();
        int e = wvdVar.a(getClass()).e(this);
        this.zzex = e;
        return e;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        lgd.b(this, sb, 0);
        return sb.toString();
    }
}
