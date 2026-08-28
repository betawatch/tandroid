package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class sj implements Runnable {
    public final /* synthetic */ qn a;

    public sj(qn qnVar) {
        this.a = qnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qn qnVar = this.a;
        MessageObject messageObject = qnVar.Z4;
        if (messageObject == null || qnVar.P8 == null) {
            return;
        }
        int max = Math.max(0, messageObject.messageOwner.ttl_period - (qnVar.getConnectionsManager().getCurrentTime() - qnVar.Z4.messageOwner.date));
        qnVar.P8.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, max < 86400 ? AndroidUtilities.formatDuration(max, false, true) : LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0])));
        AndroidUtilities.runOnUIThread(qnVar.Q8, 1000L);
    }
}
