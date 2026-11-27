// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class pjc implements Runnable {
    public final /* synthetic */ anb a;

    public pjc(anb anbVar) {
        this.a = anbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.c) {
            this.a.d = null;
        }
    }
}
