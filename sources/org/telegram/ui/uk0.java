package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasscodeActivity b;

    public /* synthetic */ uk0(PasscodeActivity passcodeActivity, int i9) {
        this.a = i9;
        this.b = passcodeActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                PasscodeActivity passcodeActivity = this.b;
                passcodeActivity.n.postDelayed(passcodeActivity.K, 3000L);
                passcodeActivity.J = true;
                break;
            case 1:
                PasscodeActivity passcodeActivity2 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity3 = this.b;
                passcodeActivity3.presentFragment(passcodeActivity2, true);
                fb0 fb0Var = passcodeActivity3.M;
                if (fb0Var != null) {
                    AndroidUtilities.runOnUIThread(fb0Var);
                    passcodeActivity3.M = null;
                    break;
                }
                break;
            case 2:
                PasscodeActivity passcodeActivity4 = this.b;
                AndroidUtilities.runOnUIThread(new uk0(passcodeActivity4, 3), passcodeActivity4.d0() ? 150L : 1000L);
                break;
            case 3:
                PasscodeActivity passcodeActivity5 = this.b;
                if (passcodeActivity5.d0()) {
                    for (vr vrVar : passcodeActivity5.n.f) {
                        vrVar.i(0.0f);
                    }
                    break;
                } else {
                    passcodeActivity5.f.a(0.0f);
                    break;
                }
            case 4:
                PasscodeActivity passcodeActivity6 = this.b;
                passcodeActivity6.J = false;
                AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity6.r, false);
                break;
            default:
                this.b.j0();
                break;
        }
    }
}
