package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sh implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ un b;
    public final /* synthetic */ int c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ sh(un unVar, int i10, MessageObject messageObject) {
        this.b = unVar;
        this.c = i10;
        this.d = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.z4 = null;
                this.d.messageOwner.replies.read_max_id = this.c;
                break;
            default:
                un unVar = this.b;
                org.telegram.ui.Components.wc.b0(unVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.c).disableAds(false);
                MessageObject messageObject = this.d;
                unVar.Oa(messageObject);
                unVar.Qa(messageObject);
                break;
        }
    }

    public /* synthetic */ sh(un unVar, MessageObject messageObject, int i10) {
        this.b = unVar;
        this.d = messageObject;
        this.c = i10;
    }
}
