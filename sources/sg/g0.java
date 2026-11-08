package sg;

import a8.wa;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
