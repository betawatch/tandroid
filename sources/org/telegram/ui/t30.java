package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class t30 implements Runnable {
    public final /* synthetic */ k60 a;

    public t30(k60 k60Var) {
        this.a = k60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k60 k60Var = this.a;
        org.telegram.ui.ActionBar.k5 k5Var = k60Var.U;
        p50 p50Var = k60Var.V;
        if (p50Var == null || k60Var.isDismissed()) {
            return;
        }
        ChatObject.Call call = k60Var.a1;
        int i10 = call != null ? call.call.schedule_date : k60Var.k2;
        if (i10 == 0) {
            return;
        }
        int currentTime = i10 - k60Var.d.getConnectionsManager().getCurrentTime();
        if (currentTime >= 86400) {
            p50Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
        } else {
            p50Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
            if (currentTime < 0 && k5Var.getTag() == null) {
                k5Var.setTag(1);
                k5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
            }
        }
        k60Var.W.l(LocaleController.formatStartsTime(i10, 3), false);
        AndroidUtilities.runOnUIThread(k60Var.w2, 1000L);
    }
}
