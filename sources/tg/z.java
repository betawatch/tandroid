package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo;
import org.telegram.ui.ke;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements Utilities.Callback {
    public final /* synthetic */ b0 a;
    public final /* synthetic */ TL_stories.TL_prepaidStarsGiveaway b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TL_stories.PrepaidGiveaway e;

    public /* synthetic */ z(b0 b0Var, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j3, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.a = b0Var;
        this.b = tL_prepaidStarsGiveaway;
        this.c = j3;
        this.d = j10;
        this.e = prepaidGiveaway;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        b0 b0Var = this.a;
        b0Var.dismiss();
        if (this.b == null) {
            AndroidUtilities.runOnUIThread(new p2.b(22, b0Var, this.e), 220L);
            return;
        }
        n2 U = LaunchActivity.U();
        if (U != null) {
            bo R9 = bo.R9(this.c);
            R9.whenFullyVisible(new ke(R9, this.d, 6));
            U.presentFragment(R9);
        }
    }
}
