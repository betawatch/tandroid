package rg;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
    public final void v(s4.c1 c1Var, int i10) {
        j1 j1Var = (j1) c1Var.a;
        ViewGroup.LayoutParams layoutParams = j1Var.getLayoutParams();
        k1 k1Var = this.d;
        layoutParams.height = ((k1Var.getHeight() - k1Var.getPaddingTop()) - k1Var.getPaddingBottom()) / 2;
        qg.s0 s0Var = k1Var.a3;
        if (s0Var != null) {
            j1Var.a = s0Var.b(i10);
            j1Var.invalidate();
            j1Var.b = k1Var.Z2 == i10 ? 1.0f : 0.0f;
            j1Var.invalidate();
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new vk0(new j1(this.d, this.c));
    }
}
