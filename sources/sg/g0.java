package sg;

import a8.wa;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;
    public final /* synthetic */ wa c;

    public /* synthetic */ g0(j0 j0Var, wa waVar, int i7) {
        this.a = i7;
        this.b = j0Var;
        this.c = waVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p(this.c, true);
                break;
            default:
                j0 j0Var = this.b;
                j0Var.f.f(new g0(j0Var, this.c, 0));
                break;
        }
    }
}
