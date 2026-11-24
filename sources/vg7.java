// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class vg7 extends p2 implements Runnable {
    public final Runnable n;

    public vg7(Runnable runnable) {
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
