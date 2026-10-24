package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qh implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ sn b;
    public final /* synthetic */ int c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ qh(sn snVar, int i10, MessageObject messageObject) {
        this.b = snVar;
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
                sn snVar = this.b;
                org.telegram.ui.Components.xc.a0(snVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.c).disableAds(false);
                MessageObject messageObject = this.d;
                snVar.Ja(messageObject);
                snVar.La(messageObject);
                break;
        }
    }

    public /* synthetic */ qh(sn snVar, MessageObject messageObject, int i10) {
        this.b = snVar;
        this.d = messageObject;
        this.c = i10;
    }
}
