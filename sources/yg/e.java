package yg;

import c8.ma;
import fi.u3;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.q9;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class e extends d {
    @Override // yg.d, yg.c
    public final void d() {
        this.c.setLayoutParams(ma.d(40, 40.0f, (gd.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        boolean z10 = gd.a0;
        this.d.setLayoutParams(ma.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 20.0f : 69.0f, 0.0f, z10 ? 69.0f : 20.0f, 0.0f));
        boolean z11 = gd.a0;
        this.e.setLayoutParams(ma.d(-1, -2.0f, (z11 ? 5 : 3) | 16, z11 ? 20.0f : 69.0f, 0.0f, z11 ? 69.0f : 20.0f, 0.0f));
    }

    public void setGiveaway(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        t6.X(this.e, m6.r5, this.a);
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        u3 u3Var = this.d;
        b9 b9Var = this.b;
        if (z10) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
            b9Var.g(26);
            u3Var.k(gd.H(',', "BoostingStarsPreparedGiveawaySubscriptionsPlural", (int) tL_prepaidStarsGiveaway.stars));
            setSubtitle(gd.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]));
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            u3Var.k(gd.N0(2131753325, null));
            b9Var.g(16);
            TL_stories.TL_prepaidGiveaway tL_prepaidGiveaway = (TL_stories.TL_prepaidGiveaway) prepaidGiveaway;
            int i7 = tL_prepaidGiveaway.months;
            if (i7 == 12) {
                b9Var.i(-31392, -2796986);
            } else if (i7 == 6) {
                b9Var.i(-10703110, -12481584);
            } else {
                b9Var.i(-6631068, -11945404);
            }
            setSubtitle(gd.G(prepaidGiveaway.quantity, "BoostingPreparedGiveawaySubscriptionsPlural", gd.G(tL_prepaidGiveaway.months, "Months", new Object[0])));
        }
        q9 q9Var = this.c;
        q9Var.setImageDrawable(b9Var);
        q9Var.setRoundRadius(g0.L(20.0f));
    }
}
