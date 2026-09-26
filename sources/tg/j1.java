package tg;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.db0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class j1 extends ci.d {
    public final /* synthetic */ m1 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(m1 m1Var, Context context, d6 d6Var) {
        super(context, d6Var, true);
        this.h0 = m1Var;
    }

    @Override // ci.d
    public final float a(float f7, float f10) {
        m1 m1Var = this.h0;
        boolean z10 = m1Var.t0 == 0.0f;
        m1Var.t0 = f7;
        if (z10) {
            m1Var.u0 = new db0(m1Var, 2);
            m1Var.g0(false);
        }
        return f7;
    }
}
