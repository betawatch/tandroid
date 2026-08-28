package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ww0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PrivacySettingsActivity b;

    public /* synthetic */ ww0(PrivacySettingsActivity privacySettingsActivity, int i9) {
        this.a = i9;
        this.b = privacySettingsActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.b;
                privacySettingsActivity.a.l();
                privacySettingsActivity.N = true;
                break;
            case 1:
                this.b.c.dismiss();
                break;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.b;
                org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(privacySettingsActivity2.getParentActivity(), null);
                obVar.d(R.raw.email_check_inbox, new String[0]);
                obVar.b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.Components.gc.g(privacySettingsActivity2, obVar, 1500).j();
                try {
                    privacySettingsActivity2.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity2.y0();
                break;
        }
    }
}
