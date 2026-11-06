package sh;

import di.u1;
import java.util.ArrayList;
import org.telegram.messenger.m5;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.r31;
import sg.t0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ h(m mVar, int i7) {
        this.a = i7;
        this.b = mVar;
    }

    @Override // org.telegram.messenger.v10
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
                    long o4 = m5.o(messagePeerVote.peer);
                    TLObject e22 = qp.s1(mVar.a).e2(o4);
                    int i11 = messagePeerVote.date;
                    u1 u1Var = new u1(mVar, o4, 3);
                    int i12 = j.b;
                    r31 K = r31.K(j.class);
                    K.G = e22;
                    K.B = o4;
                    K.z = i11;
                    K.D = u1Var;
                    arrayList.add(K);
                }
                if (!mVar.h) {
                    if (!arrayList2.isEmpty()) {
                        int i13 = l.b;
                        arrayList.add(r31.K(l.class));
                        break;
                    } else {
                        int i14 = k.b;
                        arrayList.add(r31.K(k.class));
                        arrayList.add(r31.K(k.class));
                        arrayList.add(r31.K(k.class));
                        arrayList.add(r31.K(k.class));
                        arrayList.add(r31.K(k.class));
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
                    qp.s1(i15).Y3(tL_messages_votesList.users, false);
                    qp.s1(i15).S3(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    mVar.g = str;
                    mVar.h = str == null;
                    mVar.j.addAll(tL_messages_votesList.votes);
                    t0 t0Var = mVar.e;
                    if (t0Var != null) {
                        t0Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
