package yh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.o4;
import java.util.ArrayList;
import org.telegram.messenger.a4;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.k6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.u51;
import org.telegram.ui.a80;
import org.telegram.ui.y01;
import rh.e3;
import vh.m6;
import w7.b6;
import w7.b9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e extends k2 implements us {
    public hi.c a;
    public long b;
    public TLRPC.Chat c;
    public TLRPC.User d;
    public FrameLayout e;
    public u51 f;
    public d h;
    public ArrayList n;
    public xa.n r;

    public static void Y(e eVar, a51 a51Var) {
        e eVar2;
        if (a51Var.d == 1) {
            eVar2 = eVar;
            s4.Q(eVar.getParentActivity(), eVar2, cd.L0(2131751906, null), null, cd.L0(2131751907, null), null, ConnectionsManager.DEFAULT_DATACENTER_ID, cd.L0(2131751753, null), eVar.resourceProvider, new b(eVar));
        } else {
            eVar2 = eVar;
        }
        Object obj = a51Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            eVar2.getMessagesController().L0(Long.valueOf(-eVar2.b));
            eVar2.showDialog(new ai.a(eVar2.getParentActivity(), chat, eVar2.b, new e3(15, eVar2, chat)));
        }
    }

    public final void Z(String str, boolean z10) {
        if (!w3.T(this.c) && this.d == null) {
            x1 x1Var = new x1(3, getParentActivity(), null);
            x1Var.r(250L);
            getMessagesController().T(getParentActivity(), -this.b, this, new o4(this, x1Var, str, z10, 7), null);
            return;
        }
        vp messagesController = getMessagesController();
        long j10 = this.b;
        a aVar = new a(this, 1);
        messagesController.getClass();
        TL_communities.TL_communities_create tL_communities_create = new TL_communities.TL_communities_create();
        tL_communities_create.title = str;
        tL_communities_create.peer = messagesController.i1(j10);
        tL_communities_create.hidden = z10;
        messagesController.getConnectionsManager().sendRequestTypedAndProcessUpdates(tL_communities_create, new a3.b(1), new org.telegram.messenger.d(aVar, 5));
    }

    public final void a0(long j10, boolean z10) {
        if (w3.T(this.c) || this.d != null) {
            int i10 = this.currentAccount;
            long j11 = -this.b;
            vp.r1(i10).O2(-j11, j10, false, z10, new a80(this, j11, 2));
        } else {
            x1 x1Var = new x1(3, getParentActivity(), null);
            x1Var.r(250L);
            getMessagesController().T(getParentActivity(), -this.b, this, new c(this, x1Var, j10, z10, 0), null);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setBackButtonDrawable(new c2(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new y01(this, 20));
        hi.c cVar = new hi.c();
        cVar.a(getThemedColor(t6.d6));
        this.a = cVar;
        tg.b bVar = new tg.b(cVar);
        this.actionBar.setBackground(null);
        this.actionBar.M(bVar, b9.p(this.resourceProvider), false);
        this.actionBar.Q0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        a7.i(t6.a7, frameLayout, null);
        d dVar = new d(context, this.resourceProvider);
        this.h = dVar;
        dVar.setTitle(cd.L0(2131751847, null));
        this.h.setSubtitle(cd.L0(this.d != null ? 2131751933 : w3.V(this.c) ? 2131751932 : 2131751931, null));
        this.h.setTag(-33024);
        TLRPC.User user = this.d;
        if (user != null) {
            this.h.a.e(user, new r8(0, this.d));
        } else {
            TLRPC.Chat chat = this.c;
            if (chat != null) {
                this.h.a.e(chat, new r8(this.c));
            }
        }
        u51 u51Var = new u51(this, new a(this, 0), new b(this), new xg.a(24, this));
        this.f = u51Var;
        u51Var.setClipToPadding(false);
        u51 u51Var2 = this.f;
        p51 p51Var = u51Var2.f3;
        p51Var.r = false;
        p51Var.s = true;
        u51Var2.r1();
        this.e.addView(this.f, b6.c(-1.0f, -1));
        this.e.addView(this.actionBar, b6.e(-1, -2, 48));
        FrameLayout frameLayout2 = this.e;
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j10 = chatFull.id;
            View B1 = this.f.B1((int) (j10 ^ (j10 >>> 32)));
            if (!(B1 instanceof k6)) {
                this.f.f3.O(false);
                return;
            }
            k6 k6Var = (k6) B1;
            ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
            k6Var.setSubLabel(cd.G(arrayList != null ? arrayList.size() : 0, "Chats", new Object[0]));
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        this.b = this.arguments.getLong("dialog_id", 0L);
        this.c = getMessagesController().L0(Long.valueOf(-this.b));
        this.d = getMessagesController().Z1(Long.valueOf(this.b));
        this.n = getMessagesController().R7;
        vp messagesController = getMessagesController();
        m6 m6Var = new m6(this, 3);
        int i10 = this.classGuid;
        messagesController.getClass();
        messagesController.getConnectionsManager().bindRequestToGuid(messagesController.getConnectionsManager().sendRequestTyped(new TL_communities.TL_communities_getJoinedCommunities(), new a3.b(1), new a4(3, messagesController, m6Var)), i10);
        zs notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        xa.n nVar = new xa.n(notificationCenter, this);
        nVar.e(zs.T);
        this.r = nVar;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        xa.n nVar = this.r;
        if (nVar != null) {
            nVar.a();
            this.r = null;
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        super.onInsets(i10, i11, i12, i13);
        this.f.setPadding(0, i11, 0, i13);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            hi.c cVar = this.a;
            if (cVar != null) {
                cVar.a(getThemedColor(t6.d6));
            }
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.invalidate();
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
