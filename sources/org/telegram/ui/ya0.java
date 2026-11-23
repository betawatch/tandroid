package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ya0 implements org.telegram.ui.Components.bu0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 b;

    public /* synthetic */ ya0(int i7, org.telegram.ui.ActionBar.g2 g2Var) {
        this.a = i7;
        this.b = g2Var;
    }

    @Override // org.telegram.ui.Components.bu0
    public final void L(int i7, boolean z10) {
        qd0 qd0Var;
        hi0 hi0Var;
        switch (this.a) {
            case 0:
                de0 de0Var = (de0) this.b;
                if (i7 > org.telegram.messenger.g0.L(20.0f) && de0Var.z1()) {
                    org.telegram.messenger.g0.v1(de0Var.fragmentView);
                }
                if (i7 <= org.telegram.messenger.g0.L(20.0f) && (qd0Var = de0Var.U) != null) {
                    qd0Var.run();
                    de0Var.U = null;
                    break;
                }
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                if (i7 >= org.telegram.messenger.g0.L(20.0f) && (hi0Var = passcodeActivity.U) != null) {
                    hi0Var.run();
                    passcodeActivity.U = null;
                    break;
                }
                break;
        }
    }
}
