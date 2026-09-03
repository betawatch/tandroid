package ze;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class c {
    public Runnable a;
    public Runnable b;
    public Runnable c;

    public c(Runnable runnable, Runnable runnable2) {
        this.a = runnable;
        this.c = runnable2;
    }

    public final void a(boolean z4) {
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
        c(z4);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z4) {
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
            this.a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.b = runnable;
    }
}
