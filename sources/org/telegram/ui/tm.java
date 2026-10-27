package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hn b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ tm(hn hnVar, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = hnVar;
        this.c = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hn hnVar = this.b;
                wn wnVar = hnVar.a;
                wnVar.Z7();
                UndoView undoView = wnVar.K3;
                if (undoView != null) {
                    int i10 = (wnVar.Y.getVisibility() != 0 || wnVar.R.getVisibility() == 0) ? 17 : 16;
                    MessageObject messageObject = this.c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new tm(hnVar, messageObject, 2));
                    break;
                }
                break;
            case 1:
                wn wnVar2 = this.b.a;
                wnVar2.Wb = this.c.getId();
                wnVar2.Xb = 0;
                break;
            default:
                wn wnVar3 = this.b.a;
                if (wnVar3.o7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.c.getDiceEmoji(), wnVar3.j6, wnVar3.D5, wnVar3.j4, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = wnVar3.O8();
                    wnVar3.getSendMessagesHelper().sendMessage(of2);
                    break;
                }
                break;
        }
    }
}
