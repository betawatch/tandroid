package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasscodeActivity b;

    public /* synthetic */ uk0(PasscodeActivity passcodeActivity, int i10) {
        this.a = i10;
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
                jb0 jb0Var = passcodeActivity3.M;
                if (jb0Var != null) {
                    AndroidUtilities.runOnUIThread(jb0Var);
                    passcodeActivity3.M = null;
                    break;
                }
                break;
            case 2:
                PasscodeActivity passcodeActivity4 = this.b;
                AndroidUtilities.runOnUIThread(new uk0(passcodeActivity4, 3), passcodeActivity4.e0() ? 150L : 1000L);
                break;
            case 3:
                PasscodeActivity passcodeActivity5 = this.b;
                if (passcodeActivity5.e0()) {
                    for (wr wrVar : passcodeActivity5.n.f) {
                        wrVar.i(0.0f);
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
                this.b.k0();
                break;
        }
    }
}
