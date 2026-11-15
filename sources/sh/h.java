package sh;

import bi.q;
import java.util.ArrayList;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b41;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ h(m mVar, int i7) {
        this.a = i7;
        this.b = mVar;
    }

    @Override // org.telegram.messenger.s10
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
                    TLObject e22 = np.s1(mVar.a).e2(o4);
                    int i11 = messagePeerVote.date;
                    q qVar = new q(mVar, o4, 5);
                    int i12 = j.b;
                    b41 K = b41.K(j.class);
                    K.G = e22;
                    K.B = o4;
                    K.z = i11;
                    K.D = qVar;
                    arrayList.add(K);
                }
                if (!mVar.h) {
                    if (!arrayList2.isEmpty()) {
                        int i13 = l.b;
                        arrayList.add(b41.K(l.class));
                        break;
                    } else {
                        int i14 = k.b;
                        arrayList.add(b41.K(k.class));
                        arrayList.add(b41.K(k.class));
                        arrayList.add(b41.K(k.class));
                        arrayList.add(b41.K(k.class));
                        arrayList.add(b41.K(k.class));
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
                    np.s1(i15).Y3(tL_messages_votesList.users, false);
                    np.s1(i15).S3(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    mVar.g = str;
                    mVar.h = str == null;
                    mVar.j.addAll(tL_messages_votesList.votes);
                    q2.d dVar = mVar.e;
                    if (dVar != null) {
                        dVar.run();
                        break;
                    }
                }
                break;
        }
    }
}
