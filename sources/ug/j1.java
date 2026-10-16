package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.sb0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class j1 extends di.d {
    public final /* synthetic */ m1 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(m1 m1Var, Context context, c6 c6Var) {
        super(context, c6Var, true);
        this.h0 = m1Var;
    }

    @Override // di.d
    public final float a(float f7, float f10) {
        m1 m1Var = this.h0;
        boolean z10 = m1Var.t0 == 0.0f;
        m1Var.t0 = f7;
        if (z10) {
            m1Var.u0 = new sb0(m1Var, 2);
            m1Var.h0(false);
        }
        return f7;
    }
}
