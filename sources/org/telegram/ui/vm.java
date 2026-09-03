package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jn b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ vm(jn jnVar, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = jnVar;
        this.c = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jn jnVar = this.b;
                xn xnVar = jnVar.a;
                xnVar.Q7();
                UndoView undoView = xnVar.v3;
                if (undoView != null) {
                    int i10 = (xnVar.V.getVisibility() != 0 || xnVar.O.getVisibility() == 0) ? 17 : 16;
                    MessageObject messageObject = this.c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new vm(jnVar, messageObject, 2));
                    break;
                }
                break;
            case 1:
                xn xnVar2 = this.b.a;
                xnVar2.tb = this.c.getId();
                xnVar2.ub = 0;
                break;
            default:
                xn xnVar3 = this.b.a;
                if (xnVar3.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.c.getDiceEmoji(), xnVar3.Q5, xnVar3.k5, xnVar3.U3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = xnVar3.C8();
                    xnVar3.getSendMessagesHelper().sendMessage(of2);
                    break;
                }
                break;
        }
    }
}
