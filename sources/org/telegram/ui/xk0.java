package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xk0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ org.telegram.ui.ActionBar.g1 a;
    public final /* synthetic */ PasscodeActivity b;

    public xk0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.g1 g1Var) {
        this.b = passcodeActivity;
        this.a = g1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i9) {
        PasscodeActivity passcodeActivity = this.b;
        if (i9 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        if (i9 == 1) {
            passcodeActivity.y = passcodeActivity.y != 0 ? 0 : 1;
            AndroidUtilities.runOnUIThread(new cf0(12, this, this.a), 150L);
            passcodeActivity.h.setText("");
            for (vr vrVar : passcodeActivity.n.f) {
                vrVar.setText("");
            }
            passcodeActivity.k0();
        }
    }
}
