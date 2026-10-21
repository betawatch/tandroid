package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wc0 implements org.telegram.ui.Components.kw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 b;

    public /* synthetic */ wc0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = i10;
        this.b = n2Var;
    }

    @Override // org.telegram.ui.Components.kw0
    public final void G(int i10, boolean z10) {
        sf0 sf0Var;
        xk0 xk0Var;
        switch (this.a) {
            case 0:
                dg0 dg0Var = (dg0) this.b;
                if (i10 > AndroidUtilities.dp(20.0f) && dg0Var.h1()) {
                    AndroidUtilities.hideKeyboard(dg0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (sf0Var = dg0Var.T) != null) {
                    sf0Var.run();
                    dg0Var.T = null;
                    break;
                }
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (xk0Var = passcodeActivity.T) != null) {
                    xk0Var.run();
                    passcodeActivity.T = null;
                    break;
                }
                break;
        }
    }
}
