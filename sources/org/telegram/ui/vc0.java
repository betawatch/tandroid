package org.telegram.ui;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vc0 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gd0 b;

    public /* synthetic */ vc0(gd0 gd0Var, int i7) {
        this.a = i7;
        this.b = gd0Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                gd0 gd0Var = this.b;
                gd0Var.c(true);
                gd0Var.u0.M1(0, true, null, true);
                break;
            default:
                this.b.u0.M1(0, true, null, true);
                break;
        }
    }
}
