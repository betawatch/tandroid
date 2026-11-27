// default package

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class qn0 extends pn0 {
    @Override // pn0, if0
    public final void d() {
        this.c.setLayoutParams(tre.d(40, 40.0f, (ob6.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        boolean z = ob6.a0;
        this.d.setLayoutParams(tre.d(-1, -2.0f, (z ? 5 : 3) | 16, z ? 20.0f : 69.0f, 0.0f, z ? 69.0f : 20.0f, 0.0f));
        boolean z2 = ob6.a0;
        this.e.setLayoutParams(tre.d(-1, -2.0f, (z2 ? 5 : 3) | 16, z2 ? 20.0f : 69.0f, 0.0f, z2 ? 69.0f : 20.0f, 0.0f));
    }

    public void setGiveaway(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        yob.W(this.e, aob.r5, this.a);
        boolean z = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        ff0 ff0Var = this.d;
        rb0 rb0Var = this.b;
        if (z) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
            rb0Var.f(26);
            ff0Var.k(ob6.H(',', "BoostingStarsPreparedGiveawaySubscriptionsPlural", (int) tL_prepaidStarsGiveaway.stars));
            setSubtitle(ob6.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]));
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            ff0Var.k(ob6.M0(2131753321, null));
            rb0Var.f(16);
            TL_stories.TL_prepaidGiveaway tL_prepaidGiveaway = (TL_stories.TL_prepaidGiveaway) prepaidGiveaway;
            int i = tL_prepaidGiveaway.months;
            if (i == 12) {
                rb0Var.h(-31392, -2796986);
            } else if (i == 6) {
                rb0Var.h(-10703110, -12481584);
            } else {
                rb0Var.h(-6631068, -11945404);
            }
            setSubtitle(ob6.G(prepaidGiveaway.quantity, "BoostingPreparedGiveawaySubscriptionsPlural", ob6.G(tL_prepaidGiveaway.months, "Months", new Object[0])));
        }
        de0 de0Var = this.c;
        de0Var.setImageDrawable(rb0Var);
        de0Var.setRoundRadius(hl.L(20.0f));
    }
}
