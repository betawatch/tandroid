// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
