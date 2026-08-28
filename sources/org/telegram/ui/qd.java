package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qd implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ fe b;

    public /* synthetic */ qd(fe feVar, int i9) {
        this.a = i9;
        this.b = feVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if (tL_error == null) {
                    if (tLObject instanceof TLRPC.Updates) {
                        fe feVar = this.b;
                        AndroidUtilities.runOnUIThread(new kd(feVar, 4));
                        MessagesController.getInstance(feVar.u0).processUpdates((TLRPC.Updates) tLObject, false);
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new kt0(tL_error, 22));
                    break;
                }
                break;
            case 1:
                final int i9 = 0;
                final fe feVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sd
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    e91 e02 = s91.e0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    fe feVar3 = feVar2;
                                    feVar3.k1 = e02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    feVar3.l1 = s91.e0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    e91 e91Var = feVar3.k1;
                                    if (e91Var != null) {
                                        e91Var.n = true;
                                    }
                                    feVar3.f1 = tL_payments_starsRevenueStats.usd_rate;
                                    feVar3.g0(true, tL_payments_starsRevenueStats.status);
                                    feVar3.Y0.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.gr.h).withEndAction(new kd(feVar3, 6)).start();
                                    feVar3.a0();
                                    break;
                                }
                                break;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z10 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                fe feVar4 = feVar2;
                                if (!z10) {
                                    feVar4.getClass();
                                    break;
                                } else {
                                    feVar4.Z((TLRPC.TL_payments_starsRevenueStats) tLObject3);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i10 = 1;
                final fe feVar3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sd
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    e91 e02 = s91.e0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    fe feVar32 = feVar3;
                                    feVar32.k1 = e02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    feVar32.l1 = s91.e0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    e91 e91Var = feVar32.k1;
                                    if (e91Var != null) {
                                        e91Var.n = true;
                                    }
                                    feVar32.f1 = tL_payments_starsRevenueStats.usd_rate;
                                    feVar32.g0(true, tL_payments_starsRevenueStats.status);
                                    feVar32.Y0.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.gr.h).withEndAction(new kd(feVar32, 6)).start();
                                    feVar32.a0();
                                    break;
                                }
                                break;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z10 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                fe feVar4 = feVar3;
                                if (!z10) {
                                    feVar4.getClass();
                                    break;
                                } else {
                                    feVar4.Z((TLRPC.TL_payments_starsRevenueStats) tLObject3);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
