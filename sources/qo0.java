// default package

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qo0 extends po0 {
    @Override // po0, gg0
    public final void d() {
        this.c.setLayoutParams(qoe.d(40, 40.0f, (jb6.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        boolean z = jb6.a0;
        this.d.setLayoutParams(qoe.d(-1, -2.0f, (z ? 5 : 3) | 16, z ? 20.0f : 69.0f, 0.0f, z ? 69.0f : 20.0f, 0.0f));
        boolean z2 = jb6.a0;
        this.e.setLayoutParams(qoe.d(-1, -2.0f, (z2 ? 5 : 3) | 16, z2 ? 20.0f : 69.0f, 0.0f, z2 ? 69.0f : 20.0f, 0.0f));
    }

    public void setGiveaway(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        anb.W(this.e, cmb.q5, this.a);
        boolean z = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        dg0 dg0Var = this.d;
        pc0 pc0Var = this.b;
        if (z) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
            pc0Var.f(26);
            dg0Var.k(jb6.H(',', "BoostingStarsPreparedGiveawaySubscriptionsPlural", (int) tL_prepaidStarsGiveaway.stars));
            setSubtitle(jb6.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]));
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            dg0Var.k(jb6.M0(2131753293, null));
            pc0Var.f(16);
            TL_stories.TL_prepaidGiveaway tL_prepaidGiveaway = (TL_stories.TL_prepaidGiveaway) prepaidGiveaway;
            int i = tL_prepaidGiveaway.months;
            if (i == 12) {
                pc0Var.h(-31392, -2796986);
            } else if (i == 6) {
                pc0Var.h(-10703110, -12481584);
            } else {
                pc0Var.h(-6631068, -11945404);
            }
            setSubtitle(jb6.G(prepaidGiveaway.quantity, "BoostingPreparedGiveawaySubscriptionsPlural", jb6.G(tL_prepaidGiveaway.months, "Months", new Object[0])));
        }
        bf0 bf0Var = this.c;
        bf0Var.setImageDrawable(pc0Var);
        bf0Var.setRoundRadius(gm.L(20.0f));
    }
}
