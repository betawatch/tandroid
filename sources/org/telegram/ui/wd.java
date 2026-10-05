package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wd implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ me b;

    public /* synthetic */ wd(me meVar, int i10) {
        this.a = i10;
        this.b = meVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if (tL_error == null) {
                    if (tLObject instanceof TLRPC.Updates) {
                        me meVar = this.b;
                        AndroidUtilities.runOnUIThread(new pd(meVar, 3));
                        MessagesController.getInstance(meVar.o0).processUpdates((TLRPC.Updates) tLObject, false);
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new hu0(tL_error, 22));
                    break;
                }
                break;
            case 1:
                final int i10 = 0;
                final me meVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xd
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    fa1 d02 = ta1.d0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    me meVar3 = meVar2;
                                    meVar3.l1 = d02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    meVar3.m1 = ta1.d0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    fa1 fa1Var = meVar3.l1;
                                    if (fa1Var != null) {
                                        fa1Var.n = true;
                                    }
                                    meVar3.g1 = tL_payments_starsRevenueStats.usd_rate;
                                    meVar3.L(true, tL_payments_starsRevenueStats.status);
                                    meVar3.Y0.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.tr.h).withEndAction(new pd(meVar3, 5)).start();
                                    meVar3.E();
                                    break;
                                }
                                break;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z10 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                me meVar4 = meVar2;
                                if (!z10) {
                                    meVar4.getClass();
                                    break;
                                } else {
                                    meVar4.D((TLRPC.TL_payments_starsRevenueStats) tLObject3);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final me meVar3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xd
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    fa1 d02 = ta1.d0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    me meVar32 = meVar3;
                                    meVar32.l1 = d02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    meVar32.m1 = ta1.d0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    fa1 fa1Var = meVar32.l1;
                                    if (fa1Var != null) {
                                        fa1Var.n = true;
                                    }
                                    meVar32.g1 = tL_payments_starsRevenueStats.usd_rate;
                                    meVar32.L(true, tL_payments_starsRevenueStats.status);
                                    meVar32.Y0.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.tr.h).withEndAction(new pd(meVar32, 5)).start();
                                    meVar32.E();
                                    break;
                                }
                                break;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z10 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                me meVar4 = meVar3;
                                if (!z10) {
                                    meVar4.getClass();
                                    break;
                                } else {
                                    meVar4.D((TLRPC.TL_payments_starsRevenueStats) tLObject3);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
