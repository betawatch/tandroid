package tg;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.ra0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class k1 extends ci.d {
    public final /* synthetic */ n1 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(n1 n1Var, Context context, f6 f6Var) {
        super(context, f6Var, true);
        this.h0 = n1Var;
    }

    @Override // ci.d
    public final float a(float f7, float f10) {
        n1 n1Var = this.h0;
        boolean z10 = n1Var.t0 == 0.0f;
        n1Var.t0 = f7;
        if (z10) {
            n1Var.u0 = new ra0(n1Var, 2);
            n1Var.g0(false);
        }
        return f7;
    }
}
