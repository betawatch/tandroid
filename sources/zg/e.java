package zg;

import b8.mf;
import ei.e4;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.u8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e extends d {
    @Override // zg.d, zg.c
    public final void d() {
        this.c.setLayoutParams(mf.d(40, 40.0f, (bd.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        boolean z10 = bd.a0;
        this.d.setLayoutParams(mf.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 20.0f : 69.0f, 0.0f, z10 ? 69.0f : 20.0f, 0.0f));
        boolean z11 = bd.a0;
        this.e.setLayoutParams(mf.d(-1, -2.0f, (z11 ? 5 : 3) | 16, z11 ? 20.0f : 69.0f, 0.0f, z11 ? 69.0f : 20.0f, 0.0f));
    }

    public void setGiveaway(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        r6.Y(this.e, k6.r5, this.a);
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        e4 e4Var = this.d;
        u8 u8Var = this.b;
        if (z10) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
            u8Var.g(26);
            e4Var.k(bd.H(',', "BoostingStarsPreparedGiveawaySubscriptionsPlural", (int) tL_prepaidStarsGiveaway.stars));
            setSubtitle(bd.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]));
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            e4Var.k(bd.M0(2131753328, null));
            u8Var.g(16);
            TL_stories.TL_prepaidGiveaway tL_prepaidGiveaway = (TL_stories.TL_prepaidGiveaway) prepaidGiveaway;
            int i3 = tL_prepaidGiveaway.months;
            if (i3 == 12) {
                u8Var.i(-31392, -2796986);
            } else if (i3 == 6) {
                u8Var.i(-10703110, -12481584);
            } else {
                u8Var.i(-6631068, -11945404);
            }
            setSubtitle(bd.G(prepaidGiveaway.quantity, "BoostingPreparedGiveawaySubscriptionsPlural", bd.G(tL_prepaidGiveaway.months, "Months", new Object[0])));
        }
        k9 k9Var = this.c;
        k9Var.setImageDrawable(u8Var);
        k9Var.setRoundRadius(g0.L(20.0f));
    }
}
