package qg;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class j1 extends s4.h0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ l1 d;

    public j1(l1 l1Var, Context context) {
        this.d = l1Var;
        this.c = context;
    }

    @Override // s4.h0
    public final int h() {
        return 14;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        k1 k1Var = (k1) c1Var.a;
        ViewGroup.LayoutParams layoutParams = k1Var.getLayoutParams();
        l1 l1Var = this.d;
        layoutParams.height = ((l1Var.getHeight() - l1Var.getPaddingTop()) - l1Var.getPaddingBottom()) / 2;
        pg.t0 t0Var = l1Var.a3;
        if (t0Var != null) {
            k1Var.a = t0Var.b(i10);
            k1Var.invalidate();
            k1Var.b = l1Var.Z2 == i10 ? 1.0f : 0.0f;
            k1Var.invalidate();
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new wk0(new k1(this.d, this.c));
    }
}
