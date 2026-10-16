package zh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.sk;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.wb;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                        br brVar = new br(R.drawable.mini_switch_lock, 0);
                        brVar.setTopOffset(1);
                        gVar.m0.setSpan(brVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) gVar.m0).append((CharSequence) g.j0(gVar.G - currentTime));
                    gVar.R.f(spannableStringBuilder, true);
                    sc scVar = gVar.a0;
                    if (scVar != null) {
                        wb wbVar = scVar.e;
                        if ((wbVar instanceof ac) && wbVar.isAttachedToWindow()) {
                            sk.r(R.string.BotStarsWithdrawalToast, new Object[]{g.j0(gVar.G - currentTime)}, ((ac) gVar.a0.e).b);
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
                pf.d.r(gVar.getParentActivity(), LocaleController.getString(R.string.BotMonetizationBalanceInfoLink));
                break;
            case 4:
                pf.d.r(gVar.getParentActivity(), LocaleController.getString(R.string.BotStarsWithdrawInfoLink));
                break;
            default:
                gVar.S.setLoading(false);
                break;
        }
    }
}
