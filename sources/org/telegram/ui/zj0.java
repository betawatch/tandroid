package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class zj0 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dk0 b;

    public /* synthetic */ zj0(dk0 dk0Var, int i7) {
        this.a = i7;
        this.b = dk0Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                dk0 dk0Var = this.b;
                dk0Var.c(true);
                dk0Var.R.finishFragment();
                break;
            default:
                dk0 dk0Var2 = this.b;
                dk0Var2.c(true);
                dk0Var2.R.O1(null, 0, true);
                break;
        }
    }
}
