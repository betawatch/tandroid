package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wm0 implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn0 b;

    public /* synthetic */ wm0(bn0 bn0Var, int i10) {
        this.a = i10;
        this.b = bn0Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                bn0 bn0Var = this.b;
                bn0Var.c(true);
                bn0Var.N.finishFragment();
                break;
            default:
                bn0 bn0Var2 = this.b;
                bn0Var2.c(true);
                bn0Var2.N.K1(null, 0, true);
                break;
        }
    }
}
