// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
