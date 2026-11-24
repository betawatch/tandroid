// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
