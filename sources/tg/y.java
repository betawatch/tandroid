package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gg;
import org.telegram.ui.web.x1;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements Utilities.Callback {
    public final /* synthetic */ a0 a;
    public final /* synthetic */ TL_stories.TL_prepaidStarsGiveaway b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TL_stories.PrepaidGiveaway e;

    public /* synthetic */ y(a0 a0Var, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j3, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.a = a0Var;
        this.b = tL_prepaidStarsGiveaway;
        this.c = j3;
        this.d = j10;
        this.e = prepaidGiveaway;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        a0 a0Var = this.a;
        a0Var.dismiss();
        if (this.b == null) {
            AndroidUtilities.runOnUIThread(new x1(28, a0Var, this.e), 220L);
            return;
        }
        n2 U = LaunchActivity.U();
        if (U != null) {
            yn Q9 = yn.Q9(this.c);
            Q9.whenFullyVisible(new gg(Q9, this.d, 6));
            U.presentFragment(Q9);
        }
    }
}
