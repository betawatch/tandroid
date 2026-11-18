package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class za0 implements org.telegram.ui.Components.zt0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.h2 b;

    public /* synthetic */ za0(int i7, org.telegram.ui.ActionBar.h2 h2Var) {
        this.a = i7;
        this.b = h2Var;
    }

    @Override // org.telegram.ui.Components.zt0
    public final void L(int i7, boolean z10) {
        sd0 sd0Var;
        ji0 ji0Var;
        switch (this.a) {
            case 0:
                ee0 ee0Var = (ee0) this.b;
                if (i7 > org.telegram.messenger.g0.L(20.0f) && ee0Var.z1()) {
                    org.telegram.messenger.g0.v1(ee0Var.fragmentView);
                }
                if (i7 <= org.telegram.messenger.g0.L(20.0f) && (sd0Var = ee0Var.U) != null) {
                    sd0Var.run();
                    ee0Var.U = null;
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
