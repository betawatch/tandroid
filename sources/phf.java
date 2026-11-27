// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
