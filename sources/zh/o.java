package zh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ja;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ba;
import org.telegram.ui.ke;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class o {
    public static volatile o[] m = new o[4];
    public static final Object[] n = new Object[4];
    public final int a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final HashMap g = new HashMap();
    public final HashMap h = new HashMap();
    public boolean i;
    public ArrayList j;
    public boolean k;
    public ArrayList l;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            n[i10] = new Object();
        }
    }

    public o(int i10) {
        this.a = i10;
    }

    public static o g(int i10) {
        o oVar;
        o oVar2 = m[i10];
        if (oVar2 != null) {
            return oVar2;
        }
        synchronized (n[i10]) {
            try {
                oVar = m[i10];
                if (oVar == null) {
                    o[] oVarArr = m;
                    o oVar3 = new o(i10);
                    oVarArr[i10] = oVar3;
                    oVar = oVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return oVar;
    }

    public final boolean a(long j3) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_payments_starsRevenueStats h = h(j3, false);
        return (h == null || (tL_starsRevenueStatus = h.status) == null || (tL_starsRevenueStatus.available_balance.amount <= 0 && tL_starsRevenueStatus.overall_revenue.amount <= 0 && tL_starsRevenueStatus.current_balance.amount <= 0)) ? false : true;
    }

    public final boolean b(long j3) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_payments_starsRevenueStats j10 = j(j3, false);
        return (j10 == null || (tL_starsRevenueStatus = j10.status) == null || (tL_starsRevenueStatus.current_balance.amount <= 0 && tL_starsRevenueStatus.available_balance.amount <= 0 && tL_starsRevenueStatus.overall_revenue.amount <= 0)) ? false : true;
    }

    public final TL_stars.StarsAmount c(long j3) {
        TLRPC.TL_payments_starsRevenueStats h = h(j3, false);
        return h == null ? TL_stars.StarsAmount.ofStars(0L) : h.status.current_balance;
    }

    public final l d(long j3) {
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.g;
        l lVar = (l) hashMap.get(valueOf);
        if (lVar != null) {
            return lVar;
        }
        Long valueOf2 = Long.valueOf(j3);
        l lVar2 = new l(this.a, j3);
        hashMap.put(valueOf2, lVar2);
        return lVar2;
    }

    public final m e(long j3) {
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.h;
        m mVar = (m) hashMap.get(valueOf);
        if (mVar != null) {
            return mVar;
        }
        Long valueOf2 = Long.valueOf(j3);
        m mVar2 = new m(this.a, j3);
        hashMap.put(valueOf2, mVar2);
        return mVar2;
    }

    public final void f(Context context, long j3, long j10, Utilities.Callback callback) {
        l lVar = (l) this.g.get(Long.valueOf(j3));
        if (lVar != null) {
            ArrayList arrayList = lVar.e;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (!((TL_payments.connectedBotStarRef) arrayList.get(i10)).revoked && ((TL_payments.connectedBotStarRef) arrayList.get(i10)).bot_id == j10) {
                    callback.run((TL_payments.connectedBotStarRef) arrayList.get(i10));
                    return;
                }
            }
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
        TL_payments.getConnectedStarRefBot getconnectedstarrefbot = new TL_payments.getConnectedStarRefBot();
        int i11 = this.a;
        getconnectedstarrefbot.peer = MessagesController.getInstance(i11).getInputPeer(j3);
        getconnectedstarrefbot.bot = MessagesController.getInstance(i11).getInputUser(j10);
        int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(getconnectedstarrefbot, new ja(this, b2Var, j10, callback, 6));
        b2Var.g0 = true;
        b2Var.setOnCancelListener(new ba(this, sendRequest, 9));
        b2Var.q(200L);
    }

    public final TLRPC.TL_payments_starsRevenueStats h(long j3, boolean z10) {
        Long l4 = (Long) this.b.get(Long.valueOf(j3));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.c.get(Long.valueOf(j3));
        if (l4 != null && System.currentTimeMillis() - l4.longValue() <= 300000 && !z10) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.j6.I.q();
        int i10 = this.a;
        tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j3);
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new h(this, j3, 0));
        return tL_payments_starsRevenueStats;
    }

    public final long i(long j3) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TL_stars.StarsAmount starsAmount;
        TLRPC.TL_payments_starsRevenueStats j10 = j(j3, false);
        if (j10 == null || (tL_starsRevenueStatus = j10.status) == null || (starsAmount = tL_starsRevenueStatus.current_balance) == null) {
            return 0L;
        }
        return starsAmount.amount;
    }

    public final TLRPC.TL_payments_starsRevenueStats j(long j3, boolean z10) {
        Long l4 = (Long) this.d.get(Long.valueOf(j3));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.e.get(Long.valueOf(j3));
        if (l4 != null && System.currentTimeMillis() - l4.longValue() <= 300000 && !z10) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.ton = true;
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.j6.I.q();
        int i10 = this.a;
        tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j3);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(-j3);
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new h(this, j3, 1), null, null, 0, chatFull != null ? chatFull.stats_dc : ConnectionsManager.DEFAULT_DATACENTER_ID, 1, true);
        return tL_payments_starsRevenueStats;
    }

    public final n k(long j3) {
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.f;
        n nVar = (n) hashMap.get(valueOf);
        if (nVar != null) {
            return nVar;
        }
        Long valueOf2 = Long.valueOf(j3);
        n nVar2 = new n();
        hashMap.put(valueOf2, nVar2);
        return nVar2;
    }

    public final void l(long j3) {
        n k10 = k(j3);
        boolean[] zArr = k10.d;
        for (int i10 = 0; i10 < 3; i10++) {
            if (!zArr[i10]) {
                k10.a[i10].clear();
                k10.c[i10] = null;
                zArr[i10] = false;
                k10.e[i10] = false;
                p(i10, j3);
            }
        }
    }

    public final boolean m(long j3) {
        return j(j3, false) != null;
    }

    public final void n() {
        if (this.i || this.j != null) {
            return;
        }
        this.i = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_bots.getAdminedBots(), new i(this, 0));
    }

    public final void o() {
        if (this.k || this.l != null) {
            return;
        }
        this.k = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new i(this, 1));
    }

    public final void p(int i10, long j3) {
        n k10 = k(j3);
        boolean[] zArr = k10.d;
        if (zArr[i10] || k10.e[i10]) {
            return;
        }
        zArr[i10] = true;
        TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
        int i11 = this.a;
        tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i11).getInputPeer(j3);
        tL_payments_getStarsTransactions.inbound = i10 == 1;
        tL_payments_getStarsTransactions.outbound = i10 == 2;
        String str = k10.c[i10];
        tL_payments_getStarsTransactions.offset = str;
        if (str == null) {
            tL_payments_getStarsTransactions.offset = "";
        }
        ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions, new bi.s7(this, k10, i10, j3, 6));
    }

    public final void q(TL_update.TL_updateStarsRevenueStatus tL_updateStarsRevenueStatus) {
        long peerDialogId = DialogObject.getPeerDialogId(tL_updateStarsRevenueStatus.peer);
        if (peerDialogId >= 0) {
            TLRPC.TL_payments_starsRevenueStats h = h(peerDialogId, true);
            if (h != null) {
                h.status = tL_updateStarsRevenueStatus.status;
                NotificationCenter.getInstance(this.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(peerDialogId));
            }
            l(peerDialogId);
            return;
        }
        ke keVar = ke.x1;
        if (keVar == null || keVar.z0 != DialogObject.getPeerDialogId(tL_updateStarsRevenueStatus.peer)) {
            return;
        }
        ke keVar2 = ke.x1;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = tL_updateStarsRevenueStatus.status;
        keVar2.g0(tL_starsRevenueStatus.current_balance instanceof TL_stars.TL_starsTonAmount, tL_starsRevenueStatus);
        ke.x1.e0();
    }

    public final void r(long j3) {
        Long l4 = (Long) this.b.get(Long.valueOf(j3));
        h(j3, l4 == null || System.currentTimeMillis() - l4.longValue() > 30000);
    }
}
