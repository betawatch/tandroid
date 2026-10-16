package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ud0 implements org.telegram.ui.Components.nw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 b;

    public /* synthetic */ ud0(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.a = i10;
        this.b = m2Var;
    }

    @Override // org.telegram.ui.Components.nw0
    public final void H(int i10, boolean z10) {
        pg0 pg0Var;
        sl0 sl0Var;
        switch (this.a) {
            case 0:
                ah0 ah0Var = (ah0) this.b;
                if (i10 > AndroidUtilities.dp(20.0f) && ah0Var.h1()) {
                    AndroidUtilities.hideKeyboard(ah0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (pg0Var = ah0Var.T) != null) {
                    pg0Var.run();
                    ah0Var.T = null;
                    break;
                }
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (sl0Var = passcodeActivity.T) != null) {
                    sl0Var.run();
                    passcodeActivity.T = null;
                    break;
                }
                break;
        }
    }
}
