package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ud implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ie b;

    public /* synthetic */ ud(ie ieVar, int i10) {
        this.a = i10;
        this.b = ieVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if (tL_error == null) {
                    if (tLObject instanceof TLRPC.Updates) {
                        ie ieVar = this.b;
                        AndroidUtilities.runOnUIThread(new od(ieVar, 4));
                        MessagesController.getInstance(ieVar.y0).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new vt0(tL_error, 22));
                    break;
                }
                break;
            case 1:
                final int i10 = 0;
                final ie ieVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.vd
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    g91 f02 = u91.f0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    ie ieVar3 = ieVar2;
                                    ieVar3.o1 = f02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    ieVar3.p1 = u91.f0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    g91 g91Var = ieVar3.o1;
                                    if (g91Var != null) {
                                        g91Var.n = true;
                                    }
                                    ieVar3.j1 = tL_payments_starsRevenueStats.usd_rate;
                                    ieVar3.f0(true, tL_payments_starsRevenueStats.status);
                                    ieVar3.c1.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.bs.h).withEndAction(new od(ieVar3, 6)).start();
                                    ieVar3.Z();
                                    break;
                                }
                                break;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z10 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                ie ieVar4 = ieVar2;
                                if (!z10) {
                                    ieVar4.getClass();
                                    break;
                                } else {
                                    ieVar4.Y((TLRPC.TL_payments_starsRevenueStats) tLObject3);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final ie ieVar3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.vd
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    g91 f02 = u91.f0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    ie ieVar32 = ieVar3;
                                    ieVar32.o1 = f02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    ieVar32.p1 = u91.f0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    g91 g91Var = ieVar32.o1;
                                    if (g91Var != null) {
                                        g91Var.n = true;
                                    }
                                    ieVar32.j1 = tL_payments_starsRevenueStats.usd_rate;
                                    ieVar32.f0(true, tL_payments_starsRevenueStats.status);
                                    ieVar32.c1.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.bs.h).withEndAction(new od(ieVar32, 6)).start();
                                    ieVar32.Z();
                                    break;
                                }
                                break;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z10 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                ie ieVar4 = ieVar3;
                                if (!z10) {
                                    ieVar4.getClass();
                                    break;
                                } else {
                                    ieVar4.Y((TLRPC.TL_payments_starsRevenueStats) tLObject3);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
