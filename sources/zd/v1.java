package zd;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
