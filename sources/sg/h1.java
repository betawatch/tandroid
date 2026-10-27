package sg;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class h1 extends s4.h0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ j1 d;

    public h1(j1 j1Var, Context context) {
        this.d = j1Var;
        this.c = context;
    }

    @Override // s4.h0
    public final int h() {
        return 14;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        i1 i1Var = (i1) e1Var.a;
        ViewGroup.LayoutParams layoutParams = i1Var.getLayoutParams();
        j1 j1Var = this.d;
        layoutParams.height = ((j1Var.getHeight() - j1Var.getPaddingTop()) - j1Var.getPaddingBottom()) / 2;
        rg.s0 s0Var = j1Var.i3;
        if (s0Var != null) {
            i1Var.a = s0Var.b(i10);
            i1Var.invalidate();
            i1Var.b = j1Var.h3 == i10 ? 1.0f : 0.0f;
            i1Var.invalidate();
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        return new wl0(new i1(this.d, this.c));
    }
}
