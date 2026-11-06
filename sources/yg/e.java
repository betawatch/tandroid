package yg;

import c8.ha;
import di.d4;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.w8;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class e extends d {
    @Override // yg.d, yg.c
    public final void d() {
        this.c.setLayoutParams(ha.d(40, 40.0f, (hd.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        boolean z9 = hd.a0;
        this.d.setLayoutParams(ha.d(-1, -2.0f, (z9 ? 5 : 3) | 16, z9 ? 20.0f : 69.0f, 0.0f, z9 ? 69.0f : 20.0f, 0.0f));
        boolean z10 = hd.a0;
        this.e.setLayoutParams(ha.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 20.0f : 69.0f, 0.0f, z10 ? 69.0f : 20.0f, 0.0f));
    }

    public void setGiveaway(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        r6.Y(this.e, k6.r5, this.a);
        boolean z9 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        d4 d4Var = this.d;
        w8 w8Var = this.b;
        if (z9) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
            w8Var.g(26);
            d4Var.k(hd.H(',', "BoostingStarsPreparedGiveawaySubscriptionsPlural", (int) tL_prepaidStarsGiveaway.stars));
            setSubtitle(hd.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]));
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            d4Var.k(hd.M0(2131753328, null));
            w8Var.g(16);
            TL_stories.TL_prepaidGiveaway tL_prepaidGiveaway = (TL_stories.TL_prepaidGiveaway) prepaidGiveaway;
            int i7 = tL_prepaidGiveaway.months;
            if (i7 == 12) {
                w8Var.i(-31392, -2796986);
            } else if (i7 == 6) {
                w8Var.i(-10703110, -12481584);
            } else {
                w8Var.i(-6631068, -11945404);
            }
            setSubtitle(hd.G(prepaidGiveaway.quantity, "BoostingPreparedGiveawaySubscriptionsPlural", hd.G(tL_prepaidGiveaway.months, "Months", new Object[0])));
        }
        l9 l9Var = this.c;
        l9Var.setImageDrawable(w8Var);
        l9Var.setRoundRadius(g0.L(20.0f));
    }
}
