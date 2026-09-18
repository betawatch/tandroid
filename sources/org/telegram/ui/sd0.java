package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sd0 implements org.telegram.ui.Components.aw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 b;

    public /* synthetic */ sd0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = i10;
        this.b = n2Var;
    }

    @Override // org.telegram.ui.Components.aw0
    public final void H(int i10, boolean z10) {
        mg0 mg0Var;
        nl0 nl0Var;
        switch (this.a) {
            case 0:
                xg0 xg0Var = (xg0) this.b;
                if (i10 > AndroidUtilities.dp(20.0f) && xg0Var.h1()) {
                    AndroidUtilities.hideKeyboard(xg0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (mg0Var = xg0Var.T) != null) {
                    mg0Var.run();
                    xg0Var.T = null;
                    break;
                }
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (nl0Var = passcodeActivity.P) != null) {
                    nl0Var.run();
                    passcodeActivity.P = null;
                    break;
                }
                break;
        }
    }
}
