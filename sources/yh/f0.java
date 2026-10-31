package yh;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.jj;
import org.telegram.messenger.ml;
import org.telegram.messenger.o5;
import org.telegram.messenger.st;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.cc;
import org.telegram.ui.ay;
import org.telegram.ui.un;
import org.telegram.ui.vh;
import v7.u7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class f0 {
    public static SpannableStringBuilder a(jj jjVar, String str, String str2, boolean z10, boolean z11) {
        TLRPC.Message message = jjVar.k;
        TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message.action;
        boolean z12 = o5.o(message.peer_id) == o5.o(message.from_id);
        boolean z13 = tL_messageActionChangeCommunity.community_id == 0;
        if (z12) {
            if (z13) {
                return i0.W2(cd.L0(z11 ? 2131751868 : z10 ? 2131751862 : 2131751856, null));
            }
            return i0.W2(cd.a0(null, null, z11 ? 2131751870 : z10 ? 2131751864 : 2131751858, str));
        }
        if (jjVar.N3()) {
            if (z13) {
                return i0.W2(cd.L0(z11 ? 2131751866 : z10 ? 2131751860 : 2131751854, null));
            }
            return i0.W2(cd.a0(null, null, z11 ? 2131751867 : z10 ? 2131751861 : 2131751855, str));
        }
        if (z13) {
            return i0.W2(cd.a0(null, null, z11 ? 2131751869 : z10 ? 2131751863 : 2131751857, str2));
        }
        return i0.W2(cd.a0(null, null, z11 ? 2131751871 : z10 ? 2131751865 : 2131751859, str2, str));
    }

    public static int b(int i10, long j10) {
        TLRPC.Chat L0;
        long j11;
        TLRPC.User user;
        TLRPC.ChatFull M0;
        ArrayList<TL_communities.CommunityPeer> arrayList;
        if (j10 > 0) {
            TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(j10));
            if (Z1 == null) {
                return 0;
            }
            j11 = Z1.linked_community_id;
            user = Z1;
            L0 = null;
        } else {
            L0 = vp.r1(i10).L0(Long.valueOf(-j10));
            if (L0 == null) {
                return 0;
            }
            j11 = L0.linked_community_id;
            user = null;
        }
        if (j11 != 0 && (M0 = vp.r1(i10).M0(j11)) != null && (arrayList = M0.linked_peers) != null) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i11);
                i11++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                if (o5.o(communityPeer2.peer) == j10) {
                    return c(L0, user != null ? vp.r1(i10).R0(user.id) : null, user, communityPeer2);
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
            if (!w3.j0(chat)) {
                if (w3.t0(chat) || communityPeer.can_view_history) {
                    return 2;
                }
                return (!u7.a(communityPeer.flags, 1) || communityPeer.visible) ? 3 : 4;
            }
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(k2 k2Var, long j10, int i10) {
        z4 z4Var;
        un unVar;
        int i11;
        List list = null;
        if (i0.Q1()) {
            z4Var = null;
            unVar = null;
        } else {
            z4Var = k2Var.getParentLayout();
            if (z4Var != null) {
                List fragmentStack = z4Var.getFragmentStack();
                i11 = fragmentStack.size() - 2;
                while (true) {
                    if (i11 < 0) {
                        unVar = null;
                        i11 = -1;
                        break;
                    }
                    k2 k2Var2 = (k2) fragmentStack.get(i11);
                    if (k2Var2 instanceof un) {
                        unVar = (un) k2Var2;
                        if (unVar.a() == j10) {
                            break;
                        }
                    }
                    i11--;
                }
                list = fragmentStack;
                boolean U = w3.U(k2Var.getCurrentAccount(), j10);
                if (i11 != -1) {
                    if (!(k2Var instanceof ay)) {
                        k2Var.finishFragment();
                    }
                    f(cc.X(), i10, U);
                    return;
                }
                for (int size = list.size() - 2; size > i11; size--) {
                    ((ActionBarLayout) z4Var).c0((k2) list.get(size), false);
                }
                k2Var.finishFragment();
                i0.h3(new vh(i10, unVar, U), 250L);
                return;
            }
            unVar = null;
        }
        i11 = -1;
        boolean U2 = w3.U(k2Var.getCurrentAccount(), j10);
        if (i11 != -1) {
        }
    }

    public static void e(x1[] x1VarArr, k2 k2Var, int i10, TLRPC.Chat chat) {
        if (x1VarArr[0] != null) {
            return;
        }
        vp r12 = vp.r1(i10);
        org.telegram.ui.f0 f0Var = new org.telegram.ui.f0(x1VarArr, k2Var, i10, chat, 9);
        TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
        tL_channels_getAdminedPublicChannels.for_community_peer = true;
        int sendRequestTyped = r12.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new a3.b(1), new ml(r12, f0Var, 0));
        ConnectionsManager.getInstance(i10).bindRequestToGuid(sendRequestTyped, k2Var.getClassGuid());
        x1 x1Var = new x1(3, k2Var.getContext(), null);
        x1VarArr[0] = x1Var;
        x1Var.r(500L);
        x1VarArr[0].setOnCancelListener(new st(i10, sendRequestTyped, x1VarArr, 1));
    }

    public static void f(cc ccVar, int i10, boolean z10) {
        String L0;
        int i11 = i10 == 2 ? R.raw.timer_toast : R.raw.contact_check;
        int i12 = i10 == 2 ? 24 : 36;
        if (i10 == 0) {
            L0 = cd.L0(2131751943, null);
        } else if (i10 == 1) {
            L0 = cd.L0(z10 ? 2131751942 : 2131751941, null);
        } else {
            L0 = cd.L0(2131751940, null);
        }
        ccVar.G(i11, i12, L0).j();
    }
}
