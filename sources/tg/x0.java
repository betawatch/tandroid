package tg;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.mj0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class x0 extends v4.i0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ z0 d;

    public x0(z0 z0Var, Context context) {
        this.d = z0Var;
        this.c = context;
    }

    @Override // v4.i0
    public final int b() {
        return 14;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        y0 y0Var = (y0) f1Var.a;
        ViewGroup.LayoutParams layoutParams = y0Var.getLayoutParams();
        z0 z0Var = this.d;
        layoutParams.height = ((z0Var.getHeight() - z0Var.getPaddingTop()) - z0Var.getPaddingBottom()) / 2;
        sg.k0 k0Var = z0Var.i3;
        if (k0Var != null) {
            y0Var.a = k0Var.b(i7);
            y0Var.invalidate();
            y0Var.b = z0Var.h3 == i7 ? 1.0f : 0.0f;
            y0Var.invalidate();
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        return new mj0(new y0(this.d, this.c));
    }
}
