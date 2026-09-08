package zh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.wl;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.yb;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ b(g gVar, int i10) {
        this.a = i10;
        this.b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        g gVar = this.b;
        switch (i10) {
            case 0:
                b bVar = gVar.n0;
                int currentTime = gVar.getConnectionsManager().getCurrentTime();
                gVar.R.setEnabled(gVar.P > 0 || gVar.G > currentTime);
                if (currentTime >= gVar.G) {
                    gVar.R.f(null, true);
                    gVar.R.g(v7.V0(false, gVar.O ? LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll) : LocaleController.formatPluralStringSpaced("BotStarsButtonWithdrawShort", (int) gVar.P), gVar.T), true, true);
                    break;
                } else {
                    gVar.R.g(LocaleController.getString(R.string.BotStarsButtonWithdrawShortUntil), true, true);
                    if (gVar.m0 == null) {
                        gVar.m0 = new SpannableStringBuilder("l");
                        nq nqVar = new nq(R.drawable.mini_switch_lock, 0);
                        nqVar.setTopOffset(1);
                        gVar.m0.setSpan(nqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) gVar.m0).append((CharSequence) g.j0(gVar.G - currentTime));
                    gVar.R.f(spannableStringBuilder, true);
                    qc qcVar = gVar.a0;
                    if (qcVar != null) {
                        ub ubVar = qcVar.e;
                        if ((ubVar instanceof yb) && ubVar.isAttachedToWindow()) {
                            wl.p(R.string.BotStarsWithdrawalToast, new Object[]{g.j0(gVar.G - currentTime)}, ((yb) gVar.a0.e).b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    AndroidUtilities.runOnUIThread(bVar, 1000L);
                    break;
                }
                break;
            case 1:
                g.U(gVar);
                break;
            case 2:
                g.V(gVar);
                break;
            case 3:
                of.f.s(gVar.getParentActivity(), LocaleController.getString(R.string.BotMonetizationBalanceInfoLink));
                break;
            case 4:
                of.f.s(gVar.getParentActivity(), LocaleController.getString(R.string.BotStarsWithdrawInfoLink));
                break;
            default:
                gVar.S.setLoading(false);
                break;
        }
    }
}
