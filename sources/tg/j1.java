package tg;

import android.content.Context;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.ab0;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class j1 extends ci.d {
    public final /* synthetic */ m1 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(m1 m1Var, Context context, e6 e6Var) {
        super(context, e6Var, true);
        this.h0 = m1Var;
    }

    @Override // ci.d
    public final float a(float f7, float f10) {
        m1 m1Var = this.h0;
        boolean z10 = m1Var.t0 == 0.0f;
        m1Var.t0 = f7;
        if (z10) {
            m1Var.u0 = new ab0(m1Var, 2);
            m1Var.g0(false);
        }
        return f7;
    }
}
