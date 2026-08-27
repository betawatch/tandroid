package zg;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ k(q qVar, int i10) {
        this.a = i10;
        this.b = qVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10 = this.a;
        int i11 = 0;
        q qVar = this.b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.clear();
                ArrayList arrayList2 = qVar.j;
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long peerDialogId = DialogObject.getPeerDialogId(messagePeerVote.peer);
                    TLObject userOrChat = MessagesController.getInstance(qVar.a).getUserOrChat(peerDialogId);
                    int i12 = messagePeerVote.date;
                    gh.o oVar = new gh.o(qVar, peerDialogId, 5);
                    int i13 = n.a;
                    n41 J = n41.J(n.class);
                    J.G = userOrChat;
                    J.B = peerDialogId;
                    J.z = i12;
                    J.D = oVar;
                    arrayList.add(J);
                }
                if (!qVar.h) {
                    if (!arrayList2.isEmpty()) {
                        int i14 = p.a;
                        arrayList.add(n41.J(p.class));
                        break;
                    } else {
                        int i15 = o.a;
                        arrayList.add(n41.J(o.class));
                        arrayList.add(n41.J(o.class));
                        arrayList.add(n41.J(o.class));
                        arrayList.add(n41.J(o.class));
                        arrayList.add(n41.J(o.class));
                        break;
                    }
                }
                break;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                int i16 = qVar.a;
                qVar.i = false;
                if (tL_messages_votesList == null) {
                    qVar.g = null;
                    qVar.h = true;
                    break;
                } else {
                    MessagesController.getInstance(i16).putUsers(tL_messages_votesList.users, false);
                    MessagesController.getInstance(i16).putChats(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    qVar.g = str;
                    qVar.h = str == null;
                    qVar.j.addAll(tL_messages_votesList.votes);
                    j jVar = qVar.e;
                    if (jVar != null) {
                        jVar.run();
                        break;
                    }
                }
                break;
        }
    }
}
