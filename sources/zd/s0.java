package zd;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class s0 extends t0 {
    public final e2 c;

    public s0(long j3, e2 e2Var) {
        super(j3);
        this.c = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    @Override // zd.t0
    public final String toString() {
        return super.toString() + this.c;
    }
}
