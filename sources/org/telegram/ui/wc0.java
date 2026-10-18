package org.telegram.ui;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wc0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ eg0 b;

    public /* synthetic */ wc0(eg0 eg0Var, int i10) {
        this.a = i10;
        this.b = eg0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                eg0 eg0Var = this.b;
                eg0Var.b[eg0Var.a].d();
                eg0Var.k1(true, true);
                break;
            default:
                eg0 eg0Var2 = this.b;
                eg0Var2.l0 = true;
                if (eg0Var2.a != 0) {
                    eg0Var2.u1(0, true, null, true);
                    break;
                }
                break;
        }
    }
}
