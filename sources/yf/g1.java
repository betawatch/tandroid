package yf;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.ik0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g1 extends f2.r0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ i1 d;

    public g1(i1 i1Var, Context context) {
        this.d = i1Var;
        this.c = context;
    }

    @Override // f2.r0
    public final int h() {
        return 14;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        h1 h1Var = (h1) q1Var.a;
        ViewGroup.LayoutParams layoutParams = h1Var.getLayoutParams();
        i1 i1Var = this.d;
        layoutParams.height = ((i1Var.getHeight() - i1Var.getPaddingTop()) - i1Var.getPaddingBottom()) / 2;
        xf.s0 s0Var = i1Var.W2;
        if (s0Var != null) {
            h1Var.a = s0Var.b(i9);
            h1Var.invalidate();
            h1Var.b = i1Var.V2 == i9 ? 1.0f : 0.0f;
            h1Var.invalidate();
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        return new ik0(new h1(this.d, this.c));
    }
}
