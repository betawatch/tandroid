package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class r30 implements Runnable {
    public final /* synthetic */ i60 a;

    public r30(i60 i60Var) {
        this.a = i60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i60 i60Var = this.a;
        org.telegram.ui.ActionBar.j5 j5Var = i60Var.U;
        n50 n50Var = i60Var.V;
        if (n50Var == null || i60Var.isDismissed()) {
            return;
        }
        ChatObject.Call call = i60Var.a1;
        int i10 = call != null ? call.call.schedule_date : i60Var.k2;
        if (i10 == 0) {
            return;
        }
        int currentTime = i10 - i60Var.d.getConnectionsManager().getCurrentTime();
        if (currentTime >= 86400) {
            n50Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
        } else {
            n50Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
            if (currentTime < 0 && j5Var.getTag() == null) {
                j5Var.setTag(1);
                j5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
            }
        }
        i60Var.W.l(LocaleController.formatStartsTime(i10, 3), false);
        AndroidUtilities.runOnUIThread(i60Var.w2, 1000L);
    }
}
