package sh;

import bi.q;
import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l41;
import org.telegram.ui.web.z0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ i(n nVar, int i7) {
        this.a = i7;
        this.b = nVar;
    }

    @Override // org.telegram.messenger.q10
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
                    long o4 = n5.o(messagePeerVote.peer);
                    TLObject g22 = mp.u1(nVar.a).g2(o4);
                    int i11 = messagePeerVote.date;
                    q qVar = new q(nVar, o4, 5);
                    int i12 = k.b;
                    l41 K = l41.K(k.class);
                    K.H = g22;
                    K.C = o4;
                    K.A = i11;
                    K.E = qVar;
                    arrayList.add(K);
                }
                if (!nVar.h) {
                    if (!arrayList2.isEmpty()) {
                        int i13 = m.b;
                        arrayList.add(l41.K(m.class));
                        break;
                    } else {
                        int i14 = l.b;
                        arrayList.add(l41.K(l.class));
                        arrayList.add(l41.K(l.class));
                        arrayList.add(l41.K(l.class));
                        arrayList.add(l41.K(l.class));
                        arrayList.add(l41.K(l.class));
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
                    mp.u1(i15).f4(tL_messages_votesList.users, false);
                    mp.u1(i15).Z3(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    nVar.g = str;
                    nVar.h = str == null;
                    nVar.j.addAll(tL_messages_votesList.votes);
                    z0 z0Var = nVar.e;
                    if (z0Var != null) {
                        z0Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
