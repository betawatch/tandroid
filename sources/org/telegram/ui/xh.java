package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xh implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ wn b;
    public final /* synthetic */ int c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ xh(wn wnVar, int i10, MessageObject messageObject) {
        this.b = wnVar;
        this.c = i10;
        this.d = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.n4 = null;
                this.d.messageOwner.replies.read_max_id = this.c;
                break;
            default:
                wn wnVar = this.b;
                org.telegram.ui.Components.xc.a0(wnVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.c).disableAds(false);
                MessageObject messageObject = this.d;
                wnVar.Fa(messageObject);
                wnVar.Ha(messageObject);
                break;
        }
    }

    public /* synthetic */ xh(wn wnVar, MessageObject messageObject, int i10) {
        this.b = wnVar;
        this.d = messageObject;
        this.c = i10;
    }
}
