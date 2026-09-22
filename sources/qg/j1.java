package qg;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        pg.s0 s0Var = l1Var.a3;
        if (s0Var != null) {
            k1Var.a = s0Var.b(i10);
            k1Var.invalidate();
            k1Var.b = l1Var.Z2 == i10 ? 1.0f : 0.0f;
            k1Var.invalidate();
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new vk0(new k1(this.d, this.c));
    }
}
