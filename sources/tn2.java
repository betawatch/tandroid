// default package

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class tn2 implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xn2 b;

    public /* synthetic */ tn2(xn2 xn2Var, byte b) {
        this.a = b;
        this.b = xn2Var;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        TLRPC.ChatPhoto chatPhoto;
        byte b = this.a;
        int i = 0;
        xn2 xn2Var = this.b;
        switch (b) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    d31.b0(xn2Var).g0(tL_error, false);
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(b8c.l(jn7.V1, xn2Var.s));
                if (xc2.y(1, xn2Var.J)) {
                    TLRPC.Chat chat = xn2Var.J;
                    b8c c = b8c.c(jn7.W1, R.drawable.outline_profile_photo, ob6.M0((chat == null || (chatPhoto = chat.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty)) ? 2131751816 : 2131751817, null));
                    c.r = true;
                    arrayList2.add(c);
                    arrayList2.add(b8c.E(2, hl.L(14.0f)));
                    arrayList2.add(b8c.t(0, ob6.M0(2131751839, null)));
                    arrayList2.add(b8c.j(7, xn2Var.r));
                    arrayList2.add(b8c.E(1, hl.L(14.0f)));
                }
                if (xc2.w(2, xn2Var.J)) {
                    arrayList2.add(b8c.t(3, ob6.M0(2131751837, null)));
                    b8c y = b8c.y(jn7.f2, ob6.M0(2131751808, null), ob6.M0(2131751807, null));
                    y.L(xn2Var.n);
                    arrayList2.add(y);
                    b8c y2 = b8c.y(jn7.g2, ob6.M0(2131751806, null), ob6.M0(2131751805, null));
                    y2.L(!xn2Var.n);
                    arrayList2.add(y2);
                    arrayList2.add(b8c.E(4, hl.L(14.0f)));
                }
                if (xc2.N(xn2Var.J)) {
                    String M0 = ob6.M0(2131751930, null);
                    TLRPC.ChatFull chatFull = xn2Var.K;
                    arrayList2.add(b8c.d(jn7.X1, R.drawable.msg_admins, M0, chatFull != null ? Integer.toString(chatFull.admins_count) : ""));
                    String M02 = ob6.M0(2131751860, null);
                    TLRPC.ChatFull chatFull2 = xn2Var.K;
                    arrayList2.add(b8c.d(jn7.Y1, R.drawable.community_requests_outline_24, M02, chatFull2 != null ? Integer.toString(chatFull2.requests_pending) : ""));
                    String M03 = ob6.M0(2131751846, null);
                    TLRPC.ChatFull chatFull3 = xn2Var.K;
                    arrayList2.add(b8c.d(jn7.Z1, R.drawable.msg_user_remove, M03, chatFull3 != null ? Integer.toString(chatFull3.kicked_count) : ""));
                }
                arrayList2.add(b8c.E(5, hl.L(14.0f)));
                b8c c2 = b8c.c(jn7.b2, R.drawable.msg_groups_create, ob6.M0(2131751883, null));
                c2.r = true;
                arrayList2.add(c2);
                TLRPC.ChatFull chatFull4 = xn2Var.K;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i);
                        i++;
                        arrayList2.add(b8c.w(xn2Var.getMessagesController().b2(wf3.n(communityPeer.peer))));
                    }
                    break;
                }
                break;
        }
    }
}
