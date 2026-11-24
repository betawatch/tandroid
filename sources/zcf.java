// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zcf extends vbf implements Runnable {
    public final Runnable n;

    public zcf(Runnable runnable) {
        runnable.getClass();
        this.n = runnable;
    }

    @Override // vbf
    public final String a() {
        return tb4.y("task=[", this.n.toString(), "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.n.run();
        } catch (Error | RuntimeException e) {
            if (vbf.f.f(this, null, new obf(e))) {
                vbf.g(this);
            }
            throw e;
        }
    }
}
