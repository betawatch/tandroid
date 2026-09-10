package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class s30 implements Runnable {
    public final /* synthetic */ j60 a;

    public s30(j60 j60Var) {
        this.a = j60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j60 j60Var = this.a;
        org.telegram.ui.ActionBar.l5 l5Var = j60Var.U;
        o50 o50Var = j60Var.V;
        if (o50Var == null || j60Var.isDismissed()) {
            return;
        }
        ChatObject.Call call = j60Var.a1;
        int i10 = call != null ? call.call.schedule_date : j60Var.k2;
        if (i10 == 0) {
            return;
        }
        int currentTime = i10 - j60Var.d.getConnectionsManager().getCurrentTime();
        if (currentTime >= 86400) {
            o50Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
        } else {
            o50Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
            if (currentTime < 0 && l5Var.getTag() == null) {
                l5Var.setTag(1);
                l5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
            }
        }
        j60Var.W.l(LocaleController.formatStartsTime(i10, 3), false);
        AndroidUtilities.runOnUIThread(j60Var.w2, 1000L);
    }
}
