package rh;

import bi.p2;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.voip.m2;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                    p2 p2Var = new p2(qVar, peerDialogId, 3);
                    int i13 = n.a;
                    l61 J = l61.J(n.class);
                    J.G = userOrChat;
                    J.B = peerDialogId;
                    J.z = i12;
                    J.D = p2Var;
                    arrayList.add(J);
                }
                if (!qVar.h) {
                    if (!arrayList2.isEmpty()) {
                        int i14 = p.a;
                        arrayList.add(l61.J(p.class));
                        break;
                    } else {
                        int i15 = o.a;
                        arrayList.add(l61.J(o.class));
                        arrayList.add(l61.J(o.class));
                        arrayList.add(l61.J(o.class));
                        arrayList.add(l61.J(o.class));
                        arrayList.add(l61.J(o.class));
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
                    m2 m2Var = qVar.e;
                    if (m2Var != null) {
                        m2Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
