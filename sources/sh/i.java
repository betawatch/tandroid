package sh;

import di.u1;
import java.util.ArrayList;
import org.telegram.messenger.m5;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ i(n nVar, int i7) {
        this.a = i7;
        this.b = nVar;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        int i10 = 0;
        n nVar = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.clear();
                ArrayList arrayList2 = nVar.j;
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj3 = arrayList2.get(i10);
                    i10++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long o4 = m5.o(messagePeerVote.peer);
                    TLObject e22 = qp.s1(nVar.a).e2(o4);
                    int i11 = messagePeerVote.date;
                    u1 u1Var = new u1(nVar, o4, 3);
                    int i12 = k.b;
                    x31 K = x31.K(k.class);
                    K.G = e22;
                    K.B = o4;
                    K.z = i11;
                    K.D = u1Var;
                    arrayList.add(K);
                }
                if (!nVar.h) {
                    if (!arrayList2.isEmpty()) {
                        int i13 = m.b;
                        arrayList.add(x31.K(m.class));
                        break;
                    } else {
                        int i14 = l.b;
                        arrayList.add(x31.K(l.class));
                        arrayList.add(x31.K(l.class));
                        arrayList.add(x31.K(l.class));
                        arrayList.add(x31.K(l.class));
                        arrayList.add(x31.K(l.class));
                        break;
                    }
                }
                break;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                int i15 = nVar.a;
                nVar.i = false;
                if (tL_messages_votesList == null) {
                    nVar.g = null;
                    nVar.h = true;
                    break;
                } else {
                    qp.s1(i15).Y3(tL_messages_votesList.users, false);
                    qp.s1(i15).S3(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    nVar.g = str;
                    nVar.h = str == null;
                    nVar.j.addAll(tL_messages_votesList.votes);
                    b bVar = nVar.e;
                    if (bVar != null) {
                        bVar.run();
                        break;
                    }
                }
                break;
        }
    }
}
