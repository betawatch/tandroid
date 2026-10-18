package rg;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.sl0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class g1 extends s4.g0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ i1 d;

    public g1(i1 i1Var, Context context) {
        this.d = i1Var;
        this.c = context;
    }

    @Override // s4.g0
    public final int h() {
        return 14;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        h1 h1Var = (h1) b1Var.a;
        ViewGroup.LayoutParams layoutParams = h1Var.getLayoutParams();
        i1 i1Var = this.d;
        layoutParams.height = ((i1Var.getHeight() - i1Var.getPaddingTop()) - i1Var.getPaddingBottom()) / 2;
        qg.u0 u0Var = i1Var.Y2;
        if (u0Var != null) {
            h1Var.a = u0Var.b(i10);
            h1Var.invalidate();
            h1Var.b = i1Var.X2 == i10 ? 1.0f : 0.0f;
            h1Var.invalidate();
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new sl0(new h1(this.d, this.c));
    }
}
