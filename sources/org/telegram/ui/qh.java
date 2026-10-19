package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class qh implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ qn b;
    public final /* synthetic */ int c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ qh(qn qnVar, int i10, MessageObject messageObject) {
        this.b = qnVar;
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
                qn qnVar = this.b;
                org.telegram.ui.Components.xc.a0(qnVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.c).disableAds(false);
                MessageObject messageObject = this.d;
                qnVar.Ja(messageObject);
                qnVar.La(messageObject);
                break;
        }
    }

    public /* synthetic */ qh(qn qnVar, MessageObject messageObject, int i10) {
        this.b = qnVar;
        this.d = messageObject;
        this.c = i10;
    }
}
