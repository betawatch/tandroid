package th;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import k7.c6;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.z4;
import org.telegram.ui.Components.z8;
import org.telegram.ui.web.a2;
import org.telegram.ui.web.d1;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class g extends p2 implements NotificationCenter.NotificationCenterDelegate {
    public long a;
    public TLRPC.Chat b;
    public TLRPC.User c;
    public FrameLayout d;
    public h61 e;
    public f f;
    public ArrayList h;
    public NotificationCenter.ObserversGroup n;

    public static void U(g gVar, h51 h51Var) {
        g gVar2;
        if (h51Var.d == 1) {
            gVar2 = gVar;
            z4.R(gVar.getParentActivity(), gVar2, LocaleController.getString(R.string.CommunityNewCommunityTitle), null, LocaleController.getString(R.string.CommunityNewCommunityNameHint), null, ConnectionsManager.DEFAULT_DATACENTER_ID, LocaleController.getString(R.string.Create), gVar.resourceProvider, new c(gVar));
        } else {
            gVar2 = gVar;
        }
        Object obj = h51Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            gVar2.getMessagesController().getChat(Long.valueOf(-gVar2.a));
            gVar2.showDialog(new vh.a(gVar2.getParentActivity(), chat, gVar2.a, new a2(13, gVar2, chat)));
        }
    }

    public final void V(String str, boolean z4) {
        if (ChatObject.isChannel(this.b) || this.c != null) {
            getMessagesController().createCommunity(str, this.a, z4, new b(this, 1));
            return;
        }
        d2 d2Var = new d2(getParentActivity(), 3, null);
        d2Var.q(250L);
        getMessagesController().convertToMegaGroup(getParentActivity(), -this.a, this, new o9.b(this, d2Var, str, z4, 5));
    }

    public final void W(long j10, boolean z4) {
        if (ChatObject.isChannel(this.b) || this.c != null) {
            int i10 = this.currentAccount;
            long j11 = -this.a;
            MessagesController.getInstance(i10).linkCommunity(-j11, j10, z4, new lh.l(this, j11, 3));
        } else {
            d2 d2Var = new d2(getParentActivity(), 3, null);
            d2Var.q(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.a, this, new d(this, d2Var, j10, z4, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        yh.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new e(this, 0));
        tg.c cVar = new tg.c();
        cVar.a(getThemedColor(k6.d6));
        og.a aVar = new og.a(cVar);
        this.actionBar.setBackground(null);
        this.actionBar.M(aVar, sg.b.o(this.resourceProvider), false);
        this.actionBar.M0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setBackgroundColor(k6.w0(null, k6.a7, false));
        f fVar = new f(context, this.resourceProvider);
        this.f = fVar;
        fVar.setTitle(LocaleController.getString(R.string.CommunityTitle));
        this.f.setSubtitle(LocaleController.getString(this.c != null ? R.string.CommunityDescriptionBot : ChatObject.isChannelAndNotMegaGroup(this.b) ? R.string.CommunityDescriptionChannel : R.string.CommunityDescriptionGroup));
        this.f.setTag(-33024);
        TLRPC.User user = this.c;
        if (user != null) {
            this.f.a.e(user, new z8(0, this.c));
        } else {
            TLRPC.Chat chat = this.b;
            if (chat != null) {
                this.f.a.e(chat, new z8(this.b));
            }
        }
        h61 h61Var = new h61(this, new b(this, 0), new c(this), new c(this));
        this.e = h61Var;
        h61Var.setClipToPadding(false);
        h61 h61Var2 = this.e;
        h61Var2.V2.r = false;
        h61Var2.o1();
        this.d.addView(this.e, c6.c(-1.0f, -1));
        this.d.addView(this.actionBar, c6.e(-1, -2, 48));
        FrameLayout frameLayout2 = this.d;
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j10 = chatFull.id;
            View x12 = this.e.x1((int) (j10 ^ (j10 >>> 32)));
            if (!(x12 instanceof h6)) {
                this.e.V2.N(false);
                return;
            }
            h6 h6Var = (h6) x12;
            ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
            h6Var.setSubLabel(LocaleController.formatPluralString("Chats", arrayList != null ? arrayList.size() : 0, new Object[0]));
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        this.a = this.arguments.getLong("dialog_id", 0L);
        this.b = getMessagesController().getChat(Long.valueOf(-this.a));
        this.c = getMessagesController().getUser(Long.valueOf(this.a));
        this.h = getMessagesController().getJoinedCommunities();
        getMessagesController().fetchJoinedCommunities(new d1(this, 14), this.classGuid);
        this.n = getNotificationCenter().createObserversGroup(this).add(NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        NotificationCenter.ObserversGroup observersGroup = this.n;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.n = null;
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        super.onInsets(i10, i11, i12, i13);
        this.e.setPadding(0, i11, 0, i13);
    }
}
