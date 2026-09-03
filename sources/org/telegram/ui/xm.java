package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ln b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ xm(ln lnVar, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = lnVar;
        this.c = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ln lnVar = this.b;
                zn znVar = lnVar.a;
                znVar.Q7();
                UndoView undoView = znVar.v3;
                if (undoView != null) {
                    int i10 = (znVar.V.getVisibility() != 0 || znVar.O.getVisibility() == 0) ? 17 : 16;
                    MessageObject messageObject = this.c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new xm(lnVar, messageObject, 2));
                    break;
                }
                break;
            case 1:
                zn znVar2 = this.b.a;
                znVar2.tb = this.c.getId();
                znVar2.ub = 0;
                break;
            default:
                zn znVar3 = this.b.a;
                if (znVar3.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.c.getDiceEmoji(), znVar3.Q5, znVar3.k5, znVar3.U3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = znVar3.C8();
                    znVar3.getSendMessagesHelper().sendMessage(of2);
                    break;
                }
                break;
        }
    }
}
