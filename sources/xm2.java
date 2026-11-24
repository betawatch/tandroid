// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class xm2 extends d implements gk7 {
    public ix4 a;
    public long b;
    public TLRPC.Chat c;
    public TLRPC.User d;
    public FrameLayout e;
    public q5c f;
    public wm2 h;
    public ArrayList n;
    public wtc r;

    public final void Y(String str, boolean z) {
        if (!hc2.T(this.c) && this.d == null) {
            hd hdVar = new hd(3, null, getParentActivity());
            hdVar.q(250L);
            getMessagesController().P(getParentActivity(), -this.b, this, new xf(this, hdVar, str, z, (byte) 2), null);
            return;
        }
        na7 messagesController = getMessagesController();
        long j = this.b;
        sm2 sm2Var = new sm2(this, (byte) 1);
        messagesController.getClass();
        TL_communities.TL_communities_create tL_communities_create = new TL_communities.TL_communities_create();
        tL_communities_create.title = str;
        tL_communities_create.peer = messagesController.h1(j);
        tL_communities_create.hidden = z;
        messagesController.getConnectionsManager().sendRequestTypedAndProcessUpdates(tL_communities_create, new hc((byte) 0), new ur4(sm2Var, (byte) 19));
    }

    public final void Z(long j, boolean z) {
        if (hc2.T(this.c) || this.d != null) {
            int i = this.currentAccount;
            long j2 = -this.b;
            na7.q1(i).S2(-j2, j, false, z, new jy(this, j2, (byte) 1));
        } else {
            hd hdVar = new hd(3, null, getParentActivity());
            hdVar.q(250L);
            getMessagesController().P(getParentActivity(), -this.b, this, new um2(this, hdVar, j, z, (byte) 0), null);
        }
    }

    public final void a0(c4c c4cVar) {
        xm2 xm2Var;
        if (c4cVar.d == 1) {
            xm2Var = this;
            ij.O(getParentActivity(), xm2Var, k96.M0(2131751894, null), null, k96.M0(2131751895, null), null, ConnectionsManager.DEFAULT_DATACENTER_ID, k96.M0(2131751741, null), this.resourceProvider, new tm2(this));
        } else {
            xm2Var = this;
        }
        Object obj = c4cVar.H;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            xm2Var.getMessagesController().K0(Long.valueOf(-xm2Var.b));
            xm2Var.showDialog(new qm2(xm2Var.getParentActivity(), chat, xm2Var.b, new pz1(xm2Var, chat, (byte) 7)));
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setBackButtonDrawable(new ed0(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new vm2(this, (byte) 0));
        ix4 ix4Var = new ix4();
        ix4Var.a(getThemedColor(bkb.c6));
        this.a = ix4Var;
        kl0 kl0Var = new kl0(ix4Var, ix4Var, ix4Var);
        this.actionBar.setBackground(null);
        this.actionBar.P(kl0Var, nod.o(this.resourceProvider), false);
        this.actionBar.R0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        zkb.h(bkb.Z6, null, frameLayout);
        wm2 wm2Var = new wm2(context, this.resourceProvider);
        this.h = wm2Var;
        wm2Var.setTitle(k96.M0(2131751835, null));
        this.h.setSubtitle(k96.M0(this.d != null ? 2131751921 : hc2.V(this.c) ? 2131751920 : 2131751919, null));
        this.h.setTag(-33024);
        TLRPC.User user = this.d;
        if (user != null) {
            this.h.a.f(user, new pb0(0, this.d));
        } else {
            TLRPC.Chat chat = this.c;
            if (chat != null) {
                this.h.a.f(chat, new pb0(this.c));
            }
        }
        q5c q5cVar = new q5c(this, new sm2(this, (byte) 0), new tm2(this), new k32(this, (byte) 20));
        this.f = q5cVar;
        q5cVar.setClipToPadding(false);
        q5c q5cVar2 = this.f;
        l5c l5cVar = q5cVar2.g3;
        l5cVar.r = false;
        l5cVar.s = true;
        q5cVar2.r1();
        this.e.addView(this.f, nme.c(-1.0f, -1));
        this.e.addView(this.actionBar, nme.e(-1, -2, 48));
        FrameLayout frameLayout2 = this.e;
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.S) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j = chatFull.id;
            View B1 = this.f.B1((int) (j ^ (j >>> 32)));
            if (!(B1 instanceof rr8)) {
                this.f.g3.O(false);
                return;
            }
            rr8 rr8Var = (rr8) B1;
            ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
            rr8Var.setSubLabel(k96.G(arrayList != null ? arrayList.size() : 0, "Chats", new Object[0]));
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        this.b = this.arguments.getLong("dialog_id", 0L);
        this.c = getMessagesController().K0(Long.valueOf(-this.b));
        this.d = getMessagesController().V1(Long.valueOf(this.b));
        this.n = getMessagesController().E4;
        na7 messagesController = getMessagesController();
        be2 be2Var = new be2(this, (byte) 26);
        int i = this.classGuid;
        messagesController.getClass();
        messagesController.getConnectionsManager().bindRequestToGuid(messagesController.getConnectionsManager().sendRequestTyped(new TL_communities.TL_communities_getJoinedCommunities(), new hc((byte) 0), new w77(messagesController, be2Var, (byte) 1)), i);
        kk7 notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        wtc wtcVar = new wtc(notificationCenter, this);
        wtcVar.b(kk7.S);
        this.r = wtcVar;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        wtc wtcVar = this.r;
        if (wtcVar != null) {
            wtcVar.a();
            this.r = null;
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onInsets(int i, int i2, int i3, int i4) {
        super.onInsets(i, i2, i3, i4);
        this.f.setPadding(0, i2, 0, i4);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            ix4 ix4Var = this.a;
            if (ix4Var != null) {
                ix4Var.a(getThemedColor(bkb.c6));
            }
            a aVar = this.actionBar;
            if (aVar != null) {
                aVar.invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
