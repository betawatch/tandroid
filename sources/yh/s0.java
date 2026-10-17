package yh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class s0 extends y4 {
    public final /* synthetic */ p1 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(p1 p1Var, Context context, int i10, TL_stars.StarGift starGift, long j10, m0 m0Var, boolean z10, boolean z11) {
        super(context, i10, starGift, null, j10, m0Var, z10, z11);
        this.x0 = p1Var;
    }

    @Override // yh.y4
    public final xc Y() {
        d6 d6Var;
        p1 p1Var = this.x0;
        org.telegram.ui.ActionBar.d3 d3Var = p1Var.container;
        d6Var = p1Var.resourcesProvider;
        return new xc(d3Var, d6Var);
    }
}
