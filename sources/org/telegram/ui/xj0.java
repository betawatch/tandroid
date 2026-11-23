package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class xj0 implements org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bk0 b;

    public /* synthetic */ xj0(bk0 bk0Var, int i7) {
        this.a = i7;
        this.b = bk0Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                bk0 bk0Var = this.b;
                bk0Var.c(true);
                bk0Var.R.finishFragment();
                break;
            default:
                bk0 bk0Var2 = this.b;
                bk0Var2.c(true);
                bk0Var2.R.O1(null, 0, true);
                break;
        }
    }
}
