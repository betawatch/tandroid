package vg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y implements Utilities.Callback {
    public final /* synthetic */ a0 a;
    public final /* synthetic */ TL_stories.TL_prepaidStarsGiveaway b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TL_stories.PrepaidGiveaway e;

    public /* synthetic */ y(a0 a0Var, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j10, long j11, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.a = a0Var;
        this.b = tL_prepaidStarsGiveaway;
        this.c = j10;
        this.d = j11;
        this.e = prepaidGiveaway;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        a0 a0Var = this.a;
        a0Var.dismiss();
        if (this.b == null) {
            AndroidUtilities.runOnUIThread(new s9.g(25, a0Var, this.e), 220L);
            return;
        }
        r2 U = LaunchActivity.U();
        if (U != null) {
            wn ea2 = wn.ea(this.c);
            ea2.whenFullyVisible(new ag.o0(ea2, this.d, 7));
            U.presentFragment(ea2);
        }
    }
}
