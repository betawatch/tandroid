// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ri1 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ij1 b;

    public /* synthetic */ ri1(ij1 ij1Var, byte b) {
        this.a = b;
        this.b = ij1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final byte b2 = 0;
        final ij1 ij1Var = this.b;
        switch (b) {
            case 0:
                if (tL_error == null) {
                    if (tLObject instanceof TLRPC.Updates) {
                        hl.c3(new ni1(ij1Var, (byte) 3));
                        uc7.s1(ij1Var.o0).Y3((TLRPC.Updates) tLObject, false);
                        break;
                    }
                } else {
                    hl.c3(new ti1(tL_error, (byte) 0));
                    break;
                }
                break;
            case 1:
                hl.c3(new Runnable() { // from class: ui1
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLObject tLObject2 = tLObject;
                        ij1 ij1Var2 = ij1Var;
                        switch (b3) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    ij1Var2.l1 = w1b.f0(tL_payments_starsRevenueStats.top_hours_graph, ob6.M0(2131748156, null), 0, false);
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    ij1Var2.m1 = w1b.f0(statsGraph, ob6.M0(2131748155, null), 2, false);
                                    i1b i1bVar = ij1Var2.l1;
                                    if (i1bVar != null) {
                                        i1bVar.n = true;
                                    }
                                    ij1Var2.g1 = tL_payments_starsRevenueStats.usd_rate;
                                    ij1Var2.M(true, tL_payments_starsRevenueStats.status);
                                    ij1Var2.Y0.animate().alpha(0.0f).setDuration(380L).setInterpolator(k43.h).withEndAction(new ni1(ij1Var2, (byte) 5)).start();
                                    ij1Var2.F();
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    ij1Var2.E((TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b3 = 1;
                hl.c3(new Runnable() { // from class: ui1
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        TLObject tLObject2 = tLObject;
                        ij1 ij1Var2 = ij1Var;
                        switch (b32) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    ij1Var2.l1 = w1b.f0(tL_payments_starsRevenueStats.top_hours_graph, ob6.M0(2131748156, null), 0, false);
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    ij1Var2.m1 = w1b.f0(statsGraph, ob6.M0(2131748155, null), 2, false);
                                    i1b i1bVar = ij1Var2.l1;
                                    if (i1bVar != null) {
                                        i1bVar.n = true;
                                    }
                                    ij1Var2.g1 = tL_payments_starsRevenueStats.usd_rate;
                                    ij1Var2.M(true, tL_payments_starsRevenueStats.status);
                                    ij1Var2.Y0.animate().alpha(0.0f).setDuration(380L).setInterpolator(k43.h).withEndAction(new ni1(ij1Var2, (byte) 5)).start();
                                    ij1Var2.F();
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    ij1Var2.E((TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
