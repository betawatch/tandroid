package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ya0 implements org.telegram.ui.Components.zt0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.h2 b;

    public /* synthetic */ ya0(int i7, org.telegram.ui.ActionBar.h2 h2Var) {
        this.a = i7;
        this.b = h2Var;
    }

    @Override // org.telegram.ui.Components.zt0
    public final void L(int i7, boolean z10) {
        rd0 rd0Var;
        ji0 ji0Var;
        switch (this.a) {
            case 0:
                de0 de0Var = (de0) this.b;
                if (i7 > org.telegram.messenger.g0.L(20.0f) && de0Var.z1()) {
                    org.telegram.messenger.g0.v1(de0Var.fragmentView);
                }
                if (i7 <= org.telegram.messenger.g0.L(20.0f) && (rd0Var = de0Var.U) != null) {
                    rd0Var.run();
                    de0Var.U = null;
                    break;
                }
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                if (i7 >= org.telegram.messenger.g0.L(20.0f) && (ji0Var = passcodeActivity.U) != null) {
                    ji0Var.run();
                    passcodeActivity.U = null;
                    break;
                }
                break;
        }
    }
}
