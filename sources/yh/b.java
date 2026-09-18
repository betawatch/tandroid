package yh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.wl;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.sb;
import org.telegram.ui.Components.wb;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                    gVar.R.g(y7.V0(false, gVar.O ? LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll) : LocaleController.formatPluralStringSpaced("BotStarsButtonWithdrawShort", (int) gVar.P), gVar.T), true, true);
                    break;
                } else {
                    gVar.R.g(LocaleController.getString(R.string.BotStarsButtonWithdrawShortUntil), true, true);
                    if (gVar.m0 == null) {
                        gVar.m0 = new SpannableStringBuilder("l");
                        oq oqVar = new oq(R.drawable.mini_switch_lock, 0);
                        oqVar.setTopOffset(1);
                        gVar.m0.setSpan(oqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) gVar.m0).append((CharSequence) g.j0(gVar.G - currentTime));
                    gVar.R.f(spannableStringBuilder, true);
                    oc ocVar = gVar.a0;
                    if (ocVar != null) {
                        sb sbVar = ocVar.e;
                        if ((sbVar instanceof wb) && sbVar.isAttachedToWindow()) {
                            wl.p(R.string.BotStarsWithdrawalToast, new Object[]{g.j0(gVar.G - currentTime)}, ((wb) gVar.a0.e).b);
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
                nf.f.s(gVar.getParentActivity(), LocaleController.getString(R.string.BotMonetizationBalanceInfoLink));
                break;
            case 4:
                nf.f.s(gVar.getParentActivity(), LocaleController.getString(R.string.BotStarsWithdrawInfoLink));
                break;
            default:
                gVar.S.setLoading(false);
                break;
        }
    }
}
