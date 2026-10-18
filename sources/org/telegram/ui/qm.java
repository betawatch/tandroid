package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ en b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ qm(en enVar, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = enVar;
        this.c = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                en enVar = this.b;
                sn snVar = enVar.a;
                snVar.T7();
                UndoView undoView = snVar.y3;
                if (undoView != null) {
                    int i10 = (snVar.Y.getVisibility() != 0 || snVar.R.getVisibility() == 0) ? 17 : 16;
                    MessageObject messageObject = this.c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new qm(enVar, messageObject, 2));
                    break;
                }
                break;
            case 1:
                sn snVar2 = this.b.a;
                snVar2.wb = this.c.getId();
                snVar2.xb = 0;
                break;
            default:
                sn snVar3 = this.b.a;
                if (snVar3.i7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.c.getDiceEmoji(), snVar3.T5, snVar3.n5, snVar3.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = snVar3.H8();
                    snVar3.getSendMessagesHelper().sendMessage(of2);
                    break;
                }
                break;
        }
    }
}
