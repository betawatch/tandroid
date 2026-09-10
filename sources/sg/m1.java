package sg;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.bb0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class m1 extends bi.d {
    public final /* synthetic */ p1 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(p1 p1Var, Context context, f6 f6Var) {
        super(context, f6Var, true);
        this.h0 = p1Var;
    }

    @Override // bi.d
    public final float a(float f7, float f10) {
        p1 p1Var = this.h0;
        boolean z10 = p1Var.t0 == 0.0f;
        p1Var.t0 = f7;
        if (z10) {
            p1Var.u0 = new bb0(p1Var, 2);
            p1Var.g0(false);
        }
        return f7;
    }
}
