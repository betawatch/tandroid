package qg;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.gl0;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
        pg.u0 u0Var = i1Var.a3;
        if (u0Var != null) {
            h1Var.a = u0Var.b(i10);
            h1Var.invalidate();
            h1Var.b = i1Var.Z2 == i10 ? 1.0f : 0.0f;
            h1Var.invalidate();
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new gl0(new h1(this.d, this.c));
    }
}
