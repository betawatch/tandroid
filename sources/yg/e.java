package yg;

import c8.ja;
import fi.w3;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.t8;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class e extends d {
    @Override // yg.d, yg.c
    public final void d() {
        this.c.setLayoutParams(ja.d(40, 40.0f, (hd.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        boolean z10 = hd.a0;
        this.d.setLayoutParams(ja.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 20.0f : 69.0f, 0.0f, z10 ? 69.0f : 20.0f, 0.0f));
        boolean z11 = hd.a0;
        this.e.setLayoutParams(ja.d(-1, -2.0f, (z11 ? 5 : 3) | 16, z11 ? 20.0f : 69.0f, 0.0f, z11 ? 69.0f : 20.0f, 0.0f));
    }

    public void setGiveaway(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        q6.X(this.e, j6.r5, this.a);
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        w3 w3Var = this.d;
        t8 t8Var = this.b;
        if (z10) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
            t8Var.g(26);
            w3Var.k(hd.H(',', "BoostingStarsPreparedGiveawaySubscriptionsPlural", (int) tL_prepaidStarsGiveaway.stars));
            setSubtitle(hd.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]));
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            w3Var.k(hd.M0(2131753328, null));
            t8Var.g(16);
            TL_stories.TL_prepaidGiveaway tL_prepaidGiveaway = (TL_stories.TL_prepaidGiveaway) prepaidGiveaway;
            int i7 = tL_prepaidGiveaway.months;
            if (i7 == 12) {
                t8Var.i(-31392, -2796986);
            } else if (i7 == 6) {
                t8Var.i(-10703110, -12481584);
            } else {
                t8Var.i(-6631068, -11945404);
            }
            setSubtitle(hd.G(prepaidGiveaway.quantity, "BoostingPreparedGiveawaySubscriptionsPlural", hd.G(tL_prepaidGiveaway.months, "Months", new Object[0])));
        }
        i9 i9Var = this.c;
        i9Var.setImageDrawable(t8Var);
        i9Var.setRoundRadius(g0.L(20.0f));
    }
}
