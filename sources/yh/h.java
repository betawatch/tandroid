package yh;

import java.util.ArrayList;
import org.telegram.messenger.at;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.messenger.k20;
import org.telegram.messenger.o5;
import org.telegram.messenger.w3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements k20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ h(l lVar, int i10) {
        this.a = i10;
        this.b = lVar;
    }

    @Override // org.telegram.messenger.k20
    public final void a(Object obj, Object obj2) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        TLRPC.ChatPhoto chatPhoto;
        int i10 = this.a;
        int i11 = 0;
        l lVar = this.b;
        switch (i10) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                lVar.getClass();
                if (tL_error != null) {
                    cc.a0(lVar).f0(tL_error, false);
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(b51.l(at.W1, lVar.s));
                if (w3.y(1, lVar.I)) {
                    TLRPC.Chat chat = lVar.I;
                    b51 c10 = b51.c(at.X1, R.drawable.outline_profile_photo, dd.L0((chat == null || (chatPhoto = chat.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty)) ? 2131751851 : 2131751852, null));
                    c10.q = true;
                    arrayList2.add(c10);
                    arrayList2.add(b51.E(2, i0.L(14.0f)));
                    arrayList2.add(b51.t(0, dd.L0(2131751874, null)));
                    arrayList2.add(b51.j(7, lVar.r));
                    arrayList2.add(b51.E(1, i0.L(14.0f)));
                }
                if (w3.w(2, lVar.I)) {
                    arrayList2.add(b51.t(3, dd.L0(2131751872, null)));
                    b51 y3 = b51.y(at.g2, dd.L0(2131751843, null), dd.L0(2131751842, null));
                    y3.L(lVar.n);
                    arrayList2.add(y3);
                    b51 y10 = b51.y(at.h2, dd.L0(2131751841, null), dd.L0(2131751840, null));
                    y10.L(!lVar.n);
                    arrayList2.add(y10);
                    arrayList2.add(b51.E(4, i0.L(14.0f)));
                }
                if (w3.N(lVar.I)) {
                    String L0 = dd.L0(2131751965, null);
                    TLRPC.ChatFull chatFull = lVar.J;
                    arrayList2.add(b51.d(at.Y1, R.drawable.msg_admins, L0, chatFull != null ? Integer.toString(chatFull.admins_count) : ""));
                    String L02 = dd.L0(2131751895, null);
                    TLRPC.ChatFull chatFull2 = lVar.J;
                    arrayList2.add(b51.d(at.Z1, R.drawable.community_requests_outline_24, L02, chatFull2 != null ? Integer.toString(chatFull2.requests_pending) : ""));
                    String L03 = dd.L0(2131751881, null);
                    TLRPC.ChatFull chatFull3 = lVar.J;
                    arrayList2.add(b51.d(at.a2, R.drawable.msg_user_remove, L03, chatFull3 != null ? Integer.toString(chatFull3.kicked_count) : ""));
                }
                arrayList2.add(b51.E(5, i0.L(14.0f)));
                b51 c11 = b51.c(at.c2, R.drawable.msg_groups_create, dd.L0(2131751918, null));
                c11.q = true;
                arrayList2.add(c11);
                TLRPC.ChatFull chatFull4 = lVar.J;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i11 < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i11);
                        i11++;
                        arrayList2.add(b51.w(lVar.getMessagesController().d2(o5.o(communityPeer.peer))));
                    }
                    break;
                }
                break;
        }
    }
}
