// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
