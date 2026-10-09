package xh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.ad;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class u0 extends z4 {
    public final /* synthetic */ r1 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(r1 r1Var, Context context, int i10, TL_stars.StarGift starGift, long j3, o0 o0Var, boolean z10, boolean z11) {
        super(context, i10, starGift, null, j3, o0Var, z10, z11);
        this.x0 = r1Var;
    }

    @Override // xh.z4
    public final ad Y() {
        e6 e6Var;
        r1 r1Var = this.x0;
        org.telegram.ui.ActionBar.d3 d3Var = r1Var.container;
        e6Var = r1Var.resourcesProvider;
        return new ad(d3Var, e6Var);
    }
}
