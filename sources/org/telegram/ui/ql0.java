package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ql0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ org.telegram.ui.ActionBar.f1 a;
    public final /* synthetic */ PasscodeActivity b;

    public ql0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.f1 f1Var) {
        this.b = passcodeActivity;
        this.a = f1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        if (i10 == 1) {
            passcodeActivity.y = passcodeActivity.y != 0 ? 0 : 1;
            AndroidUtilities.runOnUIThread(new fj0(6, this, this.a), 150L);
            passcodeActivity.h.setText("");
            for (gs gsVar : passcodeActivity.n.f) {
                gsVar.setText("");
            }
            passcodeActivity.l0();
        }
    }
}
