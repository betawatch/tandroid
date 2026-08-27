package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class uj implements Runnable {
    public final /* synthetic */ rn a;

    public uj(rn rnVar) {
        this.a = rnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rn rnVar = this.a;
        MessageObject messageObject = rnVar.Z4;
        if (messageObject == null || rnVar.P8 == null) {
            return;
        }
        int max = Math.max(0, messageObject.messageOwner.ttl_period - (rnVar.getConnectionsManager().getCurrentTime() - rnVar.Z4.messageOwner.date));
        rnVar.P8.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, max < 86400 ? AndroidUtilities.formatDuration(max, false, true) : LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0])));
        AndroidUtilities.runOnUIThread(rnVar.Q8, 1000L);
    }
}
