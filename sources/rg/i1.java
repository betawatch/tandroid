package rg;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class i1 extends s4.g0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ k1 d;

    public i1(k1 k1Var, Context context) {
        this.d = k1Var;
        this.c = context;
    }

    @Override // s4.g0
    public final int h() {
        return 14;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        j1 j1Var = (j1) b1Var.a;
        ViewGroup.LayoutParams layoutParams = j1Var.getLayoutParams();
        k1 k1Var = this.d;
        layoutParams.height = ((k1Var.getHeight() - k1Var.getPaddingTop()) - k1Var.getPaddingBottom()) / 2;
        qg.s0 s0Var = k1Var.Y2;
        if (s0Var != null) {
            j1Var.a = s0Var.b(i10);
            j1Var.invalidate();
            j1Var.b = k1Var.X2 == i10 ? 1.0f : 0.0f;
            j1Var.invalidate();
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new wl0(new j1(this.d, this.c));
    }
}
