package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uh implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ xn b;
    public final /* synthetic */ int c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ uh(xn xnVar, int i10, MessageObject messageObject) {
        this.b = xnVar;
        this.c = i10;
        this.d = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.k4 = null;
                this.d.messageOwner.replies.read_max_id = this.c;
                break;
            default:
                xn xnVar = this.b;
                org.telegram.ui.Components.qc.a0(xnVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.c).disableAds(false);
                MessageObject messageObject = this.d;
                xnVar.Fa(messageObject);
                xnVar.Ha(messageObject);
                break;
        }
    }

    public /* synthetic */ uh(xn xnVar, MessageObject messageObject, int i10) {
        this.b = xnVar;
        this.d = messageObject;
        this.c = i10;
    }
}
