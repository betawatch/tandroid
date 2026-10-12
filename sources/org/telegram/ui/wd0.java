package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class wd0 implements org.telegram.ui.Components.nw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 b;

    public /* synthetic */ wd0(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.a = i10;
        this.b = m2Var;
    }

    @Override // org.telegram.ui.Components.nw0
    public final void H(int i10, boolean z10) {
        qg0 qg0Var;
        tl0 tl0Var;
        switch (this.a) {
            case 0:
                bh0 bh0Var = (bh0) this.b;
                if (i10 > AndroidUtilities.dp(20.0f) && bh0Var.h1()) {
                    AndroidUtilities.hideKeyboard(bh0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (qg0Var = bh0Var.T) != null) {
                    qg0Var.run();
                    bh0Var.T = null;
                    break;
                }
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (tl0Var = passcodeActivity.T) != null) {
                    tl0Var.run();
                    passcodeActivity.T = null;
                    break;
                }
                break;
        }
    }
}
