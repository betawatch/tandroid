package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qh implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ rn b;
    public final /* synthetic */ int c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ qh(rn rnVar, int i10, MessageObject messageObject) {
        this.b = rnVar;
        this.c = i10;
        this.d = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.j4 = null;
                this.d.messageOwner.replies.read_max_id = this.c;
                break;
            default:
                rn rnVar = this.b;
                org.telegram.ui.Components.mc.a0(rnVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.c).disableAds(false);
                MessageObject messageObject = this.d;
                rnVar.Fa(messageObject);
                rnVar.Ha(messageObject);
                break;
        }
    }

    public /* synthetic */ qh(rn rnVar, MessageObject messageObject, int i10) {
        this.b = rnVar;
        this.d = messageObject;
        this.c = i10;
    }
}
