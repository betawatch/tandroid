package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class td0 implements org.telegram.ui.Components.zv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 b;

    public /* synthetic */ td0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = i10;
        this.b = n2Var;
    }

    @Override // org.telegram.ui.Components.zv0
    public final void H(int i10, boolean z10) {
        ng0 ng0Var;
        nl0 nl0Var;
        switch (this.a) {
            case 0:
                yg0 yg0Var = (yg0) this.b;
                if (i10 > AndroidUtilities.dp(20.0f) && yg0Var.h1()) {
                    AndroidUtilities.hideKeyboard(yg0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (ng0Var = yg0Var.T) != null) {
                    ng0Var.run();
                    yg0Var.T = null;
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
