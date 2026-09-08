package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class r30 implements Runnable {
    public final /* synthetic */ j60 a;

    public r30(j60 j60Var) {
        this.a = j60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j60 j60Var = this.a;
        org.telegram.ui.ActionBar.j5 j5Var = j60Var.U;
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
            if (currentTime < 0 && j5Var.getTag() == null) {
                j5Var.setTag(1);
                j5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
            }
        }
        j60Var.W.l(LocaleController.formatStartsTime(i10, 3), false);
        AndroidUtilities.runOnUIThread(j60Var.w2, 1000L);
    }
}
