package yh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class r0 extends x4 {
    public final /* synthetic */ o1 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(o1 o1Var, Context context, int i10, TL_stars.StarGift starGift, long j10, l0 l0Var, boolean z10, boolean z11) {
        super(context, i10, starGift, null, j10, l0Var, z10, z11);
        this.z0 = o1Var;
    }

    @Override // yh.x4
    public final xc X() {
        g6 g6Var;
        o1 o1Var = this.z0;
        org.telegram.ui.ActionBar.e3 e3Var = o1Var.container;
        g6Var = o1Var.resourcesProvider;
        return new xc(e3Var, g6Var);
    }
}
