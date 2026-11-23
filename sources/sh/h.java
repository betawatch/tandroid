package sh;

import bi.q;
import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n41;
import org.telegram.ui.web.z0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ h(m mVar, int i7) {
        this.a = i7;
        this.b = mVar;
    }

    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        int i10 = 0;
        m mVar = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.clear();
                ArrayList arrayList2 = mVar.j;
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj3 = arrayList2.get(i10);
                    i10++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long o4 = n5.o(messagePeerVote.peer);
                    TLObject g22 = mp.u1(mVar.a).g2(o4);
                    int i11 = messagePeerVote.date;
                    q qVar = new q(mVar, o4, 5);
                    int i12 = j.b;
                    n41 K = n41.K(j.class);
                    K.H = g22;
                    K.C = o4;
                    K.A = i11;
                    K.E = qVar;
                    arrayList.add(K);
                }
                if (!mVar.h) {
                    if (!arrayList2.isEmpty()) {
                        int i13 = l.b;
                        arrayList.add(n41.K(l.class));
                        break;
                    } else {
                        int i14 = k.b;
                        arrayList.add(n41.K(k.class));
                        arrayList.add(n41.K(k.class));
                        arrayList.add(n41.K(k.class));
                        arrayList.add(n41.K(k.class));
                        arrayList.add(n41.K(k.class));
                        break;
                    }
                }
                break;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                int i15 = mVar.a;
                mVar.i = false;
                if (tL_messages_votesList == null) {
                    mVar.g = null;
                    mVar.h = true;
                    break;
                } else {
                    mp.u1(i15).f4(tL_messages_votesList.users, false);
                    mp.u1(i15).Z3(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    mVar.g = str;
                    mVar.h = str == null;
                    mVar.j.addAll(tL_messages_votesList.votes);
                    z0 z0Var = mVar.e;
                    if (z0Var != null) {
                        z0Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
