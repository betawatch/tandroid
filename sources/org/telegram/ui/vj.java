package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class vj implements Runnable {
    public final /* synthetic */ tn a;

    public vj(tn tnVar) {
        this.a = tnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tn tnVar = this.a;
        MessageObject messageObject = tnVar.Z4;
        if (messageObject == null || tnVar.P8 == null) {
            return;
        }
        int max = Math.max(0, messageObject.messageOwner.ttl_period - (tnVar.getConnectionsManager().getCurrentTime() - tnVar.Z4.messageOwner.date));
        tnVar.P8.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, max < 86400 ? AndroidUtilities.formatDuration(max, false, true) : LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0])));
        AndroidUtilities.runOnUIThread(tnVar.Q8, 1000L);
    }
}
