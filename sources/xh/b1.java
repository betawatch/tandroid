package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.vc;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class b1 extends yh.a4 {
    public final /* synthetic */ q1 r1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(q1 q1Var, Context context, int i10, long j3, f6 f6Var) {
        super(context, i10, j3, f6Var, null);
        this.r1 = q1Var;
    }

    @Override // yh.a4, org.telegram.ui.ActionBar.g3, org.telegram.ui.ActionBar.k2
    public final vc getBulletinFactory() {
        f6 f6Var;
        q1 q1Var = this.r1;
        org.telegram.ui.ActionBar.e3 e3Var = q1Var.container;
        f6Var = q1Var.resourcesProvider;
        return new vc(e3Var, f6Var);
    }
}
