package yg;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l41;
import pf.o1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ j(p pVar, int i9) {
        this.a = i9;
        this.b = pVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i9 = this.a;
        int i10 = 0;
        p pVar = this.b;
        switch (i9) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.clear();
                ArrayList arrayList2 = pVar.j;
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj3 = arrayList2.get(i10);
                    i10++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long peerDialogId = DialogObject.getPeerDialogId(messagePeerVote.peer);
                    TLObject userOrChat = MessagesController.getInstance(pVar.a).getUserOrChat(peerDialogId);
                    int i11 = messagePeerVote.date;
                    fh.p pVar2 = new fh.p(pVar, peerDialogId, 5);
                    int i12 = m.a;
                    l41 J = l41.J(m.class);
                    J.G = userOrChat;
                    J.B = peerDialogId;
                    J.z = i11;
                    J.D = pVar2;
                    arrayList.add(J);
                }
                if (!pVar.h) {
                    if (!arrayList2.isEmpty()) {
                        int i13 = o.a;
                        arrayList.add(l41.J(o.class));
                        break;
                    } else {
                        int i14 = n.a;
                        arrayList.add(l41.J(n.class));
                        arrayList.add(l41.J(n.class));
                        arrayList.add(l41.J(n.class));
                        arrayList.add(l41.J(n.class));
                        arrayList.add(l41.J(n.class));
                        break;
                    }
                }
                break;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                int i15 = pVar.a;
                pVar.i = false;
                if (tL_messages_votesList == null) {
                    pVar.g = null;
                    pVar.h = true;
                    break;
                } else {
                    MessagesController.getInstance(i15).putUsers(tL_messages_votesList.users, false);
                    MessagesController.getInstance(i15).putChats(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    pVar.g = str;
                    pVar.h = str == null;
                    pVar.j.addAll(tL_messages_votesList.votes);
                    o1 o1Var = pVar.e;
                    if (o1Var != null) {
                        o1Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
