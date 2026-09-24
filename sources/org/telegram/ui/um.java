package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class um implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ in b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ um(in inVar, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = inVar;
        this.c = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                in inVar = this.b;
                wn wnVar = inVar.a;
                wnVar.Q7();
                UndoView undoView = wnVar.y3;
                if (undoView != null) {
                    int i10 = (wnVar.Y.getVisibility() != 0 || wnVar.R.getVisibility() == 0) ? 17 : 16;
                    MessageObject messageObject = this.c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new um(inVar, messageObject, 2));
                    break;
                }
                break;
            case 1:
                wn wnVar2 = this.b.a;
                wnVar2.vb = this.c.getId();
                wnVar2.wb = 0;
                break;
            default:
                wn wnVar3 = this.b.a;
                if (wnVar3.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.c.getDiceEmoji(), wnVar3.T5, wnVar3.n5, wnVar3.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = wnVar3.C8();
                    wnVar3.getSendMessagesHelper().sendMessage(of2);
                    break;
                }
                break;
        }
    }
}
