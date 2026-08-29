package qh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import i7.f6;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.w41;
import org.telegram.ui.th;
import org.telegram.ui.yu0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class g extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public long a;
    public TLRPC.Chat b;
    public TLRPC.User c;
    public FrameLayout d;
    public u51 e;
    public f f;
    public ArrayList h;
    public NotificationCenter.ObserversGroup n;

    public static void U(g gVar, w41 w41Var) {
        g gVar2;
        if (w41Var.d == 1) {
            gVar2 = gVar;
            c5.R(gVar.getParentActivity(), gVar2, LocaleController.getString(R.string.CommunityNewCommunityTitle), null, LocaleController.getString(R.string.CommunityNewCommunityNameHint), null, ConnectionsManager.DEFAULT_DATACENTER_ID, LocaleController.getString(R.string.Create), gVar.resourceProvider, new c(gVar));
        } else {
            gVar2 = gVar;
        }
        Object obj = w41Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            gVar2.getMessagesController().getChat(Long.valueOf(-gVar2.a));
            gVar2.showDialog(new sh.a(gVar2.getParentActivity(), chat, gVar2.a, new yu0(14, gVar2, chat)));
        }
    }

    public final void V(String str, boolean z10) {
        if (ChatObject.isChannel(this.b) || this.c != null) {
            getMessagesController().createCommunity(str, this.a, z10, new b(this, 1));
            return;
        }
        c2 c2Var = new c2(getParentActivity(), 3, null);
        c2Var.q(250L);
        getMessagesController().convertToMegaGroup(getParentActivity(), -this.a, this, new m9.b(this, c2Var, str, z10, 5));
    }

    public final void W(long j10, boolean z10) {
        if (ChatObject.isChannel(this.b) || this.c != null) {
            int i10 = this.currentAccount;
            long j11 = -this.a;
            MessagesController.getInstance(i10).linkCommunity(-j11, j10, z10, new ih.m(this, j11, 3));
        } else {
            c2 c2Var = new c2(getParentActivity(), 3, null);
            c2Var.q(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.a, this, new d(this, c2Var, j10, z10, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        th.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new e(this, 0));
        qg.c cVar = new qg.c();
        cVar.a(getThemedColor(g6.d6));
        lg.a aVar = new lg.a(cVar);
        this.actionBar.setBackground(null);
        this.actionBar.L(aVar, pg.a.n(this.resourceProvider), false);
        this.actionBar.L0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setBackgroundColor(g6.w0(null, g6.a7, false));
        f fVar = new f(context, this.resourceProvider);
        this.f = fVar;
        fVar.setTitle(LocaleController.getString(R.string.CommunityTitle));
        this.f.setSubtitle(LocaleController.getString(this.c != null ? R.string.CommunityDescriptionBot : ChatObject.isChannelAndNotMegaGroup(this.b) ? R.string.CommunityDescriptionChannel : R.string.CommunityDescriptionGroup));
        this.f.setTag(-33024);
        TLRPC.User user = this.c;
        if (user != null) {
            this.f.a.e(user, new e9(0, this.c));
        } else {
            TLRPC.Chat chat = this.b;
            if (chat != null) {
                this.f.a.e(chat, new e9(this.b));
            }
        }
        u51 u51Var = new u51(this, new b(this, 0), new c(this), new c(this));
        this.e = u51Var;
        u51Var.setClipToPadding(false);
        u51 u51Var2 = this.e;
        u51Var2.U2.r = false;
        u51Var2.p1();
        this.d.addView(this.e, f6.c(-1.0f, -1));
        this.d.addView(this.actionBar, f6.e(-1, -2, 48));
        FrameLayout frameLayout2 = this.d;
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j10 = chatFull.id;
            View y12 = this.e.y1((int) (j10 ^ (j10 >>> 32)));
            if (!(y12 instanceof org.telegram.ui.Cells.f6)) {
                this.e.U2.N(false);
                return;
            }
            org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) y12;
            ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
            f6Var.setSubLabel(LocaleController.formatPluralString("Chats", arrayList != null ? arrayList.size() : 0, new Object[0]));
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        this.a = this.arguments.getLong("dialog_id", 0L);
        this.b = getMessagesController().getChat(Long.valueOf(-this.a));
        this.c = getMessagesController().getUser(Long.valueOf(this.a));
        this.h = getMessagesController().getJoinedCommunities();
        getMessagesController().fetchJoinedCommunities(new nh.b0(this, 14), this.classGuid);
        this.n = getNotificationCenter().createObserversGroup(this).add(NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        NotificationCenter.ObserversGroup observersGroup = this.n;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.n = null;
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        super.onInsets(i10, i11, i12, i13);
        this.e.setPadding(0, i11, 0, i13);
    }
}
