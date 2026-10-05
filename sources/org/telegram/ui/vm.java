package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kn b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ vm(kn knVar, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = knVar;
        this.c = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kn knVar = this.b;
                yn ynVar = knVar.a;
                ynVar.Q7();
                UndoView undoView = ynVar.w3;
                if (undoView != null) {
                    int i10 = (ynVar.W.getVisibility() != 0 || ynVar.P.getVisibility() == 0) ? 17 : 16;
                    MessageObject messageObject = this.c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new vm(knVar, messageObject, 2));
                    break;
                }
                break;
            case 1:
                yn ynVar2 = this.b.a;
                ynVar2.tb = this.c.getId();
                ynVar2.ub = 0;
                break;
            default:
                yn ynVar3 = this.b.a;
                if (ynVar3.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.c.getDiceEmoji(), ynVar3.R5, ynVar3.l5, ynVar3.V3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = ynVar3.D8();
                    ynVar3.getSendMessagesHelper().sendMessage(of2);
                    break;
                }
                break;
        }
    }
}
