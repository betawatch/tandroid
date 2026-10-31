package rh;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sn;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c6 {
    public final x5 a;
    public final jj b;
    public final un c;
    public final wb d;
    public final qb e;
    public final d6 f;
    public final boolean g;
    public long h;
    public long k;
    public boolean l;
    public boolean m;
    public i4 o;
    public final a6 p;
    public final /* synthetic */ e6 q;
    public boolean i = false;
    public boolean j = false;
    public Long n = null;

    public c6(e6 e6Var, x5 x5Var, jj jjVar, un unVar, boolean z10) {
        this.q = e6Var;
        boolean z11 = false;
        z11 = false;
        a6 a6Var = new a6(this, z11 ? 1 : 0);
        this.p = a6Var;
        this.a = x5Var;
        this.b = jjVar;
        this.c = unVar;
        Context t10 = e6.t(unVar);
        qb qbVar = new qb(t10, unVar.xa);
        this.e = qbVar;
        qbVar.c(R.raw.stars_topup, new String[0]);
        qbVar.b.setText(d());
        ub ubVar = new ub(t10, unVar.xa, true, false);
        ubVar.e(cd.L0(2131745041, null));
        ubVar.b = new a6(this, 1);
        d6 d6Var = new d6(t10, unVar.xa);
        this.f = d6Var;
        d6Var.b = 5000L;
        int i10 = org.telegram.ui.ActionBar.t6.uj;
        sn snVar = unVar.xa;
        org.telegram.utils.twidget.t tVar = new org.telegram.utils.twidget.t(28);
        org.telegram.utils.twidget.t tVar2 = new org.telegram.utils.twidget.t(29);
        int Q = org.telegram.ui.ActionBar.a7.Q(i10, -1, 0, 0.0f, snVar);
        tVar2.d(Q, d6Var);
        org.telegram.ui.ActionBar.u6 x10 = org.telegram.ui.ActionBar.a7.x(101, d6Var);
        x10.c(i10, -1, 0, 0.0f, snVar);
        x10.n = tVar;
        x10.o = tVar2;
        x10.m = false;
        x10.g = Q;
        ubVar.addView(d6Var, w7.b6.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ubVar.e.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(8.0f));
        qbVar.setButton(ubVar);
        wb b10 = cc.a0(unVar).b(qbVar, -1);
        this.d = b10;
        b10.r = false;
        if (z10) {
            b10.k(true);
            this.m = true;
        }
        b10.v = a6Var;
        this.h = 0L;
        System.currentTimeMillis();
        if (jjVar.k.reactions != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= jjVar.k.reactions.results.size()) {
                    break;
                }
                if (jjVar.k.reactions.results.get(i11).reaction instanceof TLRPC.TL_reactionPaid) {
                    z11 = jjVar.k.reactions.results.get(i11).chosen;
                    break;
                }
                i11++;
            }
        }
        this.g = z11;
    }

    public final void a() {
        e6 e6Var = this.q;
        int i10 = e6Var.a;
        org.telegram.messenger.i0.r(this.p);
        this.j = true;
        this.d.b();
        i4 i4Var = this.o;
        if (i4Var != null) {
            i4Var.c();
        }
        int i11 = (int) (-this.h);
        boolean z10 = this.g;
        long c10 = c();
        jj jjVar = this.b;
        jjVar.f(i11, c10, z10);
        e6Var.g -= this.h;
        zs.f(i10).k(zs.y3, new Object[0]);
        zs.f(i10).k(zs.o1, Long.valueOf(jj.B0(jjVar.k)), Integer.valueOf(jjVar.f1()), jjVar.k.reactions);
        if (e6Var.B == this) {
            e6Var.B = null;
        }
    }

    public final void b() {
        jj jjVar;
        String str;
        int i10 = zs.y3;
        org.telegram.messenger.i0.r(this.p);
        int i11 = 0;
        if (!this.l) {
            this.j = true;
            this.b.f((int) (-this.h), c(), this.g);
            e6 e6Var = this.q;
            e6Var.g -= this.h;
            zs.f(e6Var.a).k(i10, new Object[0]);
        } else if (!this.i && !this.j) {
            e6 y3 = e6.y(this.q.a, false);
            vp r12 = vp.r1(this.q.a);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.q.a);
            long j10 = this.h;
            if (!y3.e || y3.q(null, false, false).amount >= j10) {
                this.i = true;
                TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                tL_messages_sendPaidReaction.peer = r12.i1(this.a.a);
                tL_messages_sendPaidReaction.msg_id = this.a.b;
                tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.b.nextLong() & 4294967295L);
                tL_messages_sendPaidReaction.count = (int) this.h;
                tL_messages_sendPaidReaction.flags |= 1;
                long c10 = c();
                if (c10 == 0 || c10 == d20.i(this.q.a).e()) {
                    tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (c10 == 2666000) {
                    tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_sendPaidReaction.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = r12.i1(c10);
                }
                this.q.O();
                connectionsManager.sendRequest(tL_messages_sendPaidReaction, new mg.x(this, r12, j10));
            } else {
                this.j = true;
                this.b.f((int) (-this.h), c(), this.g);
                e6 e6Var2 = this.q;
                e6Var2.g = 0L;
                zs.f(e6Var2.a).k(i10, new Object[0]);
                zs.f(this.q.a).k(zs.o1, Long.valueOf(jj.B0(this.b.k)), Integer.valueOf(this.b.f1()), this.b.k.reactions);
                if (this.a.a >= 0) {
                    str = h20.k(this.c.getMessagesController().Z1(Long.valueOf(this.a.a)));
                } else {
                    TLRPC.Chat L0 = this.c.getMessagesController().L0(Long.valueOf(-this.a.a));
                    str = L0 == null ? "" : L0.title;
                }
                String str2 = str;
                Context parentActivity = this.c.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.I1;
                }
                if (parentActivity == null) {
                    parentActivity = org.telegram.messenger.w0.b;
                }
                new x7(parentActivity, this.c.getResourceProvider(), j10, 5, str2, new b6(this, j10, i11), 0L).show();
            }
        }
        this.d.b();
        i4 i4Var = this.o;
        if (i4Var != null && (jjVar = this.b) != null && jjVar.f1() == i4Var.c) {
            this.o.c();
        }
        e6 e6Var3 = this.q;
        if (e6Var3.B == this) {
            e6Var3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.n;
        return l4 != null ? l4.longValue() : this.q.A(this.b);
    }

    public final String d() {
        return c() == 2666000 ? cd.L0(2131745047, null) : (c() == 0 || c() == d20.i(this.q.a).e()) ? cd.L0(2131745043, null) : cd.a0(null, null, 2131745042, org.telegram.messenger.o5.t(c()));
    }
}
