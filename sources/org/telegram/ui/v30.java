package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class v30 implements Runnable {
    public final /* synthetic */ n60 a;

    public v30(n60 n60Var) {
        this.a = n60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n60 n60Var = this.a;
        org.telegram.ui.ActionBar.h5 h5Var = n60Var.U;
        s50 s50Var = n60Var.V;
        if (s50Var == null || n60Var.isDismissed()) {
            return;
        }
        ChatObject.Call call = n60Var.a1;
        int i10 = call != null ? call.call.schedule_date : n60Var.k2;
        if (i10 == 0) {
            return;
        }
        int currentTime = i10 - n60Var.d.getConnectionsManager().getCurrentTime();
        if (currentTime >= 86400) {
            s50Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
        } else {
            s50Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
            if (currentTime < 0 && h5Var.getTag() == null) {
                h5Var.setTag(1);
                h5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
            }
        }
        n60Var.W.l(LocaleController.formatStartsTime(i10, 3), false);
        AndroidUtilities.runOnUIThread(n60Var.w2, 1000L);
    }
}
