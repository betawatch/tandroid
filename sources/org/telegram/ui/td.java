package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class td implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ le b;

    public /* synthetic */ td(le leVar, int i10) {
        this.a = i10;
        this.b = leVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if (tL_error == null) {
                    if (tLObject instanceof TLRPC.Updates) {
                        le leVar = this.b;
                        org.telegram.messenger.i0.g3(new md(leVar, 3));
                        org.telegram.messenger.wp.r1(leVar.o0).L3((TLRPC.Updates) tLObject, false);
                        break;
                    }
                } else {
                    org.telegram.messenger.i0.g3(new qr0(tL_error, 22));
                    break;
                }
                break;
            case 1:
                final int i10 = 0;
                final le leVar2 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.vd
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        TLObject tLObject2 = tLObject;
                        le leVar3 = leVar2;
                        switch (i11) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    leVar3.l1 = s61.i0(tL_payments_starsRevenueStats.top_hours_graph, org.telegram.messenger.dd.L0(2131748417, null), 0, false);
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    leVar3.m1 = s61.i0(statsGraph, org.telegram.messenger.dd.L0(2131748416, null), 2, false);
                                    e61 e61Var = leVar3.l1;
                                    if (e61Var != null) {
                                        e61Var.n = true;
                                    }
                                    leVar3.g1 = tL_payments_starsRevenueStats.usd_rate;
                                    leVar3.L(true, tL_payments_starsRevenueStats.status);
                                    leVar3.Y0.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.gr.h).withEndAction(new md(leVar3, 5)).start();
                                    leVar3.E();
                                    break;
                                }
                                break;
                            default:
                                if (!(tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats)) {
                                    leVar3.getClass();
                                    break;
                                } else {
                                    leVar3.D((TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final le leVar3 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.vd
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        TLObject tLObject2 = tLObject;
                        le leVar32 = leVar3;
                        switch (i112) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    leVar32.l1 = s61.i0(tL_payments_starsRevenueStats.top_hours_graph, org.telegram.messenger.dd.L0(2131748417, null), 0, false);
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    leVar32.m1 = s61.i0(statsGraph, org.telegram.messenger.dd.L0(2131748416, null), 2, false);
                                    e61 e61Var = leVar32.l1;
                                    if (e61Var != null) {
                                        e61Var.n = true;
                                    }
                                    leVar32.g1 = tL_payments_starsRevenueStats.usd_rate;
                                    leVar32.L(true, tL_payments_starsRevenueStats.status);
                                    leVar32.Y0.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.gr.h).withEndAction(new md(leVar32, 5)).start();
                                    leVar32.E();
                                    break;
                                }
                                break;
                            default:
                                if (!(tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats)) {
                                    leVar32.getClass();
                                    break;
                                } else {
                                    leVar32.D((TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
