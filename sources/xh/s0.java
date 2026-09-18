package xh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.vc;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
        f6 f6Var;
        q1 q1Var = this.x0;
        org.telegram.ui.ActionBar.e3 e3Var = q1Var.container;
        f6Var = q1Var.resourcesProvider;
        return new vc(e3Var, f6Var);
    }
}
