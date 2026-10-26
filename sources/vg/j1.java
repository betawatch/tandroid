package vg;

import android.content.Context;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.kb0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
            n1Var.u0 = new kb0(n1Var, 2);
            n1Var.g0(false);
        }
        return f7;
    }
}
