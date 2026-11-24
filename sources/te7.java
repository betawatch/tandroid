// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class te7 extends p2 implements Runnable {
    public final Runnable n;

    public te7(Runnable runnable) {
        runnable.getClass();
        this.n = runnable;
    }

    @Override // t2
    public final String j() {
        return "task=[" + this.n + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.n.run();
        } catch (Throwable th) {
            m(th);
            throw th;
        }
    }
}
