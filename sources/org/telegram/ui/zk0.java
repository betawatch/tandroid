package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasscodeActivity b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ zk0(PasscodeActivity passcodeActivity, boolean z4, int i10) {
        this.a = i10;
        this.b = passcodeActivity;
        this.c = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                PasscodeActivity passcodeActivity = this.b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    qb0 qb0Var = passcodeActivity.N;
                    if (qb0Var != null) {
                        AndroidUtilities.runOnUIThread(qb0Var);
                        passcodeActivity.N = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                break;
            default:
                PasscodeActivity passcodeActivity2 = this.b;
                passcodeActivity2.w.e(true, this.c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.M);
                break;
        }
    }
}
