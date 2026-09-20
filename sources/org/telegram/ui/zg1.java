package org.telegram.ui;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class zg1 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ih1 b;

    public /* synthetic */ zg1(ih1 ih1Var, int i10) {
        this.a = i10;
        this.b = ih1Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                ih1 ih1Var = this.b;
                ih1Var.B0();
                ih1Var.finishFragment();
                break;
            case 2:
                ih1 ih1Var2 = this.b;
                ih1Var2.R = "";
                ih1Var2.E0(false);
                break;
            case 3:
                ih1.a0(this.b);
                break;
            default:
                ih1.X(this.b);
                break;
        }
    }
}
