package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yc0 implements org.telegram.ui.Components.iw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 b;

    public /* synthetic */ yc0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = i10;
        this.b = n2Var;
    }

    @Override // org.telegram.ui.Components.iw0
    public final void H(int i10, boolean z10) {
        uf0 uf0Var;
        zk0 zk0Var;
        switch (this.a) {
            case 0:
                fg0 fg0Var = (fg0) this.b;
                if (i10 > AndroidUtilities.dp(20.0f) && fg0Var.h1()) {
                    AndroidUtilities.hideKeyboard(fg0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (uf0Var = fg0Var.T) != null) {
                    uf0Var.run();
                    fg0Var.T = null;
                    break;
                }
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (zk0Var = passcodeActivity.T) != null) {
                    zk0Var.run();
                    passcodeActivity.T = null;
                    break;
                }
                break;
        }
    }
}
