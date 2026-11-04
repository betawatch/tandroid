package ug;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.bj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v0 extends u4.h0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ x0 d;

    public v0(x0 x0Var, Context context) {
        this.d = x0Var;
        this.c = context;
    }

    @Override // u4.h0
    public final int b() {
        return 14;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        w0 w0Var = (w0) d1Var.a;
        ViewGroup.LayoutParams layoutParams = w0Var.getLayoutParams();
        x0 x0Var = this.d;
        layoutParams.height = ((x0Var.getHeight() - x0Var.getPaddingTop()) - x0Var.getPaddingBottom()) / 2;
        tg.k0 k0Var = x0Var.i3;
        if (k0Var != null) {
            w0Var.a = k0Var.b(i3);
            w0Var.invalidate();
            w0Var.b = x0Var.h3 == i3 ? 1.0f : 0.0f;
            w0Var.invalidate();
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        return new bj0(new w0(this.d, this.c));
    }
}
