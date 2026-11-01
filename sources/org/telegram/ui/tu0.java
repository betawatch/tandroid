package org.telegram.ui;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PrivacySettingsActivity b;

    public /* synthetic */ tu0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.a = i10;
        this.b = privacySettingsActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        PrivacySettingsActivity privacySettingsActivity = this.b;
        switch (i10) {
            case 0:
                privacySettingsActivity.a.f();
                privacySettingsActivity.R = true;
                break;
            case 1:
                privacySettingsActivity.c.dismiss();
                break;
            default:
                org.telegram.ui.Components.eb ebVar = new org.telegram.ui.Components.eb(privacySettingsActivity.getParentActivity(), null);
                ebVar.d(R.raw.email_check_inbox, new String[0]);
                ebVar.b.setText(org.telegram.messenger.dd.L0(2131742836, null));
                org.telegram.ui.Components.wb.g(privacySettingsActivity, ebVar, 1500).j();
                try {
                    privacySettingsActivity.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity.E0();
                break;
        }
    }
}
