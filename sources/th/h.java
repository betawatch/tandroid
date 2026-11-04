package th;

import ai.v;
import java.util.ArrayList;
import org.telegram.messenger.hp;
import org.telegram.messenger.m5;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.r31;
import r4.u;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ h(m mVar, int i3) {
        this.a = i3;
        this.b = mVar;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        int i3 = this.a;
        int i10 = 0;
        m mVar = this.b;
        switch (i3) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.clear();
                ArrayList arrayList2 = mVar.j;
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj3 = arrayList2.get(i10);
                    i10++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long o10 = m5.o(messagePeerVote.peer);
                    TLObject e22 = hp.s1(mVar.a).e2(o10);
                    int i11 = messagePeerVote.date;
                    v vVar = new v(mVar, o10, 5);
                    int i12 = j.b;
                    r31 K = r31.K(j.class);
                    K.G = e22;
                    K.B = o10;
                    K.z = i11;
                    K.D = vVar;
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
                    hp.s1(i15).Y3(tL_messages_votesList.users, false);
                    hp.s1(i15).S3(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    mVar.g = str;
                    mVar.h = str == null;
                    mVar.j.addAll(tL_messages_votesList.votes);
                    u uVar = mVar.e;
                    if (uVar != null) {
                        uVar.run();
                        break;
                    }
                }
                break;
        }
    }
}
