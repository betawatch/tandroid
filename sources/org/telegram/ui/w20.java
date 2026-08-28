package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w20 implements Runnable {
    public final /* synthetic */ o50 a;

    public w20(o50 o50Var) {
        this.a = o50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o50 o50Var = this.a;
        org.telegram.ui.ActionBar.h5 h5Var = o50Var.Q;
        t40 t40Var = o50Var.R;
        if (t40Var == null || o50Var.isDismissed()) {
            return;
        }
        ChatObject.Call call = o50Var.W0;
        int i9 = call != null ? call.call.schedule_date : o50Var.g2;
        if (i9 == 0) {
            return;
        }
        int currentTime = i9 - o50Var.d.getConnectionsManager().getCurrentTime();
        if (currentTime >= 86400) {
            t40Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
        } else {
            t40Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
            if (currentTime < 0 && h5Var.getTag() == null) {
                h5Var.setTag(1);
                h5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
            }
        }
        o50Var.S.l(LocaleController.formatStartsTime(i9, 3), false);
        AndroidUtilities.runOnUIThread(o50Var.s2, 1000L);
    }
}
