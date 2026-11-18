package zd;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class v1 {
    public static final ThreadLocal a = new ThreadLocal();

    public static t0 a() {
        ThreadLocal threadLocal = a;
        t0 t0Var = (t0) threadLocal.get();
        if (t0Var != null) {
            return t0Var;
        }
        i iVar = new i(Thread.currentThread());
        threadLocal.set(iVar);
        return iVar;
    }
}
