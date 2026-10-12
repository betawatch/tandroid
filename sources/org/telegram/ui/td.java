package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class td implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qe b;
    public final /* synthetic */ int c;

    public /* synthetic */ td(qe qeVar, int i10, int i11) {
        this.a = i11;
        this.b = qeVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.c;
        qe qeVar = this.b;
        switch (i10) {
            case 0:
                pf.d.s(qeVar.getContext(), LocaleController.getString(i11));
                break;
            case 1:
                td tdVar = qeVar.i1;
                gi.o oVar = qeVar.Y0;
                org.telegram.ui.Components.sc.e();
                if (qeVar.N0.amount < MessagesController.getInstance(i11).starsRevenueWithdrawalMin) {
                    qeVar.W0 = true;
                    qeVar.X0 = qeVar.N0.amount;
                } else {
                    qeVar.W0 = false;
                    qeVar.X0 = MessagesController.getInstance(i11).starsRevenueWithdrawalMin;
                }
                qeVar.V0 = true;
                oVar.setText(Long.toString(qeVar.X0));
                oVar.setSelection(oVar.getText().length());
                qeVar.V0 = false;
                AndroidUtilities.cancelRunOnUIThread(tdVar);
                tdVar.run();
                break;
            default:
                td tdVar2 = qeVar.i1;
                int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
                he heVar = qeVar.Q0;
                heVar.setEnabled(qeVar.X0 > 0 || qeVar.L0 > currentTime);
                if (currentTime >= qeVar.L0) {
                    heVar.f(null, true);
                    heVar.g(zh.p7.W0(false, qeVar.W0 ? LocaleController.getString(R.string.MonetizationStarsWithdrawAll) : LocaleController.formatPluralStringSpaced("MonetizationStarsWithdraw", (int) qeVar.X0), qeVar.R0), true, true);
                    break;
                } else {
                    heVar.g(LocaleController.getString(R.string.MonetizationStarsWithdrawUntil), true, true);
                    if (qeVar.h1 == null) {
                        qeVar.h1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.br brVar = new org.telegram.ui.Components.br(R.drawable.mini_switch_lock, 0);
                        brVar.setTopOffset(1);
                        qeVar.h1.setSpan(brVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) qeVar.h1).append((CharSequence) zh.g.j0(qeVar.L0 - currentTime));
                    heVar.f(spannableStringBuilder, true);
                    org.telegram.ui.Components.sc scVar = qeVar.Z0;
                    if (scVar != null) {
                        org.telegram.ui.Components.wb wbVar = scVar.e;
                        if ((wbVar instanceof org.telegram.ui.Components.ac) && wbVar.isAttachedToWindow()) {
                            org.telegram.messenger.yh.q(R.string.BotStarsWithdrawalToast, new Object[]{zh.g.j0(qeVar.L0 - currentTime)}, ((org.telegram.ui.Components.ac) qeVar.Z0.e).b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(tdVar2);
                    AndroidUtilities.runOnUIThread(tdVar2, 1000L);
                    break;
                }
                break;
        }
    }
}
