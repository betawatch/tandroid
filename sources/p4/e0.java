package p4;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ e0(m0 m0Var, int i7) {
        this.a = i7;
        this.b = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m0 m0Var = this.b;
                h2.m0.W(m0Var.h.l, new e0(m0Var, 1));
                break;
            default:
                this.b.o0();
                break;
        }
    }
}
