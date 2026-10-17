package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.mb0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class h1 extends ei.d {
    public final /* synthetic */ l1 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(l1 l1Var, Context context, d6 d6Var) {
        super(context, d6Var, true);
        this.h0 = l1Var;
    }

    @Override // ei.d
    public final float a(float f7, float f10) {
        l1 l1Var = this.h0;
        boolean z10 = l1Var.t0 == 0.0f;
        l1Var.t0 = f7;
        if (z10) {
            l1Var.u0 = new mb0(l1Var, 2);
            l1Var.h0(false);
        }
        return f7;
    }
}
