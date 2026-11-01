package yh;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.messenger.k20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements k20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ a(e eVar, int i10) {
        this.a = i10;
        this.b = eVar;
    }

    @Override // org.telegram.messenger.k20
    public final void a(Object obj, Object obj2) {
        String L0;
        int i10 = this.a;
        e eVar = this.b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.add(b51.l(0, eVar.h));
                b51 c10 = b51.c(1, R.drawable.msg_groups_create, dd.L0(2131751939, null));
                c10.q = true;
                arrayList.add(c10);
                arrayList.add(b51.E(2, i0.L(14.0f)));
                ArrayList arrayList2 = eVar.n;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(b51.t(3, dd.L0(2131751969, null)));
                    ArrayList arrayList3 = eVar.n;
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull M0 = eVar.getMessagesController().M0(chat.id);
                        b51 w9 = b51.w(chat);
                        long j10 = chat.id;
                        w9.d = (int) (j10 ^ (j10 >>> 32));
                        if (M0 != null) {
                            ArrayList<TL_communities.CommunityPeer> arrayList4 = M0.linked_peers;
                            L0 = dd.G(arrayList4 != null ? arrayList4.size() : 0, "Chats", new Object[0]);
                        } else {
                            L0 = dd.L0(2131748789, null);
                        }
                        w9.m = L0;
                        arrayList.add(w9);
                    }
                    break;
                }
                break;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    e0.d(eVar, eVar.b, 0);
                    break;
                } else {
                    eVar.getClass();
                    cc.a0(eVar).f0(tL_error, false);
                    break;
                }
        }
    }
}
