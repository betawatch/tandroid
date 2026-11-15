package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ta0 implements org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ce0 b;

    public /* synthetic */ ta0(ce0 ce0Var, int i7) {
        this.a = i7;
        this.b = ce0Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                ce0 ce0Var = this.b;
                ce0Var.b[ce0Var.a].d();
                ce0Var.C1(true, true);
                break;
            default:
                ce0 ce0Var2 = this.b;
                ce0Var2.m0 = true;
                if (ce0Var2.a != 0) {
                    ce0Var2.M1(0, true, null, true);
                    break;
                }
                break;
        }
    }
}
