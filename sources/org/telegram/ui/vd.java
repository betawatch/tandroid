package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class vd implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ le b;

    public /* synthetic */ vd(le leVar, int i10) {
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
                        AndroidUtilities.runOnUIThread(new pd(leVar, 4));
                        MessagesController.getInstance(leVar.y0).processUpdates((TLRPC.Updates) tLObject, false);
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new mu0(tL_error, 22));
                    break;
                }
                break;
            case 1:
                final int i10 = 0;
                final le leVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wd
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    ra1 f02 = fb1.f0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    le leVar3 = leVar2;
                                    leVar3.o1 = f02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    leVar3.p1 = fb1.f0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    ra1 ra1Var = leVar3.o1;
                                    if (ra1Var != null) {
                                        ra1Var.n = true;
                                    }
                                    leVar3.j1 = tL_payments_starsRevenueStats.usd_rate;
                                    leVar3.g0(true, tL_payments_starsRevenueStats.status);
                                    leVar3.c1.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.wr.h).withEndAction(new pd(leVar3, 6)).start();
                                    leVar3.a0();
                                    break;
                                }
                                break;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z10 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                le leVar4 = leVar2;
                                if (!z10) {
                                    leVar4.getClass();
                                    break;
                                } else {
                                    leVar4.Z((TLRPC.TL_payments_starsRevenueStats) tLObject3);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final le leVar3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wd
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    ra1 f02 = fb1.f0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    le leVar32 = leVar3;
                                    leVar32.o1 = f02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    leVar32.p1 = fb1.f0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    ra1 ra1Var = leVar32.o1;
                                    if (ra1Var != null) {
                                        ra1Var.n = true;
                                    }
                                    leVar32.j1 = tL_payments_starsRevenueStats.usd_rate;
                                    leVar32.g0(true, tL_payments_starsRevenueStats.status);
                                    leVar32.c1.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.wr.h).withEndAction(new pd(leVar32, 6)).start();
                                    leVar32.a0();
                                    break;
                                }
                                break;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z10 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                le leVar4 = leVar3;
                                if (!z10) {
                                    leVar4.getClass();
                                    break;
                                } else {
                                    leVar4.Z((TLRPC.TL_payments_starsRevenueStats) tLObject3);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
