package tg;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.mj0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class b1 extends v4.i0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ d1 d;

    public b1(d1 d1Var, Context context) {
        this.d = d1Var;
        this.c = context;
    }

    @Override // v4.i0
    public final int b() {
        return 14;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        c1 c1Var = (c1) f1Var.a;
        ViewGroup.LayoutParams layoutParams = c1Var.getLayoutParams();
        d1 d1Var = this.d;
        layoutParams.height = ((d1Var.getHeight() - d1Var.getPaddingTop()) - d1Var.getPaddingBottom()) / 2;
        sg.j0 j0Var = d1Var.i3;
        if (j0Var != null) {
            c1Var.a = j0Var.b(i7);
            c1Var.invalidate();
            c1Var.b = d1Var.h3 == i7 ? 1.0f : 0.0f;
            c1Var.invalidate();
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        return new mj0(new c1(this.d, this.c));
    }
}
