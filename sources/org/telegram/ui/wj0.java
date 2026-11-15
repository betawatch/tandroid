package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
