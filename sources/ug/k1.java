package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.sa0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class k1 extends di.d {
    public final /* synthetic */ n1 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(n1 n1Var, Context context, f6 f6Var) {
        super(context, f6Var, true);
        this.h0 = n1Var;
    }

    @Override // di.d
    public final float a(float f7, float f10) {
        n1 n1Var = this.h0;
        boolean z10 = n1Var.t0 == 0.0f;
        n1Var.t0 = f7;
        if (z10) {
            n1Var.u0 = new sa0(n1Var, 2);
            n1Var.g0(false);
        }
        return f7;
    }
}
