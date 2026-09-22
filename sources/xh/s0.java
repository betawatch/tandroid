package xh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.vc;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class s0 extends y4 {
    public final /* synthetic */ q1 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(q1 q1Var, Context context, int i10, TL_stars.StarGift starGift, long j3, m0 m0Var, boolean z10, boolean z11) {
        super(context, i10, starGift, null, j3, m0Var, z10, z11);
        this.x0 = q1Var;
    }

    @Override // xh.y4
    public final vc X() {
        e6 e6Var;
        q1 q1Var = this.x0;
        org.telegram.ui.ActionBar.d3 d3Var = q1Var.container;
        e6Var = q1Var.resourcesProvider;
        return new vc(d3Var, e6Var);
    }
}
