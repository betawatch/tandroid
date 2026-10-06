package yh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.bi;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.zb;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
                b bVar = hVar.s0;
                int currentTime = hVar.getConnectionsManager().getCurrentTime();
                hVar.a0.setEnabled(hVar.Y > 0 || hVar.P > currentTime);
                if (currentTime >= hVar.P) {
                    hVar.a0.f(null, true);
                    hVar.a0.g(z7.b1(false, hVar.X ? LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll) : LocaleController.formatPluralStringSpaced("BotStarsButtonWithdrawShort", (int) hVar.Y), hVar.c0), true, true);
                    break;
                } else {
                    hVar.a0.g(LocaleController.getString(R.string.BotStarsButtonWithdrawShortUntil), true, true);
                    if (hVar.r0 == null) {
                        hVar.r0 = new SpannableStringBuilder("l");
                        rq rqVar = new rq(R.drawable.mini_switch_lock, 0);
                        rqVar.setTopOffset(1);
                        hVar.r0.setSpan(rqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) hVar.r0).append((CharSequence) h.r0(hVar.P - currentTime));
                    hVar.a0.f(spannableStringBuilder, true);
                    rc rcVar = hVar.j0;
                    if (rcVar != null) {
                        vb vbVar = rcVar.e;
                        if ((vbVar instanceof zb) && vbVar.isAttachedToWindow()) {
                            bi.p(R.string.BotStarsWithdrawalToast, new Object[]{h.r0(hVar.P - currentTime)}, ((zb) hVar.j0.e).b);
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
                nf.f.s(hVar.getParentActivity(), LocaleController.getString(R.string.BotStarsWithdrawInfoLink));
                break;
            case 3:
                h.S(hVar);
                break;
            case 4:
                nf.f.s(hVar.getParentActivity(), LocaleController.getString(R.string.BotMonetizationBalanceInfoLink));
                break;
            default:
                hVar.b0.setLoading(false);
                break;
        }
    }
}
