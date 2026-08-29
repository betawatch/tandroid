package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fn b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ qm(fn fnVar, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = fnVar;
        this.c = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fn fnVar = this.b;
                tn tnVar = fnVar.a;
                tnVar.Q7();
                UndoView undoView = tnVar.u3;
                if (undoView != null) {
                    int i10 = (tnVar.U.getVisibility() != 0 || tnVar.N.getVisibility() == 0) ? 17 : 16;
                    MessageObject messageObject = this.c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new qm(fnVar, messageObject, 2));
                    break;
                }
                break;
            case 1:
                tn tnVar2 = this.b.a;
                tnVar2.sb = this.c.getId();
                tnVar2.tb = 0;
                break;
            default:
                tn tnVar3 = this.b.a;
                if (tnVar3.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.c.getDiceEmoji(), tnVar3.P5, tnVar3.j5, tnVar3.T3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = tnVar3.C8();
                    tnVar3.getSendMessagesHelper().sendMessage(of2);
                    break;
                }
                break;
        }
    }
}
