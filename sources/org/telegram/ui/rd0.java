package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rd0 implements org.telegram.ui.Components.ov0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 b;

    public /* synthetic */ rd0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = i10;
        this.b = n2Var;
    }

    @Override // org.telegram.ui.Components.ov0
    public final void H(int i10, boolean z10) {
        lg0 lg0Var;
        kl0 kl0Var;
        switch (this.a) {
            case 0:
                wg0 wg0Var = (wg0) this.b;
                if (i10 > AndroidUtilities.dp(20.0f) && wg0Var.h1()) {
                    AndroidUtilities.hideKeyboard(wg0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (lg0Var = wg0Var.T) != null) {
                    lg0Var.run();
                    wg0Var.T = null;
                    break;
                }
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (kl0Var = passcodeActivity.P) != null) {
                    kl0Var.run();
                    passcodeActivity.P = null;
                    break;
                }
                break;
        }
    }
}
