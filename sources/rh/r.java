package rh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.c70;
import org.telegram.ui.ba;
import org.telegram.ui.le;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r {
    public static volatile r[] m = new r[4];
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

    public r(int i10) {
        this.a = i10;
    }

    public static r g(int i10) {
        r rVar;
        r rVar2 = m[i10];
        if (rVar2 != null) {
            return rVar2;
        }
        synchronized (n[i10]) {
            try {
                rVar = m[i10];
                if (rVar == null) {
                    r[] rVarArr = m;
                    r rVar3 = new r(i10);
                    rVarArr[i10] = rVar3;
                    rVar = rVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rVar;
    }

    public final boolean a(long j10) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_payments_starsRevenueStats h = h(j10, false);
        return (h == null || (tL_starsRevenueStatus = h.status) == null || (tL_starsRevenueStatus.available_balance.amount <= 0 && tL_starsRevenueStatus.overall_revenue.amount <= 0 && tL_starsRevenueStatus.current_balance.amount <= 0)) ? false : true;
    }

    public final boolean b(long j10) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_payments_starsRevenueStats j11 = j(j10, false);
        return (j11 == null || (tL_starsRevenueStatus = j11.status) == null || (tL_starsRevenueStatus.current_balance.amount <= 0 && tL_starsRevenueStatus.available_balance.amount <= 0 && tL_starsRevenueStatus.overall_revenue.amount <= 0)) ? false : true;
    }

    public final TL_stars.StarsAmount c(long j10) {
        TLRPC.TL_payments_starsRevenueStats h = h(j10, false);
        return h == null ? TL_stars.StarsAmount.ofStars(0L) : h.status.current_balance;
    }

    public final n d(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.g;
        n nVar = (n) hashMap.get(valueOf);
        if (nVar != null) {
            return nVar;
        }
        Long valueOf2 = Long.valueOf(j10);
        n nVar2 = new n(this.a, j10);
        hashMap.put(valueOf2, nVar2);
        return nVar2;
    }

    public final p e(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.h;
        p pVar = (p) hashMap.get(valueOf);
        if (pVar != null) {
            return pVar;
        }
        Long valueOf2 = Long.valueOf(j10);
        p pVar2 = new p(this.a, j10);
        hashMap.put(valueOf2, pVar2);
        return pVar2;
    }

    public final void f(Context context, long j10, long j11, q20 q20Var) {
        n nVar = (n) this.g.get(Long.valueOf(j10));
        if (nVar != null) {
            ArrayList arrayList = nVar.e;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (!((TL_payments.connectedBotStarRef) arrayList.get(i10)).revoked && ((TL_payments.connectedBotStarRef) arrayList.get(i10)).bot_id == j11) {
                    q20Var.a((TL_payments.connectedBotStarRef) arrayList.get(i10));
                    return;
                }
            }
        }
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, context, null);
        TL_payments.getConnectedStarRefBot getconnectedstarrefbot = new TL_payments.getConnectedStarRefBot();
        int i11 = this.a;
        getconnectedstarrefbot.peer = vp.r1(i11).i1(j10);
        getconnectedstarrefbot.bot = vp.r1(i11).n1(j11);
        int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(getconnectedstarrefbot, new c70(this, x1Var, j11, q20Var));
        x1Var.i0 = true;
        x1Var.setOnCancelListener(new ba(this, sendRequest, 9));
        x1Var.r(200L);
    }

    public final TLRPC.TL_payments_starsRevenueStats h(long j10, boolean z10) {
        Long l4 = (Long) this.b.get(Long.valueOf(j10));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.c.get(Long.valueOf(j10));
        if (l4 != null && System.currentTimeMillis() - l4.longValue() <= 300000 && !z10) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.t6.I.q();
        int i10 = this.a;
        tL_payments_getStarsRevenueStats.peer = vp.r1(i10).i1(j10);
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new j(this, j10, 0));
        return tL_payments_starsRevenueStats;
    }

    public final long i(long j10) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TL_stars.StarsAmount starsAmount;
        TLRPC.TL_payments_starsRevenueStats j11 = j(j10, false);
        if (j11 == null || (tL_starsRevenueStatus = j11.status) == null || (starsAmount = tL_starsRevenueStatus.current_balance) == null) {
            return 0L;
        }
        return starsAmount.amount;
    }

    public final TLRPC.TL_payments_starsRevenueStats j(long j10, boolean z10) {
        Long l4 = (Long) this.d.get(Long.valueOf(j10));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.e.get(Long.valueOf(j10));
        if (l4 != null && System.currentTimeMillis() - l4.longValue() <= 300000 && !z10) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.ton = true;
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.t6.I.q();
        int i10 = this.a;
        tL_payments_getStarsRevenueStats.peer = vp.r1(i10).i1(j10);
        TLRPC.ChatFull M0 = vp.r1(i10).M0(-j10);
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new j(this, j10, 1), null, null, 0, M0 != null ? M0.stats_dc : ConnectionsManager.DEFAULT_DATACENTER_ID, 1, true);
        return tL_payments_starsRevenueStats;
    }

    public final q k(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.f;
        q qVar = (q) hashMap.get(valueOf);
        if (qVar != null) {
            return qVar;
        }
        Long valueOf2 = Long.valueOf(j10);
        q qVar2 = new q();
        hashMap.put(valueOf2, qVar2);
        return qVar2;
    }

    public final void l(long j10) {
        q k10 = k(j10);
        boolean[] zArr = k10.d;
        for (int i10 = 0; i10 < 3; i10++) {
            if (!zArr[i10]) {
                k10.a[i10].clear();
                k10.c[i10] = null;
                zArr[i10] = false;
                k10.e[i10] = false;
                p(i10, j10);
            }
        }
    }

    public final boolean m(long j10) {
        return j(j10, false) != null;
    }

    public final void n() {
        if (this.i || this.j != null) {
            return;
        }
        this.i = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_bots.getAdminedBots(), new l(this, 1));
    }

    public final void o() {
        if (this.k || this.l != null) {
            return;
        }
        this.k = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new l(this, 0));
    }

    public final void p(int i10, long j10) {
        q k10 = k(j10);
        boolean[] zArr = k10.d;
        if (zArr[i10] || k10.e[i10]) {
            return;
        }
        zArr[i10] = true;
        TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
        int i11 = this.a;
        tL_payments_getStarsTransactions.peer = vp.r1(i11).i1(j10);
        tL_payments_getStarsTransactions.inbound = i10 == 1;
        tL_payments_getStarsTransactions.outbound = i10 == 2;
        String str = k10.c[i10];
        tL_payments_getStarsTransactions.offset = str;
        if (str == null) {
            tL_payments_getStarsTransactions.offset = "";
        }
        ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions, new org.telegram.ui.Components.o2(i10, 2, j10, this, k10));
    }

    public final void q(TL_update.TL_updateStarsRevenueStatus tL_updateStarsRevenueStatus) {
        long o10 = org.telegram.messenger.o5.o(tL_updateStarsRevenueStatus.peer);
        if (o10 >= 0) {
            TLRPC.TL_payments_starsRevenueStats h = h(o10, true);
            if (h != null) {
                h.status = tL_updateStarsRevenueStatus.status;
                zs.f(this.a).k(zs.C3, Long.valueOf(o10));
            }
            l(o10);
            return;
        }
        le leVar = le.t1;
        if (leVar == null || leVar.p0 != org.telegram.messenger.o5.o(tL_updateStarsRevenueStatus.peer)) {
            return;
        }
        le leVar2 = le.t1;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = tL_updateStarsRevenueStatus.status;
        leVar2.L(tL_starsRevenueStatus.current_balance instanceof TL_stars.TL_starsTonAmount, tL_starsRevenueStatus);
        le.t1.J();
    }

    public final void r(long j10) {
        Long l4 = (Long) this.b.get(Long.valueOf(j10));
        h(j10, l4 == null || System.currentTimeMillis() - l4.longValue() > 30000);
    }
}
