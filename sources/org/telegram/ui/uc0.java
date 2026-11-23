package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class uc0 implements org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gd0 b;

    public /* synthetic */ uc0(gd0 gd0Var, int i7) {
        this.a = i7;
        this.b = gd0Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                gd0 gd0Var = this.b;
                gd0Var.c(true);
                gd0Var.v0.M1(0, true, null, true);
                break;
            default:
                this.b.v0.M1(0, true, null, true);
                break;
        }
    }
}
