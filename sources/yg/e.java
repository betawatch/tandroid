package yg;

import c8.ha;
import di.e4;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.v8;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class e extends d {
    @Override // yg.d, yg.c
    public final void d() {
        this.c.setLayoutParams(ha.d(40, 40.0f, (id.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        boolean z9 = id.a0;
        this.d.setLayoutParams(ha.d(-1, -2.0f, (z9 ? 5 : 3) | 16, z9 ? 20.0f : 69.0f, 0.0f, z9 ? 69.0f : 20.0f, 0.0f));
        boolean z10 = id.a0;
        this.e.setLayoutParams(ha.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 20.0f : 69.0f, 0.0f, z10 ? 69.0f : 20.0f, 0.0f));
    }

    public void setGiveaway(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        t6.X(this.e, m6.r5, this.a);
        boolean z9 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        e4 e4Var = this.d;
        v8 v8Var = this.b;
        if (z9) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
            v8Var.g(26);
            e4Var.k(id.H(',', "BoostingStarsPreparedGiveawaySubscriptionsPlural", (int) tL_prepaidStarsGiveaway.stars));
            setSubtitle(id.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]));
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            e4Var.k(id.M0(2131753328, null));
            v8Var.g(16);
            TL_stories.TL_prepaidGiveaway tL_prepaidGiveaway = (TL_stories.TL_prepaidGiveaway) prepaidGiveaway;
            int i7 = tL_prepaidGiveaway.months;
            if (i7 == 12) {
                v8Var.i(-31392, -2796986);
            } else if (i7 == 6) {
                v8Var.i(-10703110, -12481584);
            } else {
                v8Var.i(-6631068, -11945404);
            }
            setSubtitle(id.G(prepaidGiveaway.quantity, "BoostingPreparedGiveawaySubscriptionsPlural", id.G(tL_prepaidGiveaway.months, "Months", new Object[0])));
        }
        k9 k9Var = this.c;
        k9Var.setImageDrawable(v8Var);
        k9Var.setRoundRadius(g0.L(20.0f));
    }
}
