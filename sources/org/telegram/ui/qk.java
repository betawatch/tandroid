package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
