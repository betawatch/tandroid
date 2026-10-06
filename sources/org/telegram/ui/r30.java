package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class r30 implements Runnable {
    public final /* synthetic */ h60 a;

    public r30(h60 h60Var) {
        this.a = h60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h60 h60Var = this.a;
        org.telegram.ui.ActionBar.i5 i5Var = h60Var.U;
        n50 n50Var = h60Var.V;
        if (n50Var == null || h60Var.isDismissed()) {
            return;
        }
        ChatObject.Call call = h60Var.a1;
        int i10 = call != null ? call.call.schedule_date : h60Var.k2;
        if (i10 == 0) {
            return;
        }
        int currentTime = i10 - h60Var.d.getConnectionsManager().getCurrentTime();
        if (currentTime >= 86400) {
            n50Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
        } else {
            n50Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
            if (currentTime < 0 && i5Var.getTag() == null) {
                i5Var.setTag(1);
                i5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
            }
        }
        h60Var.W.l(LocaleController.formatStartsTime(i10, 3), false);
        AndroidUtilities.runOnUIThread(h60Var.w2, 1000L);
    }
}
