package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class rd0 implements org.telegram.ui.Components.zv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 b;

    public /* synthetic */ rd0(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.a = i10;
        this.b = p2Var;
    }

    @Override // org.telegram.ui.Components.zv0
    public final void H(int i10, boolean z10) {
        lg0 lg0Var;
        ml0 ml0Var;
        switch (this.a) {
            case 0:
                xg0 xg0Var = (xg0) this.b;
                if (i10 > AndroidUtilities.dp(20.0f) && xg0Var.h1()) {
                    AndroidUtilities.hideKeyboard(xg0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (lg0Var = xg0Var.T) != null) {
                    lg0Var.run();
                    xg0Var.T = null;
                    break;
                }
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (ml0Var = passcodeActivity.P) != null) {
                    ml0Var.run();
                    passcodeActivity.P = null;
                    break;
                }
                break;
        }
    }
}
