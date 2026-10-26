package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yc0 implements org.telegram.ui.Components.uw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 b;

    public /* synthetic */ yc0(int i10, org.telegram.ui.ActionBar.r2 r2Var) {
        this.a = i10;
        this.b = r2Var;
    }

    @Override // org.telegram.ui.Components.uw0
    public final void I(int i10, boolean z10) {
        uf0 uf0Var;
        gl0 gl0Var;
        switch (this.a) {
            case 0:
                gg0 gg0Var = (gg0) this.b;
                if (i10 > AndroidUtilities.dp(20.0f) && gg0Var.m1()) {
                    AndroidUtilities.hideKeyboard(gg0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (uf0Var = gg0Var.T) != null) {
                    uf0Var.run();
                    gg0Var.T = null;
                    break;
                }
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (gl0Var = passcodeActivity.T) != null) {
                    gl0Var.run();
                    passcodeActivity.T = null;
                    break;
                }
                break;
        }
    }
}
