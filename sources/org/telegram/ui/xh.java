package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class xh implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ xn b;
    public final /* synthetic */ int c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ xh(xn xnVar, int i10, MessageObject messageObject) {
        this.b = xnVar;
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
                xn xnVar = this.b;
                org.telegram.ui.Components.xc.a0(xnVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.c).disableAds(false);
                MessageObject messageObject = this.d;
                xnVar.Fa(messageObject);
                xnVar.Ha(messageObject);
                break;
        }
    }

    public /* synthetic */ xh(xn xnVar, MessageObject messageObject, int i10) {
        this.b = xnVar;
        this.d = messageObject;
        this.c = i10;
    }
}
