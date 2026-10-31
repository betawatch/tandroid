package yh;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.j20;
import org.telegram.messenger.o5;
import org.telegram.messenger.w3;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ h(l lVar, int i10) {
        this.a = i10;
        this.b = lVar;
    }

    @Override // org.telegram.messenger.j20
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
                arrayList2.add(a51.l(zs.W1, lVar.s));
                if (w3.y(1, lVar.I)) {
                    TLRPC.Chat chat = lVar.I;
                    a51 c10 = a51.c(zs.X1, R.drawable.outline_profile_photo, cd.L0((chat == null || (chatPhoto = chat.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty)) ? 2131751851 : 2131751852, null));
                    c10.q = true;
                    arrayList2.add(c10);
                    arrayList2.add(a51.E(2, i0.L(14.0f)));
                    arrayList2.add(a51.t(0, cd.L0(2131751874, null)));
                    arrayList2.add(a51.j(7, lVar.r));
                    arrayList2.add(a51.E(1, i0.L(14.0f)));
                }
                if (w3.w(2, lVar.I)) {
                    arrayList2.add(a51.t(3, cd.L0(2131751872, null)));
                    a51 y3 = a51.y(zs.g2, cd.L0(2131751843, null), cd.L0(2131751842, null));
                    y3.L(lVar.n);
                    arrayList2.add(y3);
                    a51 y10 = a51.y(zs.h2, cd.L0(2131751841, null), cd.L0(2131751840, null));
                    y10.L(!lVar.n);
                    arrayList2.add(y10);
                    arrayList2.add(a51.E(4, i0.L(14.0f)));
                }
                if (w3.N(lVar.I)) {
                    String L0 = cd.L0(2131751965, null);
                    TLRPC.ChatFull chatFull = lVar.J;
                    arrayList2.add(a51.d(zs.Y1, R.drawable.msg_admins, L0, chatFull != null ? Integer.toString(chatFull.admins_count) : ""));
                    String L02 = cd.L0(2131751895, null);
                    TLRPC.ChatFull chatFull2 = lVar.J;
                    arrayList2.add(a51.d(zs.Z1, R.drawable.community_requests_outline_24, L02, chatFull2 != null ? Integer.toString(chatFull2.requests_pending) : ""));
                    String L03 = cd.L0(2131751881, null);
                    TLRPC.ChatFull chatFull3 = lVar.J;
                    arrayList2.add(a51.d(zs.a2, R.drawable.msg_user_remove, L03, chatFull3 != null ? Integer.toString(chatFull3.kicked_count) : ""));
                }
                arrayList2.add(a51.E(5, i0.L(14.0f)));
                a51 c11 = a51.c(zs.c2, R.drawable.msg_groups_create, cd.L0(2131751918, null));
                c11.q = true;
                arrayList2.add(c11);
                TLRPC.ChatFull chatFull4 = lVar.J;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i11 < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i11);
                        i11++;
                        arrayList2.add(a51.w(lVar.getMessagesController().d2(o5.o(communityPeer.peer))));
                    }
                    break;
                }
                break;
        }
    }
}
