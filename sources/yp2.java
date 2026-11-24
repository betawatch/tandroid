// default package

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class yp2 {
    public static SpannableStringBuilder a(k47 k47Var, String str, String str2, boolean z, boolean z2) {
        TLRPC.Message message = k47Var.k;
        TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message.action;
        boolean z3 = pg3.n(message.peer_id) == pg3.n(message.from_id);
        boolean z4 = tL_messageActionChangeCommunity.community_id == 0;
        if (z3) {
            if (z4) {
                return gm.S2(jb6.M0(z2 ? 2131751805 : z ? 2131751799 : 2131751793, null));
            }
            return gm.S2(jb6.a0(null, null, z2 ? 2131751807 : z ? 2131751801 : 2131751795, str));
        }
        if (k47Var.N3()) {
            if (z4) {
                return gm.S2(jb6.M0(z2 ? 2131751803 : z ? 2131751797 : 2131751791, null));
            }
            return gm.S2(jb6.a0(null, null, z2 ? 2131751804 : z ? 2131751798 : 2131751792, str));
        }
        if (z4) {
            return gm.S2(jb6.a0(null, null, z2 ? 2131751806 : z ? 2131751800 : 2131751794, str2));
        }
        return gm.S2(jb6.a0(null, null, z2 ? 2131751808 : z ? 2131751802 : 2131751796, str2, str));
    }

    public static int b(int i, long j) {
        TLRPC.Chat L0;
        long j2;
        TLRPC.User user;
        TLRPC.ChatFull M0;
        ArrayList<TL_communities.CommunityPeer> arrayList;
        if (j > 0) {
            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(j));
            if (W1 == null) {
                return 0;
            }
            j2 = W1.linked_community_id;
            user = W1;
            L0 = null;
        } else {
            L0 = oc7.r1(i).L0(Long.valueOf(-j));
            if (L0 == null) {
                return 0;
            }
            j2 = L0.linked_community_id;
            user = null;
        }
        if (j2 != 0 && (M0 = oc7.r1(i).M0(j2)) != null && (arrayList = M0.linked_peers) != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i2);
                i2++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                if (pg3.n(communityPeer2.peer) == j) {
                    return c(L0, user != null ? oc7.r1(i).R0(user.id) : null, user, communityPeer2);
                }
            }
        }
        return 0;
    }

    public static int c(TLRPC.Chat chat, TLRPC.Dialog dialog, TLRPC.User user, TL_communities.CommunityPeer communityPeer) {
        if (user != null) {
            if (dialog == null) {
                return 2;
            }
        } else {
            if (chat == null) {
                return 0;
            }
            if (!sd2.j0(chat)) {
                if (sd2.t0(chat) || communityPeer.can_view_history) {
                    return 2;
                }
                return (!iqd.a(communityPeer.flags, 1) || communityPeer.visible) ? 3 : 4;
            }
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(int i, long j, d dVar) {
        tk5 tk5Var;
        yv1 yv1Var;
        int i2;
        List list = null;
        if (gm.O1()) {
            tk5Var = null;
            yv1Var = null;
        } else {
            tk5Var = dVar.getParentLayout();
            if (tk5Var != null) {
                List fragmentStack = tk5Var.getFragmentStack();
                i2 = fragmentStack.size() - 2;
                while (true) {
                    if (i2 < 0) {
                        yv1Var = null;
                        i2 = -1;
                        break;
                    }
                    d dVar2 = (d) fragmentStack.get(i2);
                    if (dVar2 instanceof yv1) {
                        yv1Var = (yv1) dVar2;
                        if (yv1Var.a() == j) {
                            break;
                        }
                    }
                    i2--;
                }
                list = fragmentStack;
                boolean U = sd2.U(dVar.getCurrentAccount(), j);
                if (i2 != -1) {
                    if (!(dVar instanceof nk3)) {
                        dVar.finishFragment();
                    }
                    f(c41.Y(), i, U);
                    return;
                }
                for (int size = list.size() - 2; size > i2; size--) {
                    ((ActionBarLayout) tk5Var).c0((d) list.get(size), false);
                }
                dVar.finishFragment();
                gm.d3(new wp1(i, yv1Var, U), 250L);
                return;
            }
            yv1Var = null;
        }
        i2 = -1;
        boolean U2 = sd2.U(dVar.getCurrentAccount(), j);
        if (i2 != -1) {
        }
    }

    public static void e(he[] heVarArr, d dVar, int i, TLRPC.Chat chat) {
        byte b = 0;
        if (heVarArr[0] != null) {
            return;
        }
        oc7 r1 = oc7.r1(i);
        e eVar = new e((Object) heVarArr, (Object) dVar, i, (Object) chat, (byte) 5);
        TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
        tL_channels_getAdminedPublicChannels.for_community_peer = true;
        int sendRequestTyped = r1.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new kc((byte) 0), new s87(r1, eVar, b));
        ConnectionsManager.getInstance(i).bindRequestToGuid(sendRequestTyped, dVar.getClassGuid());
        he heVar = new he(3, null, dVar.getContext());
        heVarArr[0] = heVar;
        heVar.q(500L);
        heVarArr[0].setOnCancelListener(new qp2(i, sendRequestTyped, heVarArr, b));
    }

    public static void f(c41 c41Var, int i, boolean z) {
        int i2;
        int i3;
        String M0;
        if (i == 2) {
            i2 = R.raw.timer_toast;
            i3 = 24;
        } else {
            i2 = R.raw.contact_check;
            i3 = 36;
        }
        if (i == 0) {
            M0 = jb6.M0(2131751880, null);
        } else if (i == 1) {
            M0 = jb6.M0(z ? 2131751879 : 2131751878, null);
        } else {
            M0 = jb6.M0(2131751877, null);
        }
        c41Var.G(i2, i3, M0).j();
    }
}
