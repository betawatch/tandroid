package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.vc;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class a1 extends y4 {
    public final /* synthetic */ q1 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(q1 q1Var, Context context, int i10, rg.k kVar, long j3, m0 m0Var) {
        super(context, i10, null, kVar, j3, m0Var, false, false);
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
