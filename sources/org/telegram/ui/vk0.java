package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasscodeActivity b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ vk0(PasscodeActivity passcodeActivity, boolean z10, int i9) {
        this.a = i9;
        this.b = passcodeActivity;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                PasscodeActivity passcodeActivity = this.b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    fb0 fb0Var = passcodeActivity.M;
                    if (fb0Var != null) {
                        AndroidUtilities.runOnUIThread(fb0Var);
                        passcodeActivity.M = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                break;
            default:
                PasscodeActivity passcodeActivity2 = this.b;
                passcodeActivity2.w.e(true, this.c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.L);
                break;
        }
    }
}
