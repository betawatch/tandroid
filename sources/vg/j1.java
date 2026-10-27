package vg;

import android.content.Context;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.lb0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class j1 extends fi.d {
    public final /* synthetic */ n1 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(n1 n1Var, Context context, u6 u6Var) {
        super(context, u6Var, true);
        this.k0 = n1Var;
    }

    @Override // fi.d
    public final float a(float f7, float f10) {
        n1 n1Var = this.k0;
        boolean z10 = n1Var.t0 == 0.0f;
        n1Var.t0 = f7;
        if (z10) {
            n1Var.u0 = new lb0(n1Var, 2);
            n1Var.g0(false);
        }
        return f7;
    }
}
