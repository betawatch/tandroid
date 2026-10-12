package wg;

import bi.l5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.z9;
import w7.a6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class e extends d {
    @Override // wg.d, wg.c
    public final void d() {
        this.c.setLayoutParams(a6.a(40.0f, 16.0f, 0.0f, 16.0f, 0.0f, 40, (LocaleController.isRTL ? 5 : 3) | 16));
        boolean z10 = LocaleController.isRTL;
        this.d.setLayoutParams(a6.a(-2.0f, z10 ? 20.0f : 69.0f, 0.0f, z10 ? 69.0f : 20.0f, 0.0f, -1, (z10 ? 5 : 3) | 16));
        boolean z11 = LocaleController.isRTL;
        this.e.setLayoutParams(a6.a(-2.0f, z11 ? 20.0f : 69.0f, 0.0f, z11 ? 69.0f : 20.0f, 0.0f, -1, (z11 ? 5 : 3) | 16));
    }

    public void setGiveaway(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.e.setTextColor(g6.w0(g6.r5, this.a));
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        l5 l5Var = this.d;
        k9 k9Var = this.b;
        if (z10) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
            k9Var.g(26);
            l5Var.k(LocaleController.formatPluralStringComma("BoostingStarsPreparedGiveawaySubscriptionsPlural", (int) tL_prepaidStarsGiveaway.stars));
            setSubtitle(LocaleController.formatPluralString("AmongWinners", tL_prepaidStarsGiveaway.quantity, new Object[0]));
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            l5Var.k(LocaleController.getString(R.string.BoostingPreparedGiveawayOne));
            k9Var.g(16);
            TL_stories.TL_prepaidGiveaway tL_prepaidGiveaway = (TL_stories.TL_prepaidGiveaway) prepaidGiveaway;
            int i10 = tL_prepaidGiveaway.months;
            if (i10 == 12) {
                k9Var.i(-31392, -2796986);
            } else if (i10 == 6) {
                k9Var.i(-10703110, -12481584);
            } else {
                k9Var.i(-6631068, -11945404);
            }
            setSubtitle(LocaleController.formatPluralString("BoostingPreparedGiveawaySubscriptionsPlural", prepaidGiveaway.quantity, LocaleController.formatPluralString("Months", tL_prepaidGiveaway.months, new Object[0])));
        }
        z9 z9Var = this.c;
        z9Var.setImageDrawable(k9Var);
        z9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
    }
}
