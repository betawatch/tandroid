package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class wj0 implements org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ak0 b;

    public /* synthetic */ wj0(ak0 ak0Var, int i7) {
        this.a = i7;
        this.b = ak0Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                ak0 ak0Var = this.b;
                ak0Var.c(true);
                ak0Var.R.finishFragment();
                break;
            default:
                ak0 ak0Var2 = this.b;
                ak0Var2.c(true);
                ak0Var2.R.O1(null, 0, true);
                break;
        }
    }
}
