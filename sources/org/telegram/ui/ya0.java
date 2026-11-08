package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ya0 implements org.telegram.ui.Components.qt0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 b;

    public /* synthetic */ ya0(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        this.a = i7;
        this.b = f2Var;
    }

    @Override // org.telegram.ui.Components.qt0
    public final void K(int i7, boolean z9) {
        qd0 qd0Var;
        ei0 ei0Var;
        switch (this.a) {
            case 0:
                ce0 ce0Var = (ce0) this.b;
                if (i7 > org.telegram.messenger.g0.L(20.0f) && ce0Var.z1()) {
                    org.telegram.messenger.g0.v1(ce0Var.fragmentView);
                }
                if (i7 <= org.telegram.messenger.g0.L(20.0f) && (qd0Var = ce0Var.T) != null) {
                    qd0Var.run();
                    ce0Var.T = null;
                    break;
                }
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                if (i7 >= org.telegram.messenger.g0.L(20.0f) && (ei0Var = passcodeActivity.T) != null) {
                    ei0Var.run();
                    passcodeActivity.T = null;
                    break;
                }
                break;
        }
    }
}
