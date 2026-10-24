package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.nb0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class h1 extends ei.d {
    public final /* synthetic */ l1 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(l1 l1Var, Context context, g6 g6Var) {
        super(context, g6Var, true);
        this.k0 = l1Var;
    }

    @Override // ei.d
    public final float a(float f7, float f10) {
        l1 l1Var = this.k0;
        boolean z10 = l1Var.t0 == 0.0f;
        l1Var.t0 = f7;
        if (z10) {
            l1Var.u0 = new nb0(l1Var, 2);
            l1Var.g0(false);
        }
        return f7;
    }
}
