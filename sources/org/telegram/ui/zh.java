package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class zh implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ yn b;
    public final /* synthetic */ int c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ zh(yn ynVar, int i10, MessageObject messageObject) {
        this.b = ynVar;
        this.c = i10;
        this.d = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.l4 = null;
                this.d.messageOwner.replies.read_max_id = this.c;
                break;
            default:
                yn ynVar = this.b;
                org.telegram.ui.Components.yc.a0(ynVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.c).disableAds(false);
                MessageObject messageObject = this.d;
                ynVar.Ea(messageObject);
                ynVar.Ga(messageObject);
                break;
        }
    }

    public /* synthetic */ zh(yn ynVar, MessageObject messageObject, int i10) {
        this.b = ynVar;
        this.d = messageObject;
        this.c = i10;
    }
}
