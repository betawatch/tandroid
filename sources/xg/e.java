package xg;

import di.l4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.y9;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class e extends d {
    @Override // xg.d, xg.c
    public final void d() {
        this.c.setLayoutParams(kb1.h(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        boolean z10 = LocaleController.isRTL;
        this.d.setLayoutParams(kb1.h(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 20.0f : 69.0f, 0.0f, z10 ? 69.0f : 20.0f, 0.0f));
        boolean z11 = LocaleController.isRTL;
        this.e.setLayoutParams(kb1.h(-1, -2.0f, (z11 ? 5 : 3) | 16, z11 ? 20.0f : 69.0f, 0.0f, z11 ? 69.0f : 20.0f, 0.0f));
    }

    public void setGiveaway(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        f7.Y(this.e, y6.r5, this.a);
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        l4 l4Var = this.d;
        j9 j9Var = this.b;
        if (z10) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
            j9Var.g(26);
            l4Var.k(LocaleController.formatPluralStringComma("BoostingStarsPreparedGiveawaySubscriptionsPlural", (int) tL_prepaidStarsGiveaway.stars));
            setSubtitle(LocaleController.formatPluralString("AmongWinners", tL_prepaidStarsGiveaway.quantity, new Object[0]));
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            l4Var.k(LocaleController.getString(R.string.BoostingPreparedGiveawayOne));
            j9Var.g(16);
            TL_stories.TL_prepaidGiveaway tL_prepaidGiveaway = (TL_stories.TL_prepaidGiveaway) prepaidGiveaway;
            int i10 = tL_prepaidGiveaway.months;
            if (i10 == 12) {
                j9Var.i(-31392, -2796986);
            } else if (i10 == 6) {
                j9Var.i(-10703110, -12481584);
            } else {
                j9Var.i(-6631068, -11945404);
            }
            setSubtitle(LocaleController.formatPluralString("BoostingPreparedGiveawaySubscriptionsPlural", prepaidGiveaway.quantity, LocaleController.formatPluralString("Months", tL_prepaidGiveaway.months, new Object[0])));
        }
        y9 y9Var = this.c;
        y9Var.setImageDrawable(j9Var);
        y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
    }
}
