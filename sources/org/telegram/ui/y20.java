package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class y20 implements Runnable {
    public final /* synthetic */ q50 a;

    public y20(q50 q50Var) {
        this.a = q50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q50 q50Var = this.a;
        org.telegram.ui.ActionBar.j5 j5Var = q50Var.U;
        v40 v40Var = q50Var.V;
        if (v40Var == null || q50Var.isDismissed()) {
            return;
        }
        ChatObject.Call call = q50Var.a1;
        int i10 = call != null ? call.call.schedule_date : q50Var.k2;
        if (i10 == 0) {
            return;
        }
        int currentTime = i10 - q50Var.d.getConnectionsManager().getCurrentTime();
        if (currentTime >= 86400) {
            v40Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
        } else {
            v40Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
            if (currentTime < 0 && j5Var.getTag() == null) {
                j5Var.setTag(1);
                j5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
            }
        }
        q50Var.W.l(LocaleController.formatStartsTime(i10, 3), false);
        AndroidUtilities.runOnUIThread(q50Var.w2, 1000L);
    }
}
