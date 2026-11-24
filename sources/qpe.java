// default package

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class qpe extends rfe {
    private static Map<Object, qpe> zzd = new ConcurrentHashMap();
    protected s1f zzb;
    private int zzc;

    public qpe() {
        this.zza = 0;
        this.zzb = s1f.f;
        this.zzc = -1;
    }

    public static Object e(Method method, qpe qpeVar, Object... objArr) {
        try {
            return method.invoke(qpeVar, objArr);
        } catch (IllegalAccessException e) {
            rjb.k("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            rjb.k("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static qpe f(Class cls) {
        qpe qpeVar = zzd.get(cls);
        if (qpeVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                qpeVar = zzd.get(cls);
            } catch (ClassNotFoundException e) {
                wa3.h("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (qpeVar != null) {
            return qpeVar;
        }
        try {
            qpe qpeVar2 = (qpe) ((qpe) k2f.a.allocateInstance(cls)).d(6);
            if (qpeVar2 != null) {
                zzd.put(cls, qpeVar2);
                return qpeVar2;
            }
            rjb.h();
            return null;
        } catch (InstantiationException e2) {
            dq9.o(e2);
            return null;
        }
    }

    public static void g(Class cls, qpe qpeVar) {
        zzd.put(cls, qpeVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cre, zpe] */
    public static cre i() {
        return zpe.d;
    }

    @Override // rfe
    public final void b(int i) {
        this.zzc = i;
    }

    @Override // rfe
    public final int c() {
        return this.zzc;
    }

    public abstract Object d(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hye hyeVar = hye.c;
        hyeVar.getClass();
        return hyeVar.a(getClass()).f(this, (qpe) obj);
    }

    public final int h() {
        int i = this.zzc;
        if (i != -1) {
            return i;
        }
        hye hyeVar = hye.c;
        hyeVar.getClass();
        int zzb = hyeVar.a(getClass()).zzb(this);
        this.zzc = zzb;
        return zzb;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        hye hyeVar = hye.c;
        hyeVar.getClass();
        int g = hyeVar.a(getClass()).g(this);
        this.zza = g;
        return g;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        hmd.c(this, sb, 0);
        return sb.toString();
    }
}
