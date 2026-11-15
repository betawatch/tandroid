package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ya0 implements org.telegram.ui.Components.rt0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 b;

    public /* synthetic */ ya0(int i7, org.telegram.ui.ActionBar.e2 e2Var) {
        this.a = i7;
        this.b = e2Var;
    }

    @Override // org.telegram.ui.Components.rt0
    public final void L(int i7, boolean z10) {
        qd0 qd0Var;
        gi0 gi0Var;
        switch (this.a) {
            case 0:
                ce0 ce0Var = (ce0) this.b;
                if (i7 > org.telegram.messenger.g0.L(20.0f) && ce0Var.z1()) {
                    org.telegram.messenger.g0.v1(ce0Var.fragmentView);
                }
                if (i7 <= org.telegram.messenger.g0.L(20.0f) && (qd0Var = ce0Var.U) != null) {
                    qd0Var.run();
                    ce0Var.U = null;
                    break;
                }
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                if (i7 >= org.telegram.messenger.g0.L(20.0f) && (gi0Var = passcodeActivity.U) != null) {
                    gi0Var.run();
                    passcodeActivity.U = null;
                    break;
                }
                break;
        }
    }
}
