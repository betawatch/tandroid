package rg;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class h1 extends s4.g0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ j1 d;

    public h1(j1 j1Var, Context context) {
        this.d = j1Var;
        this.c = context;
    }

    @Override // s4.g0
    public final int h() {
        return 14;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        i1 i1Var = (i1) b1Var.a;
        ViewGroup.LayoutParams layoutParams = i1Var.getLayoutParams();
        j1 j1Var = this.d;
        layoutParams.height = ((j1Var.getHeight() - j1Var.getPaddingTop()) - j1Var.getPaddingBottom()) / 2;
        qg.u0 u0Var = j1Var.b3;
        if (u0Var != null) {
            i1Var.a = u0Var.b(i10);
            i1Var.invalidate();
            i1Var.b = j1Var.a3 == i10 ? 1.0f : 0.0f;
            i1Var.invalidate();
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new wl0(new i1(this.d, this.c));
    }
}
