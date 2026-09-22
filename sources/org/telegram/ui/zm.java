package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nn b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ zm(nn nnVar, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = nnVar;
        this.c = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nn nnVar = this.b;
                bo boVar = nnVar.a;
                boVar.Q7();
                UndoView undoView = boVar.y3;
                if (undoView != null) {
                    int i10 = (boVar.Y.getVisibility() != 0 || boVar.R.getVisibility() == 0) ? 17 : 16;
                    MessageObject messageObject = this.c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new zm(nnVar, messageObject, 2));
                    break;
                }
                break;
            case 1:
                bo boVar2 = this.b.a;
                boVar2.vb = this.c.getId();
                boVar2.wb = 0;
                break;
            default:
                bo boVar3 = this.b.a;
                if (boVar3.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.c.getDiceEmoji(), boVar3.T5, boVar3.n5, boVar3.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = boVar3.C8();
                    boVar3.getSendMessagesHelper().sendMessage(of2);
                    break;
                }
                break;
        }
    }
}
