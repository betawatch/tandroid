package yh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.bi;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.xb;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                    gVar.R.g(p7.W0(false, gVar.O ? LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll) : LocaleController.formatPluralStringSpaced("BotStarsButtonWithdrawShort", (int) gVar.P), gVar.T), true, true);
                    break;
                } else {
                    gVar.R.g(LocaleController.getString(R.string.BotStarsButtonWithdrawShortUntil), true, true);
                    if (gVar.m0 == null) {
                        gVar.m0 = new SpannableStringBuilder("l");
                        er erVar = new er(R.drawable.mini_switch_lock, 0);
                        erVar.setTopOffset(1);
                        gVar.m0.setSpan(erVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) gVar.m0).append((CharSequence) g.j0(gVar.G - currentTime));
                    gVar.R.f(spannableStringBuilder, true);
                    tc tcVar = gVar.a0;
                    if (tcVar != null) {
                        xb xbVar = tcVar.e;
                        if ((xbVar instanceof bc) && xbVar.isAttachedToWindow()) {
                            bi.r(R.string.BotStarsWithdrawalToast, new Object[]{g.j0(gVar.G - currentTime)}, ((bc) gVar.a0.e).b);
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
