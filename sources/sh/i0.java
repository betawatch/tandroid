package sh;

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import dg.j3;
import gg.y1;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k7.b6;
import nh.c7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.m2;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.d20;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.ai;
import org.telegram.ui.gk;
import org.telegram.ui.nw0;
import org.telegram.ui.ry0;
import org.telegram.ui.sf1;
import org.telegram.ui.sz;
import org.telegram.ui.u10;
import org.telegram.ui.zn;
import ph.e6;
import ph.s1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class i0 extends g3 implements NotificationCenter.NotificationCenterDelegate, xd.b, m2 {
    public static final /* synthetic */ int S = 0;
    public final d20 B;
    public final u10 C;
    public final g61 D;
    public final nw0 E;
    public final nw0 F;
    public final kf.b0 G;
    public final kf.b0 H;
    public final View I;
    public final n0 J;
    public final boolean K;
    public final Utilities.Callback L;
    public final Paint M;
    public ArrayList N;
    public String O;
    public String P;
    public i0.b Q;
    public i0.b R;
    public final xd.a b;
    public final xd.a c;
    public final gk d;
    public final long e;
    public TLRPC.Chat f;
    public boolean h;
    public ph.d n;
    public ph.d r;
    public final p2 s;
    public final d0 v;
    public final h0 w;
    public final c0 x;
    public final d20 y;

    public i0(p2 p2Var, long j10) {
        this(p2Var, j10, null, null);
    }

    public static void A(i0 i0Var, ArrayList arrayList) {
        boolean z4;
        ArrayList arrayList2;
        arrayList.add(i51.D(99, Math.min(AndroidUtilities.dp(176.0f) + AndroidUtilities.statusBarHeight, (int) (AndroidUtilities.displaySize.y * 0.25f))));
        int i10 = 0;
        arrayList.add(i51.D(0, AndroidUtilities.dp(56.0f)));
        String string = LocaleController.getString(R.string.CommunityShowAsOneChat);
        i51 i51Var = new i51(39);
        i51Var.d = 101;
        i51Var.l = string;
        i51Var.z = 0;
        i51Var.K(i0Var.h);
        arrayList.add(i51Var);
        arrayList.add(i51.A(2, LocaleController.getString(R.string.CommunityShowAsOneChatInfo)));
        n0 n0Var = i0Var.J;
        boolean z10 = true;
        if (n0Var.n && n0Var.l == 1 && (arrayList2 = n0Var.j) != null && arrayList2.size() == 1) {
            arrayList.add(i51.s(3, LocaleController.getString(R.string.CommunityPendingRequest)));
            n0Var.c(arrayList);
            arrayList.add(i51.D(5, AndroidUtilities.dp(14.33f)));
        } else {
            int i11 = n0Var.l;
            if (i11 > 0) {
                int i12 = n0Var.p;
                int i13 = R.drawable.filled_requests_24;
                String string2 = i11 == i12 ? LocaleController.getString(R.string.CommunityPendingRequests) : LocaleController.formatPluralString("CommunityPendingRequestsRow", i11, new Object[0]);
                String num = i12 > 0 ? Integer.toString(i12) : null;
                int i14 = th.h.a;
                i51 J = i51.J(th.h.class);
                J.d = 100;
                J.k = i13;
                J.l = string2;
                J.n = num;
                J.B = ((-15497247) << 32) | ((-14899731) & 4294967295L);
                J.q = true;
                arrayList.add(J);
                arrayList.add(i51.D(5, AndroidUtilities.dp(14.33f)));
            }
        }
        MessagesController.CommunityPeersDialog buildCommunityPeers = MessagesController.getInstance(i0Var.currentAccount).buildCommunityPeers(i0Var.e);
        if (buildCommunityPeers == null) {
            return;
        }
        if (buildCommunityPeers.chatsYouAreIn.isEmpty()) {
            z4 = false;
        } else {
            arrayList.add(i51.s(21, LocaleController.getString(R.string.CommunitySectionChatsYouAreIn)));
            ArrayList<MessagesController.CommunityPeerDialog> arrayList3 = buildCommunityPeers.chatsYouAreIn;
            int size = arrayList3.size();
            int i15 = 0;
            while (i15 < size) {
                MessagesController.CommunityPeerDialog communityPeerDialog = arrayList3.get(i15);
                i15++;
                arrayList.add(k0.a(communityPeerDialog, i0Var));
            }
            z4 = true;
        }
        if (!buildCommunityPeers.chatsYouCanView.isEmpty()) {
            if (z4) {
                arrayList.add(i51.D(22, AndroidUtilities.dp(12.0f)));
            }
            arrayList.add(i51.s(23, LocaleController.getString(R.string.CommunitySectionChatsYouCanView)));
            ArrayList<MessagesController.CommunityPeerDialog> arrayList4 = buildCommunityPeers.chatsYouCanView;
            int size2 = arrayList4.size();
            int i16 = 0;
            while (i16 < size2) {
                MessagesController.CommunityPeerDialog communityPeerDialog2 = arrayList4.get(i16);
                i16++;
                arrayList.add(k0.a(communityPeerDialog2, i0Var));
            }
            z4 = true;
        }
        if (buildCommunityPeers.chatsYouCanJoin.isEmpty()) {
            z10 = z4;
        } else {
            if (z4) {
                arrayList.add(i51.D(24, AndroidUtilities.dp(12.0f)));
            }
            arrayList.add(i51.s(25, LocaleController.getString(R.string.CommunitySectionChatsYouCanRequestToJoin)));
            ArrayList<MessagesController.CommunityPeerDialog> arrayList5 = buildCommunityPeers.chatsYouCanJoin;
            int size3 = arrayList5.size();
            int i17 = 0;
            while (i17 < size3) {
                MessagesController.CommunityPeerDialog communityPeerDialog3 = arrayList5.get(i17);
                i17++;
                arrayList.add(k0.a(communityPeerDialog3, i0Var));
            }
        }
        if (buildCommunityPeers.chatsOther.isEmpty()) {
            return;
        }
        if (z10) {
            arrayList.add(i51.D(26, AndroidUtilities.dp(12.0f)));
        }
        arrayList.add(i51.s(27, LocaleController.getString(R.string.CommunitySectionHiddenChats)));
        ArrayList<MessagesController.CommunityPeerDialog> arrayList6 = buildCommunityPeers.chatsOther;
        int size4 = arrayList6.size();
        while (i10 < size4) {
            MessagesController.CommunityPeerDialog communityPeerDialog4 = arrayList6.get(i10);
            i10++;
            arrayList.add(k0.a(communityPeerDialog4, i0Var));
        }
    }

    public static void m(i0 i0Var, boolean z4, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            o0.f(new qc((FrameLayout) i0Var.containerView, i0Var.resourcesProvider), 1, z4);
            i0Var.d.D(0);
        } else if (!TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
            ai.u((FrameLayout) i0Var.containerView, i0Var.resourcesProvider, tL_error, false);
        } else {
            o0.f(new qc((FrameLayout) i0Var.containerView, i0Var.resourcesProvider), 2, z4);
            i0Var.d.D(0);
        }
    }

    public static void n(i0 i0Var, ArrayList arrayList, TLRPC.TL_error tL_error) {
        i0Var.n.setLoading(false);
        if (tL_error != null) {
            ai.u((FrameLayout) i0Var.containerView, i0Var.resourcesProvider, tL_error, false);
            return;
        }
        if (arrayList != null) {
            i0Var.N = arrayList;
            if (!arrayList.isEmpty()) {
                i0Var.x.d.V2.N(false);
                i0Var.d.D(2);
            } else {
                kf.k0.v(R.string.CommunityNoChatsToAdd, new qc((FrameLayout) i0Var.containerView, i0Var.resourcesProvider), R.raw.info, 36);
            }
        }
    }

    public static void o(i0 i0Var, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            ai.u((FrameLayout) i0Var.containerView, i0Var.resourcesProvider, tL_error, false);
        }
    }

    public static /* synthetic */ void p(i0 i0Var, d2 d2Var, long j10, boolean z4, long j11) {
        d2Var.dismiss();
        if (j11 == 0) {
            return;
        }
        i0Var.V(MessagesController.getInstance(i0Var.currentAccount).getChat(Long.valueOf(j11)), j10, z4);
    }

    public static void q(i0 i0Var, boolean z4, boolean z10, long j10) {
        d2 P = z4.P(i0Var.getContext(), i0Var.resourcesProvider, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), LocaleController.getString(z4 ? R.string.CommunityMenuRemoveBotFromCommunityConfirm : z10 ? R.string.CommunityMenuRemoveChannelFromCommunityConfirm : R.string.CommunityMenuRemoveGroupFromCommunityConfirm), LocaleController.getString(R.string.Remove), new y1(i0Var, j10, 28));
        P.show();
        TextView textView = (TextView) P.d(-1);
        if (textView != null) {
            textView.setTextColor(j6.w0(null, j6.q7, false));
        }
    }

    public static void x(i0 i0Var) {
        if (!ChatObject.canAddChatToCommunity(i0Var.f)) {
            i0Var.dismiss();
            return;
        }
        ph.d dVar = i0Var.n;
        if (dVar.K) {
            return;
        }
        dVar.setLoading(true);
        MessagesController.getInstance(i0Var.currentAccount).fetchChatsToAddToCommunity(new r(i0Var, 2));
    }

    public static void y(i0 i0Var, i51 i51Var, View view) {
        long j10;
        TLRPC.Chat chat;
        p2 p2Var = i0Var.s;
        if (i0Var.T(i51Var)) {
            return;
        }
        int i10 = i51Var.d;
        boolean z4 = false;
        if (i10 == 101) {
            i0Var.h = !i0Var.h;
            MessagesController.getInstance(i0Var.currentAccount).toggleCommunityCollapsedInDialogs(i0Var.e, i0Var.h);
            if (view instanceof q8) {
                ((q8) view).getCheckBox().c(i0Var.h, true);
                return;
            } else {
                i0Var.v.d.V2.N(false);
                return;
            }
        }
        if (i10 == 100) {
            i0Var.d.D(1);
            i0Var.J.e();
            return;
        }
        Object obj = i51Var.G;
        if (obj instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) obj;
            z4 = ChatObject.isChannelAndNotMegaGroup(chat);
            j10 = -chat.id;
        } else {
            if (!(obj instanceof TLRPC.User)) {
                return;
            }
            j10 = ((TLRPC.User) obj).id;
            chat = null;
        }
        TLRPC.Chat chat2 = chat;
        int b10 = o0.b(i0Var.currentAccount, j10);
        if (b10 != 1 && b10 != 2) {
            if (b10 == 3) {
                i80 i80Var = new i80(i0Var.getContext(), chat2, null, i0Var.s, i0Var.resourcesProvider);
                i80Var.n = new qc((FrameLayout) i0Var.containerView, i0Var.resourcesProvider);
                i80Var.show();
                return;
            } else {
                if (b10 == 4) {
                    kf.k0.v(z4 ? R.string.CommunityHiddenChannelUnavailable : R.string.CommunityHiddenGroupUnavailable, new qc((FrameLayout) i0Var.containerView, i0Var.resourcesProvider), R.raw.e_hand_2, 36);
                    return;
                }
                return;
            }
        }
        if (p2Var instanceof zn) {
            zn znVar = (zn) p2Var;
            TLRPC.Chat chat3 = znVar.e;
            TLRPC.User i11 = znVar.i();
            if ((chat3 != null && chat3.id == (-j10)) || (i11 != null && i11.id == j10)) {
                i0Var.dismiss();
                return;
            }
        }
        Bundle bundle = new Bundle();
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        if (!ChatObject.isForum(chat2)) {
            p2Var.presentFragment(new zn(bundle));
        } else if (ChatObject.areTabsEnabled(chat2)) {
            zn znVar2 = new zn(bundle);
            ag.f.a(znVar2, MessagesStorage.TopicKey.of(j10, MessagesController.getInstance(i0Var.currentAccount).getForumLastTopicId(chat2.id)));
            p2Var.presentFragment(znVar2);
        } else {
            p2Var.presentFragment(new sf1(bundle));
        }
        i0Var.dismiss();
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 1) {
            float b10 = kf.m0.b(f10);
            float lerp = AndroidUtilities.lerp(0.9f, 1.0f, b10);
            d0 d0Var = this.v;
            d0Var.a.setAlpha(b10);
            d0Var.a.setScaleX(lerp);
            d0Var.a.setScaleY(lerp);
            d0Var.a.setVisibility(b10 > 0.0f ? 0 : 8);
            float lerp2 = AndroidUtilities.lerp(0.9f, 1.0f, f10);
            d20 d20Var = this.y;
            d20Var.setAlpha(f10);
            d20Var.setScaleX(lerp2);
            d20Var.setScaleY(lerp2);
            d20Var.setVisibility(f10 > 0.0f ? 0 : 8);
            d0Var.d.setAlpha(b10);
            d0Var.d.setVisibility(b10 > 0.0f ? 0 : 8);
            this.n.setAlpha(b10);
            this.n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            this.n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            this.n.setVisibility(b10 > 0.0f ? 0 : 8);
            u10 u10Var = this.C;
            u10Var.setAlpha(f10);
            u10Var.setVisibility(f10 > 0.0f ? 0 : 8);
            this.containerView.invalidate();
            this.E.invalidate();
        }
        if (i10 == 2) {
            float b11 = kf.m0.b(f10);
            float lerp3 = AndroidUtilities.lerp(0.9f, 1.0f, b11);
            c0 c0Var = this.x;
            c0Var.a.setAlpha(b11);
            c0Var.a.setScaleX(lerp3);
            c0Var.a.setScaleY(lerp3);
            c0Var.a.setVisibility(b11 > 0.0f ? 0 : 8);
            float lerp4 = AndroidUtilities.lerp(0.9f, 1.0f, f10);
            d20 d20Var2 = this.B;
            d20Var2.setAlpha(f10);
            d20Var2.setScaleX(lerp4);
            d20Var2.setScaleY(lerp4);
            d20Var2.setVisibility(f10 > 0.0f ? 0 : 8);
            c0Var.d.setAlpha(b11);
            c0Var.d.setVisibility(b11 > 0.0f ? 0 : 8);
            if (!this.K) {
                this.r.setAlpha(b11);
                this.r.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, b11));
                this.r.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b11));
                this.r.setVisibility(b11 > 0.0f ? 0 : 8);
            }
            g61 g61Var = this.D;
            g61Var.setAlpha(f10);
            g61Var.setVisibility(f10 > 0.0f ? 0 : 8);
            this.containerView.invalidate();
            this.F.invalidate();
        }
    }

    public final boolean T(i51 i51Var) {
        Object obj = i51Var.G;
        if (!(obj instanceof th.e)) {
            return false;
        }
        th.e eVar = (th.e) obj;
        long j10 = eVar.a;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
        p2 p2Var = this.s;
        if (user != null) {
            p2Var.presentFragment(zn.R9(user.id));
            return true;
        }
        if (ChatObject.isPublic(chat) || ChatObject.isInChat(chat)) {
            p2Var.presentFragment(zn.R9(-chat.id));
            return true;
        }
        new uh.b(getContext(), chat, new e6(21, this, eVar)).show();
        return true;
    }

    public final void U(ArrayList arrayList, boolean z4) {
        String str;
        int i10 = 0;
        if (!z4) {
            arrayList.add(i51.D(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
            arrayList.add(i51.D(0, AndroidUtilities.dp(56.0f)));
        }
        if (this.N != null) {
            String lowerCase = (!z4 || (str = this.P) == null) ? null : str.toLowerCase();
            ArrayList arrayList2 = this.N;
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (!z4 || TextUtils.isEmpty(lowerCase)) {
                    arrayList.add(i51.v(chat));
                } else {
                    String str2 = chat.title;
                    if (str2 != null && str2.toLowerCase().contains(lowerCase)) {
                        arrayList.add(i51.v(chat));
                    }
                }
            }
        }
    }

    public final void V(TLRPC.Chat chat, long j10, boolean z4) {
        long j11 = -chat.id;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (ChatObject.isChannel(chat)) {
            MessagesController.getInstance(this.currentAccount).linkCommunity(j11, j10, z4, new ry0(isChannelAndNotMegaGroup, this, 2));
            return;
        }
        d2 d2Var = new d2(getContext(), 3, null);
        d2Var.q(250L);
        MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getContext(), -j11, null, new d(this, d2Var, j10, z4, 1));
    }

    public final void W(i51 i51Var) {
        Object obj = i51Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (!this.K) {
                new uh.a(getContext(), this.f, -chat.id, new s1(14, this, chat)).show();
            } else {
                this.L.run(chat);
                dismiss();
            }
        }
    }

    @Override // org.telegram.ui.Cells.m2
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean canDismissWithSwipe() {
        if (this.b.f || this.c.f) {
            return false;
        }
        View currentView = this.d.getCurrentView();
        if (currentView instanceof f0) {
            return ((f0) currentView).e;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m2
    public final void d(q2 q2Var) {
        TLRPC.TL_forumTopic findTopic;
        if (q2Var.getMessage() == null || (findTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-q2Var.getDialogId(), MessageObject.getTopicId(this.currentAccount, q2Var.getMessage().messageOwner, true))) == null) {
            return;
        }
        ag.f.m(this.s, -q2Var.getDialogId(), findTopic, 0);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatInfoDidLoad;
        long j10 = this.e;
        d0 d0Var = this.v;
        if (i10 == i12) {
            if (((TLRPC.ChatFull) objArr[0]).id == j10) {
                d0Var.d.V2.N(true);
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            Integer num = (Integer) objArr[0];
            if ((num.intValue() & MessagesController.UPDATE_MASK_CHAT) == 0 && (num.intValue() & MessagesController.UPDATE_MASK_AVATAR) == 0 && (num.intValue() & MessagesController.UPDATE_MASK_CHAT_AVATAR) == 0 && (num.intValue() & MessagesController.UPDATE_MASK_CHAT_NAME) == 0) {
                return;
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
            this.f = chat;
            d0Var.a.setTitle(DialogObject.getName(chat));
            d0Var.h.e(this.f, d0Var.n);
        }
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void dismissInternal() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        super.dismissInternal();
    }

    @Override // org.telegram.ui.Cells.m2
    public final void e(q2 q2Var) {
        if (MessagesController.getInstance(this.currentAccount).getStoriesController().I(q2Var.getDialogId())) {
            p2 p2Var = this.s;
            p2Var.getOrCreateStoryViewer().getClass();
            p2Var.getOrCreateStoryViewer().D(p2Var.getContext(), q2Var.getDialogId(), c7.a((rl0) q2Var.getParent()));
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void onBackPressed() {
        if (this.d.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        if (this.d.getCurrentPosition() == 2) {
            xd.a aVar = this.c;
            if (aVar.f) {
                this.x.d.U2.h1(1, this.R.b);
                aVar.a(false, true);
                setAllowNestedScroll(true);
                d20 d20Var = this.B;
                AndroidUtilities.hideKeyboard(d20Var.r);
                d20Var.r.clearFocus();
                return;
            }
        }
        this.d.D(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(p2 p2Var, long j10, ArrayList arrayList, j3 j3Var) {
        super(p2Var.getContext(), p2Var.getResourceProvider(), true, true);
        int i10 = 1;
        mr mrVar = mr.h;
        this.b = new xd.a(1, this, mrVar, 350L, false);
        this.c = new xd.a(2, this, mrVar, 350L, false);
        this.G = new kf.b0(2);
        int i11 = 8;
        this.H = new kf.b0(8);
        Paint paint = new Paint(1);
        this.M = paint;
        i0.b bVar = i0.b.e;
        this.Q = bVar;
        this.R = bVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.s = p2Var;
        int i12 = 0;
        this.K = arrayList != null;
        this.N = arrayList;
        this.L = j3Var;
        Context context = p2Var.getContext();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        int i13 = j6.a7;
        paint.setColor(j6.v0(i13, this.resourcesProvider));
        fixNavigationBar(j6.v0(i13, this.resourcesProvider));
        this.containerView = new sz(this, context);
        gk gkVar = new gk(this, context, i11);
        this.d = gkVar;
        int i14 = this.backgroundPaddingLeft;
        gkVar.setPadding(i14, 0, i14, 0);
        this.containerView.addView(this.d, b6.e(-1, -1, 119));
        int i15 = 9;
        this.E = new nw0(this, context, i15);
        this.F = new nw0(this, context, i15);
        d20 d20Var = new d20(context, this.resourcesProvider);
        this.y = d20Var;
        d20Var.setCloseButtonVisible(true);
        d20Var.x = true;
        d20Var.e();
        String string = LocaleController.getString(R.string.Search);
        kg.f fVar = d20Var.r;
        fVar.setHint(string);
        fVar.addTextChangedListener(new u(this));
        d20Var.setVisibility(8);
        d20 d20Var2 = new d20(context, this.resourcesProvider);
        this.B = d20Var2;
        d20Var2.setCloseButtonVisible(true);
        d20Var2.x = true;
        d20Var2.e();
        String string2 = LocaleController.getString(R.string.Search);
        kg.f fVar2 = d20Var2.r;
        fVar2.setHint(string2);
        fVar2.addTextChangedListener(new v(this));
        d20Var2.setVisibility(8);
        g61 g61Var = new g61(context, this.currentAccount, 0, false, new r(this, i12), new s(this, i12), null, this.resourcesProvider);
        this.D = g61Var;
        g61Var.j(new w(this));
        g61Var.setClipToPadding(false);
        g61Var.setVisibility(8);
        g61Var.o1();
        g61Var.V2.r = false;
        g61Var.setPadding(0, AndroidUtilities.dp(52.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight);
        u10 u10Var = new u10(p2Var);
        this.C = u10Var;
        u10Var.setVisibility(8);
        u10Var.setBackground(null);
        u10Var.setChatPreviewDelegate(new x());
        u10Var.setUiCallback(new y(this));
        u10Var.b.setClipToPadding(false);
        this.I = new View(getContext());
        Context context2 = getContext();
        f6 f6Var = this.resourcesProvider;
        n0 n0Var = new n0(context2, f6Var, new qc((FrameLayout) this.containerView, f6Var), this.currentAccount, j10);
        this.J = n0Var;
        n0Var.h = new z(this, p2Var);
        this.e = j10;
        this.f = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
        MessagesController.getInstance(this.currentAccount).getChatFull(j10);
        TLRPC.Chat chat = this.f;
        this.h = chat != null && chat.collapsed_in_dialogs;
        tf.e0 e0Var = new tf.e0(R.drawable.search_users_filled, 4, DialogObject.getShortName(chat));
        e0Var.f = this.f;
        e0Var.h = false;
        ArrayList arrayList2 = d20Var.C;
        arrayList2.add(e0Var);
        d20Var.F = arrayList2.size() - 1;
        d20Var.f();
        setBackgroundColor(j6.v0(i13, this.resourcesProvider));
        this.w = new h0(this, context);
        this.v = new d0(this, context);
        this.x = new c0(this, context);
        this.d.setAdapter(new a0(this));
        d20Var.setCloseButtonOnClickListener(new t(this, i12));
        d20Var2.setCloseButtonOnClickListener(new t(this, i10));
        n0Var.d();
        MessagesController.getInstance(this.currentAccount).loadFullChat(j10, 0, true);
        ic.a((FrameLayout) this.containerView, new b0());
        ViewGroup viewGroup = this.containerView;
        s sVar = new s(this, i10);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(viewGroup, sVar);
    }

    @Override // org.telegram.ui.Cells.m2
    public final void c() {
    }

    @Override // org.telegram.ui.Cells.m2
    public final void a(q2 q2Var) {
    }

    @Override // org.telegram.ui.Cells.m2
    public final void f(q2 q2Var) {
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }
}
