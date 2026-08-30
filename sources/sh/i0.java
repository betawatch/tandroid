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
import kh.a2;
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
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.ek;
import org.telegram.ui.gw0;
import org.telegram.ui.kf1;
import org.telegram.ui.ky0;
import org.telegram.ui.qz;
import org.telegram.ui.t10;
import org.telegram.ui.web.u1;
import org.telegram.ui.xn;
import org.telegram.ui.yh;
import ph.f6;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class i0 extends g3 implements NotificationCenter.NotificationCenterDelegate, xd.b, n2 {
    public static final /* synthetic */ int S = 0;
    public final c20 B;
    public final t10 C;
    public final g61 D;
    public final gw0 E;
    public final gw0 F;
    public final lf.b0 G;
    public final lf.b0 H;
    public final View I;
    public final o0 J;
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
    public final ek d;
    public final long e;
    public TLRPC.Chat f;
    public boolean h;
    public ph.d n;
    public ph.d r;
    public final p2 s;
    public final d0 v;
    public final h0 w;
    public final c0 x;
    public final c20 y;

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
        o0 o0Var = i0Var.J;
        boolean z10 = true;
        if (o0Var.n && o0Var.l == 1 && (arrayList2 = o0Var.j) != null && arrayList2.size() == 1) {
            arrayList.add(i51.s(3, LocaleController.getString(R.string.CommunityPendingRequest)));
            o0Var.c(arrayList);
            arrayList.add(i51.D(5, AndroidUtilities.dp(14.33f)));
        } else {
            int i11 = o0Var.l;
            if (i11 > 0) {
                int i12 = o0Var.p;
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
            p0.f(new qc((FrameLayout) i0Var.containerView, i0Var.resourcesProvider), 1, z4);
            i0Var.d.D(0);
        } else if (!TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
            yh.u((FrameLayout) i0Var.containerView, i0Var.resourcesProvider, tL_error, false);
        } else {
            p0.f(new qc((FrameLayout) i0Var.containerView, i0Var.resourcesProvider), 2, z4);
            i0Var.d.D(0);
        }
    }

    public static void n(i0 i0Var, ArrayList arrayList, TLRPC.TL_error tL_error) {
        i0Var.n.setLoading(false);
        if (tL_error != null) {
            yh.u((FrameLayout) i0Var.containerView, i0Var.resourcesProvider, tL_error, false);
            return;
        }
        if (arrayList != null) {
            i0Var.N = arrayList;
            if (!arrayList.isEmpty()) {
                i0Var.x.d.V2.N(false);
                i0Var.d.D(2);
            } else {
                a2.v(R.string.CommunityNoChatsToAdd, new qc((FrameLayout) i0Var.containerView, i0Var.resourcesProvider), R.raw.info, 36);
            }
        }
    }

    public static void o(i0 i0Var, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            yh.u((FrameLayout) i0Var.containerView, i0Var.resourcesProvider, tL_error, false);
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
        d2 P = z4.P(i0Var.getContext(), i0Var.resourcesProvider, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), LocaleController.getString(z4 ? R.string.CommunityMenuRemoveBotFromCommunityConfirm : z10 ? R.string.CommunityMenuRemoveChannelFromCommunityConfirm : R.string.CommunityMenuRemoveGroupFromCommunityConfirm), LocaleController.getString(R.string.Remove), new y1(i0Var, j10, 29));
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
            if (view instanceof r8) {
                ((r8) view).getCheckBox().c(i0Var.h, true);
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
        int b10 = p0.b(i0Var.currentAccount, j10);
        if (b10 != 1 && b10 != 2) {
            if (b10 == 3) {
                h80 h80Var = new h80(i0Var.getContext(), chat2, null, i0Var.s, i0Var.resourcesProvider);
                h80Var.n = new qc((FrameLayout) i0Var.containerView, i0Var.resourcesProvider);
                h80Var.show();
                return;
            } else {
                if (b10 == 4) {
                    a2.v(z4 ? R.string.CommunityHiddenChannelUnavailable : R.string.CommunityHiddenGroupUnavailable, new qc((FrameLayout) i0Var.containerView, i0Var.resourcesProvider), R.raw.e_hand_2, 36);
                    return;
                }
                return;
            }
        }
        if (p2Var instanceof xn) {
            xn xnVar = (xn) p2Var;
            TLRPC.Chat chat3 = xnVar.e;
            TLRPC.User i11 = xnVar.i();
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
            p2Var.presentFragment(new xn(bundle));
        } else if (ChatObject.areTabsEnabled(chat2)) {
            xn xnVar2 = new xn(bundle);
            ag.f.a(xnVar2, MessagesStorage.TopicKey.of(j10, MessagesController.getInstance(i0Var.currentAccount).getForumLastTopicId(chat2.id)));
            p2Var.presentFragment(xnVar2);
        } else {
            p2Var.presentFragment(new kf1(bundle));
        }
        i0Var.dismiss();
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 1) {
            float b10 = lf.l0.b(f10);
            float lerp = AndroidUtilities.lerp(0.9f, 1.0f, b10);
            d0 d0Var = this.v;
            d0Var.a.setAlpha(b10);
            d0Var.a.setScaleX(lerp);
            d0Var.a.setScaleY(lerp);
            d0Var.a.setVisibility(b10 > 0.0f ? 0 : 8);
            float lerp2 = AndroidUtilities.lerp(0.9f, 1.0f, f10);
            c20 c20Var = this.y;
            c20Var.setAlpha(f10);
            c20Var.setScaleX(lerp2);
            c20Var.setScaleY(lerp2);
            c20Var.setVisibility(f10 > 0.0f ? 0 : 8);
            d0Var.d.setAlpha(b10);
            d0Var.d.setVisibility(b10 > 0.0f ? 0 : 8);
            this.n.setAlpha(b10);
            this.n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            this.n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            this.n.setVisibility(b10 > 0.0f ? 0 : 8);
            t10 t10Var = this.C;
            t10Var.setAlpha(f10);
            t10Var.setVisibility(f10 > 0.0f ? 0 : 8);
            this.containerView.invalidate();
            this.E.invalidate();
        }
        if (i10 == 2) {
            float b11 = lf.l0.b(f10);
            float lerp3 = AndroidUtilities.lerp(0.9f, 1.0f, b11);
            c0 c0Var = this.x;
            c0Var.a.setAlpha(b11);
            c0Var.a.setScaleX(lerp3);
            c0Var.a.setScaleY(lerp3);
            c0Var.a.setVisibility(b11 > 0.0f ? 0 : 8);
            float lerp4 = AndroidUtilities.lerp(0.9f, 1.0f, f10);
            c20 c20Var2 = this.B;
            c20Var2.setAlpha(f10);
            c20Var2.setScaleX(lerp4);
            c20Var2.setScaleY(lerp4);
            c20Var2.setVisibility(f10 > 0.0f ? 0 : 8);
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
            p2Var.presentFragment(xn.R9(user.id));
            return true;
        }
        if (ChatObject.isPublic(chat) || ChatObject.isInChat(chat)) {
            p2Var.presentFragment(xn.R9(-chat.id));
            return true;
        }
        new uh.b(getContext(), chat, new f6(19, this, eVar)).show();
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
            MessagesController.getInstance(this.currentAccount).linkCommunity(j11, j10, z4, new ky0(isChannelAndNotMegaGroup, this, 2));
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
                new uh.a(getContext(), this.f, -chat.id, new u1(16, this, chat)).show();
            } else {
                this.L.run(chat);
                dismiss();
            }
        }
    }

    @Override // org.telegram.ui.Cells.n2
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

    @Override // org.telegram.ui.Cells.n2
    public final void d(r2 r2Var) {
        TLRPC.TL_forumTopic findTopic;
        if (r2Var.getMessage() == null || (findTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-r2Var.getDialogId(), MessageObject.getTopicId(this.currentAccount, r2Var.getMessage().messageOwner, true))) == null) {
            return;
        }
        ag.f.m(this.s, -r2Var.getDialogId(), findTopic, 0);
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

    @Override // org.telegram.ui.Cells.n2
    public final void e(r2 r2Var) {
        if (MessagesController.getInstance(this.currentAccount).getStoriesController().I(r2Var.getDialogId())) {
            p2 p2Var = this.s;
            p2Var.getOrCreateStoryViewer().getClass();
            p2Var.getOrCreateStoryViewer().D(p2Var.getContext(), r2Var.getDialogId(), c7.a((sl0) r2Var.getParent()));
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
                c20 c20Var = this.B;
                AndroidUtilities.hideKeyboard(c20Var.r);
                c20Var.r.clearFocus();
                return;
            }
        }
        this.d.D(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(p2 p2Var, long j10, ArrayList arrayList, j3 j3Var) {
        super(p2Var.getContext(), p2Var.getResourceProvider(), true, true);
        int i10 = 1;
        nr nrVar = nr.h;
        this.b = new xd.a(1, this, nrVar, 350L, false);
        this.c = new xd.a(2, this, nrVar, 350L, false);
        this.G = new lf.b0(2);
        int i11 = 8;
        this.H = new lf.b0(8);
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
        this.containerView = new qz(this, context);
        ek ekVar = new ek(this, context, i11);
        this.d = ekVar;
        int i14 = this.backgroundPaddingLeft;
        ekVar.setPadding(i14, 0, i14, 0);
        this.containerView.addView(this.d, b6.e(-1, -1, 119));
        int i15 = 9;
        this.E = new gw0(this, context, i15);
        this.F = new gw0(this, context, i15);
        c20 c20Var = new c20(context, this.resourcesProvider);
        this.y = c20Var;
        c20Var.setCloseButtonVisible(true);
        c20Var.x = true;
        c20Var.e();
        String string = LocaleController.getString(R.string.Search);
        kg.f fVar = c20Var.r;
        fVar.setHint(string);
        fVar.addTextChangedListener(new u(this));
        c20Var.setVisibility(8);
        c20 c20Var2 = new c20(context, this.resourcesProvider);
        this.B = c20Var2;
        c20Var2.setCloseButtonVisible(true);
        c20Var2.x = true;
        c20Var2.e();
        String string2 = LocaleController.getString(R.string.Search);
        kg.f fVar2 = c20Var2.r;
        fVar2.setHint(string2);
        fVar2.addTextChangedListener(new v(this));
        c20Var2.setVisibility(8);
        g61 g61Var = new g61(context, this.currentAccount, 0, false, new r(this, i12), new s(this, i12), null, this.resourcesProvider);
        this.D = g61Var;
        g61Var.j(new w(this));
        g61Var.setClipToPadding(false);
        g61Var.setVisibility(8);
        g61Var.p1();
        g61Var.V2.r = false;
        g61Var.setPadding(0, AndroidUtilities.dp(52.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight);
        t10 t10Var = new t10(p2Var);
        this.C = t10Var;
        t10Var.setVisibility(8);
        t10Var.setBackground(null);
        t10Var.setChatPreviewDelegate(new x());
        t10Var.setUiCallback(new y(this));
        t10Var.b.setClipToPadding(false);
        this.I = new View(getContext());
        Context context2 = getContext();
        org.telegram.ui.ActionBar.f6 f6Var = this.resourcesProvider;
        o0 o0Var = new o0(context2, f6Var, new qc((FrameLayout) this.containerView, f6Var), this.currentAccount, j10);
        this.J = o0Var;
        o0Var.h = new z(this, p2Var);
        this.e = j10;
        this.f = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
        MessagesController.getInstance(this.currentAccount).getChatFull(j10);
        TLRPC.Chat chat = this.f;
        this.h = chat != null && chat.collapsed_in_dialogs;
        tf.e0 e0Var = new tf.e0(R.drawable.search_users_filled, 4, DialogObject.getShortName(chat));
        e0Var.f = this.f;
        e0Var.h = false;
        ArrayList arrayList2 = c20Var.C;
        arrayList2.add(e0Var);
        c20Var.F = arrayList2.size() - 1;
        c20Var.f();
        setBackgroundColor(j6.v0(i13, this.resourcesProvider));
        this.w = new h0(this, context);
        this.v = new d0(this, context);
        this.x = new c0(this, context);
        this.d.setAdapter(new a0(this));
        c20Var.setCloseButtonOnClickListener(new t(this, i12));
        c20Var2.setCloseButtonOnClickListener(new t(this, i10));
        o0Var.d();
        MessagesController.getInstance(this.currentAccount).loadFullChat(j10, 0, true);
        ic.a((FrameLayout) this.containerView, new b0());
        ViewGroup viewGroup = this.containerView;
        s sVar = new s(this, i10);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(viewGroup, sVar);
    }

    @Override // org.telegram.ui.Cells.n2
    public final void c() {
    }

    @Override // org.telegram.ui.Cells.n2
    public final void a(r2 r2Var) {
    }

    @Override // org.telegram.ui.Cells.n2
    public final void f(r2 r2Var) {
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }
}
