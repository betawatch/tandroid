package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qf1 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zf1 b;

    public /* synthetic */ qf1(zf1 zf1Var, int i10) {
        this.a = i10;
        this.b = zf1Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                zf1 zf1Var = this.b;
                zf1Var.B0();
                zf1Var.finishFragment();
                break;
            case 2:
                zf1 zf1Var2 = this.b;
                zf1Var2.N = "";
                zf1Var2.E0(false);
                break;
            case 3:
                zf1.a0(this.b);
                break;
            default:
                zf1.X(this.b);
                break;
        }
    }
}
