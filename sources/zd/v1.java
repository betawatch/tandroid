package zd;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
