package org.telegram.ui;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yg1 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hh1 b;

    public /* synthetic */ yg1(hh1 hh1Var, int i10) {
        this.a = i10;
        this.b = hh1Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                hh1 hh1Var = this.b;
                hh1Var.B0();
                hh1Var.finishFragment();
                break;
            case 2:
                hh1 hh1Var2 = this.b;
                hh1Var2.R = "";
                hh1Var2.E0(false);
                break;
            case 3:
                hh1.a0(this.b);
                break;
            default:
                hh1.X(this.b);
                break;
        }
    }
}
