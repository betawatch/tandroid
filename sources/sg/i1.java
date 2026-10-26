package sg;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class i1 extends s4.h0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ k1 d;

    public i1(k1 k1Var, Context context) {
        this.d = k1Var;
        this.c = context;
    }

    @Override // s4.h0
    public final int h() {
        return 14;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        j1 j1Var = (j1) e1Var.a;
        ViewGroup.LayoutParams layoutParams = j1Var.getLayoutParams();
        k1 k1Var = this.d;
        layoutParams.height = ((k1Var.getHeight() - k1Var.getPaddingTop()) - k1Var.getPaddingBottom()) / 2;
        rg.s0 s0Var = k1Var.i3;
        if (s0Var != null) {
            j1Var.a = s0Var.b(i10);
            j1Var.invalidate();
            j1Var.b = k1Var.h3 == i10 ? 1.0f : 0.0f;
            j1Var.invalidate();
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        return new vl0(new j1(this.d, this.c));
    }
}
