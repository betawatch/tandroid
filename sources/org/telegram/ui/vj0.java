package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class vj0 extends org.telegram.ui.ActionBar.g5 {
    public final /* synthetic */ NotificationsCustomSettingsActivity r;

    public vj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.r = notificationsCustomSettingsActivity;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.r;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.a.setAdapter(notificationsCustomSettingsActivity.b);
        notificationsCustomSettingsActivity.b.l();
        notificationsCustomSettingsActivity.a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.c.setShowAtCenter(false);
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.r;
        notificationsCustomSettingsActivity.f = true;
        notificationsCustomSettingsActivity.c.setShowAtCenter(true);
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.r;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.a != null) {
                notificationsCustomSettingsActivity.c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.c.b();
                notificationsCustomSettingsActivity.a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
