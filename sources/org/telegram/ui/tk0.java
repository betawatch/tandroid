package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class tk0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ org.telegram.ui.ActionBar.g1 a;
    public final /* synthetic */ PasscodeActivity b;

    public tk0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.g1 g1Var) {
        this.b = passcodeActivity;
        this.a = g1Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        if (i10 == 1) {
            passcodeActivity.y = passcodeActivity.y != 0 ? 0 : 1;
            AndroidUtilities.runOnUIThread(new lf0(9, this, this.a), 150L);
            passcodeActivity.h.setText("");
            for (ur urVar : passcodeActivity.n.f) {
                urVar.setText("");
            }
            passcodeActivity.l0();
        }
    }
}
