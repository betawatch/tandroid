package ph;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.voip.x;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                    m80 m80Var = new m80(pVar, peerDialogId, 2);
                    int i13 = m.a;
                    v51 J = v51.J(m.class);
                    J.G = userOrChat;
                    J.B = peerDialogId;
                    J.z = i12;
                    J.D = m80Var;
                    arrayList.add(J);
                }
                if (!pVar.h) {
                    if (!arrayList2.isEmpty()) {
                        int i14 = o.a;
                        arrayList.add(v51.J(o.class));
                        break;
                    } else {
                        int i15 = n.a;
                        arrayList.add(v51.J(n.class));
                        arrayList.add(v51.J(n.class));
                        arrayList.add(v51.J(n.class));
                        arrayList.add(v51.J(n.class));
                        arrayList.add(v51.J(n.class));
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
                    x xVar = pVar.e;
                    if (xVar != null) {
                        xVar.run();
                        break;
                    }
                }
                break;
        }
    }
}
