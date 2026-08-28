package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yc0 implements org.telegram.ui.Components.wu0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 b;

    public /* synthetic */ yc0(int i9, org.telegram.ui.ActionBar.o2 o2Var) {
        this.a = i9;
        this.b = o2Var;
    }

    @Override // org.telegram.ui.Components.wu0
    public final void G(int i9, boolean z10) {
        uf0 uf0Var;
        vk0 vk0Var;
        switch (this.a) {
            case 0:
                fg0 fg0Var = (fg0) this.b;
                if (i9 > AndroidUtilities.dp(20.0f) && fg0Var.h1()) {
                    AndroidUtilities.hideKeyboard(fg0Var.fragmentView);
                }
                if (i9 <= AndroidUtilities.dp(20.0f) && (uf0Var = fg0Var.P) != null) {
                    uf0Var.run();
                    fg0Var.P = null;
                    break;
                }
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                if (i9 >= AndroidUtilities.dp(20.0f) && (vk0Var = passcodeActivity.L) != null) {
                    vk0Var.run();
                    passcodeActivity.L = null;
                    break;
                }
                break;
        }
    }
}
