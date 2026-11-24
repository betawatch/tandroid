// default package

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class vef extends jdf {
    private static final Map zzb = new ConcurrentHashMap();
    protected chf zzc;
    private int zzd;

    public vef() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = chf.e;
    }

    public static dff b(dff dffVar) {
        int size = dffVar.size();
        return dffVar.zzg(size == 0 ? 10 : size << 1);
    }

    public static Object c(Method method, vef vefVar, Object... objArr) {
        try {
            return method.invoke(vefVar, objArr);
        } catch (IllegalAccessException e) {
            fyb.j("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            fyb.j("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static void e(Class cls, vef vefVar) {
        vefVar.d();
        zzb.put(cls, vefVar);
    }

    public static vef k(Class cls) {
        Map map = zzb;
        vef vefVar = (vef) map.get(cls);
        if (vefVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                vefVar = (vef) map.get(cls);
            } catch (ClassNotFoundException e) {
                k93.h("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (vefVar != null) {
            return vefVar;
        }
        try {
            vef vefVar2 = (vef) ((vef) ghf.a.allocateInstance(cls)).h(6, null);
            if (vefVar2 != null) {
                map.put(cls, vefVar2);
                return vefVar2;
            }
            sdb.a();
            return null;
        } catch (InstantiationException e2) {
            ho9.n(e2);
            return null;
        }
    }

    @Override // jdf
    public final int a(tgf tgfVar) {
        if (g()) {
            int e = tgfVar.e(this);
            if (e >= 0) {
                return e;
            }
            sc8.j(de9.k(e, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int e2 = tgfVar.e(this);
        if (e2 >= 0) {
            this.zzd = (this.zzd & TLObject.FLAG_31) | e2;
            return e2;
        }
        sc8.j(de9.k(e2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final void d() {
        this.zzd &= ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return qgf.c.a(getClass()).b(this, (vef) obj);
    }

    public final void f() {
        this.zzd = (this.zzd & TLObject.FLAG_31) | ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public final boolean g() {
        return (this.zzd & TLObject.FLAG_31) != 0;
    }

    public abstract Object h(int i, vef vefVar);

    public final int hashCode() {
        if (g()) {
            return qgf.c.a(getClass()).f(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int f = qgf.c.a(getClass()).f(this);
        this.zza = f;
        return f;
    }

    public final int i() {
        if (g()) {
            int e = qgf.c.a(getClass()).e(this);
            if (e >= 0) {
                return e;
            }
            sc8.j(de9.k(e, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int e2 = qgf.c.a(getClass()).e(this);
        if (e2 >= 0) {
            this.zzd = (this.zzd & TLObject.FLAG_31) | e2;
            return e2;
        }
        sc8.j(de9.k(e2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final uef j() {
        return (uef) h(5, null);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = egf.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        egf.c(this, sb, 0);
        return sb.toString();
    }
}
