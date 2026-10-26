package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fn b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ rm(fn fnVar, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = fnVar;
        this.c = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fn fnVar = this.b;
                un unVar = fnVar.a;
                unVar.X7();
                UndoView undoView = unVar.K3;
                if (undoView != null) {
                    int i10 = (unVar.Y.getVisibility() != 0 || unVar.R.getVisibility() == 0) ? 17 : 16;
                    MessageObject messageObject = this.c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new rm(fnVar, messageObject, 2));
                    break;
                }
                break;
            case 1:
                un unVar2 = this.b.a;
                unVar2.Sb = this.c.getId();
                unVar2.Tb = 0;
                break;
            default:
                un unVar3 = this.b.a;
                if (unVar3.m7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.c.getDiceEmoji(), unVar3.f6, unVar3.z5, unVar3.j4, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = unVar3.L8();
                    unVar3.getSendMessagesHelper().sendMessage(of2);
                    break;
                }
                break;
        }
    }
}
