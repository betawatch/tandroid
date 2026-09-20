package zd;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public abstract class c2 {
    public static final ThreadLocal a = new ThreadLocal();

    public static w0 a() {
        ThreadLocal threadLocal = a;
        w0 w0Var = (w0) threadLocal.get();
        if (w0Var != null) {
            return w0Var;
        }
        i iVar = new i(Thread.currentThread());
        threadLocal.set(iVar);
        return iVar;
    }
}
