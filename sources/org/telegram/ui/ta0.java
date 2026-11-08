package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ta0 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ce0 b;

    public /* synthetic */ ta0(ce0 ce0Var, int i7) {
        this.a = i7;
        this.b = ce0Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                ce0 ce0Var = this.b;
                ce0Var.b[ce0Var.a].d();
                ce0Var.C1(true, true);
                break;
            default:
                ce0 ce0Var2 = this.b;
                ce0Var2.l0 = true;
                if (ce0Var2.a != 0) {
                    ce0Var2.M1(0, true, null, true);
                    break;
                }
                break;
        }
    }
}
