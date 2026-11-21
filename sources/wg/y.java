package wg;

import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements x10 {
    public final /* synthetic */ a0 a;
    public final /* synthetic */ TL_stories.TL_prepaidStarsGiveaway b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TL_stories.PrepaidGiveaway e;

    public /* synthetic */ y(long j3, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, a0 a0Var) {
        this.a = a0Var;
        this.b = tL_prepaidStarsGiveaway;
        this.c = j3;
        this.d = j10;
        this.e = prepaidGiveaway;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        a0 a0Var = this.a;
        a0Var.dismiss();
        if (this.b == null) {
            org.telegram.messenger.g0.h3(new q(4, a0Var, this.e), 220L);
            return;
        }
        g2 T = LaunchActivity.T();
        if (T != null) {
            bn ua2 = bn.ua(this.c);
            ua2.whenFullyVisible(new bg.k0(ua2, this.d, 7));
            T.presentFragment(ua2);
        }
    }
}
