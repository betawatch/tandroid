package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class th implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ wn b;
    public final /* synthetic */ int c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ th(wn wnVar, int i10, MessageObject messageObject) {
        this.b = wnVar;
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
                wn wnVar = this.b;
                org.telegram.ui.Components.wc.b0(wnVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.c).disableAds(false);
                MessageObject messageObject = this.d;
                wnVar.Ra(messageObject);
                wnVar.Ta(messageObject);
                break;
        }
    }

    public /* synthetic */ th(wn wnVar, MessageObject messageObject, int i10) {
        this.b = wnVar;
        this.d = messageObject;
        this.c = i10;
    }
}
