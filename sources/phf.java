// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class phf extends lgf implements Runnable {
    public final Runnable n;

    public phf(Runnable runnable) {
        runnable.getClass();
        this.n = runnable;
    }

    @Override // lgf
    public final String a() {
        return qd4.y("task=[", this.n.toString(), "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.n.run();
        } catch (Error | RuntimeException e) {
            if (lgf.f.f(this, null, new egf(e))) {
                lgf.g(this);
            }
            throw e;
        }
    }
}
