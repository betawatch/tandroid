package ug;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.je;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements Utilities.Callback {
    public final /* synthetic */ y a;
    public final /* synthetic */ TL_stories.TL_prepaidStarsGiveaway b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TL_stories.PrepaidGiveaway e;

    public /* synthetic */ w(y yVar, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j10, long j11, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.a = yVar;
        this.b = tL_prepaidStarsGiveaway;
        this.c = j10;
        this.d = j11;
        this.e = prepaidGiveaway;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        y yVar = this.a;
        yVar.dismiss();
        if (this.b == null) {
            AndroidUtilities.runOnUIThread(new u2.k0(8, yVar, this.e), 220L);
            return;
        }
        o2 U = LaunchActivity.U();
        if (U != null) {
            sn W9 = sn.W9(this.c);
            W9.whenFullyVisible(new je(W9, this.d, 6));
            U.presentFragment(W9);
        }
    }
}
