package pg;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.fl0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class g1 extends s4.h0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ i1 d;

    public g1(i1 i1Var, Context context) {
        this.d = i1Var;
        this.c = context;
    }

    @Override // s4.h0
    public final int h() {
        return 14;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        h1 h1Var = (h1) c1Var.a;
        ViewGroup.LayoutParams layoutParams = h1Var.getLayoutParams();
        i1 i1Var = this.d;
        layoutParams.height = ((i1Var.getHeight() - i1Var.getPaddingTop()) - i1Var.getPaddingBottom()) / 2;
        og.x0 x0Var = i1Var.a3;
        if (x0Var != null) {
            h1Var.a = x0Var.b(i10);
            h1Var.invalidate();
            h1Var.b = i1Var.Z2 == i10 ? 1.0f : 0.0f;
            h1Var.invalidate();
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new fl0(new h1(this.d, this.c));
    }
}
