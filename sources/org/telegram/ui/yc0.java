package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
        tf0 tf0Var;
        zk0 zk0Var;
        switch (this.a) {
            case 0:
                eg0 eg0Var = (eg0) this.b;
                if (i10 > AndroidUtilities.dp(20.0f) && eg0Var.h1()) {
                    AndroidUtilities.hideKeyboard(eg0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (tf0Var = eg0Var.T) != null) {
                    tf0Var.run();
                    eg0Var.T = null;
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
