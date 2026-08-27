package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class z20 implements Runnable {
    public final /* synthetic */ s50 a;

    public z20(s50 s50Var) {
        this.a = s50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s50 s50Var = this.a;
        org.telegram.ui.ActionBar.h5 h5Var = s50Var.Q;
        x40 x40Var = s50Var.R;
        if (x40Var == null || s50Var.isDismissed()) {
            return;
        }
        ChatObject.Call call = s50Var.W0;
        int i10 = call != null ? call.call.schedule_date : s50Var.g2;
        if (i10 == 0) {
            return;
        }
        int currentTime = i10 - s50Var.d.getConnectionsManager().getCurrentTime();
        if (currentTime >= 86400) {
            x40Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
        } else {
            x40Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
            if (currentTime < 0 && h5Var.getTag() == null) {
                h5Var.setTag(1);
                h5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
            }
        }
        s50Var.S.l(LocaleController.formatStartsTime(i10, 3), false);
        AndroidUtilities.runOnUIThread(s50Var.s2, 1000L);
    }
}
