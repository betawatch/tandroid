package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ke;
import org.telegram.ui.web.o1;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
            AndroidUtilities.runOnUIThread(new o1(27, a0Var, this.e), 220L);
            return;
        }
        m2 U = LaunchActivity.U();
        if (U != null) {
            wn R9 = wn.R9(this.c);
            R9.whenFullyVisible(new ke(R9, this.d, 6));
            U.presentFragment(R9);
        }
    }
}
