package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class uc0 implements org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ed0 b;

    public /* synthetic */ uc0(ed0 ed0Var, int i7) {
        this.a = i7;
        this.b = ed0Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                ed0 ed0Var = this.b;
                ed0Var.c(true);
                ed0Var.v0.M1(0, true, null, true);
                break;
            default:
                this.b.v0.M1(0, true, null, true);
                break;
        }
    }
}
