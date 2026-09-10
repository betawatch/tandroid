package xh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.em;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.xb;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;

    public /* synthetic */ b(h hVar, int i10) {
        this.a = i10;
        this.b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        h hVar = this.b;
        switch (i10) {
            case 0:
                b bVar = hVar.n0;
                int currentTime = hVar.getConnectionsManager().getCurrentTime();
                hVar.R.setEnabled(hVar.P > 0 || hVar.G > currentTime);
                if (currentTime >= hVar.G) {
                    hVar.R.f(null, true);
                    hVar.R.g(z7.V0(false, hVar.O ? LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll) : LocaleController.formatPluralStringSpaced("BotStarsButtonWithdrawShort", (int) hVar.P), hVar.T), true, true);
                    break;
                } else {
                    hVar.R.g(LocaleController.getString(R.string.BotStarsButtonWithdrawShortUntil), true, true);
                    if (hVar.m0 == null) {
                        hVar.m0 = new SpannableStringBuilder("l");
                        uq uqVar = new uq(R.drawable.mini_switch_lock, 0);
                        uqVar.setTopOffset(1);
                        hVar.m0.setSpan(uqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) hVar.m0).append((CharSequence) h.j0(hVar.G - currentTime));
                    hVar.R.f(spannableStringBuilder, true);
                    pc pcVar = hVar.a0;
                    if (pcVar != null) {
                        tb tbVar = pcVar.e;
                        if ((tbVar instanceof xb) && tbVar.isAttachedToWindow()) {
                            em.p(R.string.BotStarsWithdrawalToast, new Object[]{h.j0(hVar.G - currentTime)}, ((xb) hVar.a0.e).b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    AndroidUtilities.runOnUIThread(bVar, 1000L);
                    break;
                }
                break;
            case 1:
                h.U(hVar);
                break;
            case 2:
                h.V(hVar);
                break;
            case 3:
                nf.f.s(hVar.getParentActivity(), LocaleController.getString(R.string.BotMonetizationBalanceInfoLink));
                break;
            case 4:
                nf.f.s(hVar.getParentActivity(), LocaleController.getString(R.string.BotStarsWithdrawInfoLink));
                break;
            default:
                hVar.S.setLoading(false);
                break;
        }
    }
}
