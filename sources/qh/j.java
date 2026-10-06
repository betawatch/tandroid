package qh;

import ai.a3;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h61;
import org.telegram.ui.web.u0;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ j(p pVar, int i10) {
        this.a = i10;
        this.b = pVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10 = this.a;
        int i11 = 0;
        p pVar = this.b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.clear();
                ArrayList arrayList2 = pVar.j;
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long peerDialogId = DialogObject.getPeerDialogId(messagePeerVote.peer);
                    TLObject userOrChat = MessagesController.getInstance(pVar.a).getUserOrChat(peerDialogId);
                    int i12 = messagePeerVote.date;
                    a3 a3Var = new a3(pVar, peerDialogId, 3);
                    int i13 = m.a;
                    h61 K = h61.K(m.class);
                    K.G = userOrChat;
                    K.B = peerDialogId;
                    K.z = i12;
                    K.D = a3Var;
                    arrayList.add(K);
                }
                if (!pVar.h) {
                    if (!arrayList2.isEmpty()) {
                        int i14 = o.a;
                        arrayList.add(h61.K(o.class));
                        break;
                    } else {
                        int i15 = n.a;
                        arrayList.add(h61.K(n.class));
                        arrayList.add(h61.K(n.class));
                        arrayList.add(h61.K(n.class));
                        arrayList.add(h61.K(n.class));
                        arrayList.add(h61.K(n.class));
                        break;
                    }
                }
                break;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                int i16 = pVar.a;
                pVar.i = false;
                if (tL_messages_votesList == null) {
                    pVar.g = null;
                    pVar.h = true;
                    break;
                } else {
                    MessagesController.getInstance(i16).putUsers(tL_messages_votesList.users, false);
                    MessagesController.getInstance(i16).putChats(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    pVar.g = str;
                    pVar.h = str == null;
                    pVar.j.addAll(tL_messages_votesList.votes);
                    u0 u0Var = pVar.e;
                    if (u0Var != null) {
                        u0Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
