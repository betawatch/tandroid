package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class td0 implements org.telegram.ui.Components.pv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 b;

    public /* synthetic */ td0(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.a = i10;
        this.b = o2Var;
    }

    @Override // org.telegram.ui.Components.pv0
    public final void H(int i10, boolean z10) {
        ng0 ng0Var;
        ml0 ml0Var;
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
                if (i10 >= AndroidUtilities.dp(20.0f) && (ml0Var = passcodeActivity.P) != null) {
                    ml0Var.run();
                    passcodeActivity.P = null;
                    break;
                }
                break;
        }
    }
}
