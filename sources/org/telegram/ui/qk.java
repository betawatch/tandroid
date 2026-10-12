package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class qk implements Runnable {
    public final /* synthetic */ fo a;

    public qk(fo foVar) {
        this.a = foVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fo foVar = this.a;
        MessageObject messageObject = foVar.d5;
        if (messageObject == null || foVar.T8 == null) {
            return;
        }
        int max = Math.max(0, messageObject.messageOwner.ttl_period - (foVar.getConnectionsManager().getCurrentTime() - foVar.d5.messageOwner.date));
        foVar.T8.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, max < 86400 ? AndroidUtilities.formatDuration(max, false, true) : LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0])));
        AndroidUtilities.runOnUIThread(foVar.U8, 1000L);
    }
}
