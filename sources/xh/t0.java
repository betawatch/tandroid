package xh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class t0 extends z4 {
    public final /* synthetic */ r1 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(r1 r1Var, Context context, int i10, TL_stars.StarGift starGift, long j3, m0 m0Var, boolean z10, boolean z11) {
        super(context, i10, starGift, null, j3, m0Var, z10, z11);
        this.x0 = r1Var;
    }

    @Override // xh.z4
    public final xc X() {
        e6 e6Var;
        r1 r1Var = this.x0;
        org.telegram.ui.ActionBar.d3 d3Var = r1Var.container;
        e6Var = r1Var.resourcesProvider;
        return new xc(d3Var, e6Var);
    }
}
