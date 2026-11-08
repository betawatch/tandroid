package tg;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class w0 extends v4.g0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ y0 d;

    public w0(y0 y0Var, Context context) {
        this.d = y0Var;
        this.c = context;
    }

    @Override // v4.g0
    public final int b() {
        return 14;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        x0 x0Var = (x0) d1Var.a;
        ViewGroup.LayoutParams layoutParams = x0Var.getLayoutParams();
        y0 y0Var = this.d;
        layoutParams.height = ((y0Var.getHeight() - y0Var.getPaddingTop()) - y0Var.getPaddingBottom()) / 2;
        sg.l0 l0Var = y0Var.h3;
        if (l0Var != null) {
            x0Var.a = l0Var.b(i7);
            x0Var.invalidate();
            x0Var.b = y0Var.g3 == i7 ? 1.0f : 0.0f;
            x0Var.invalidate();
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        return new xi0(new x0(this.d, this.c));
    }
}
