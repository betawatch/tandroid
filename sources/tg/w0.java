package tg;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.cj0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class w0 extends v4.h0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ y0 d;

    public w0(y0 y0Var, Context context) {
        this.d = y0Var;
        this.c = context;
    }

    @Override // v4.h0
    public final int b() {
        return 14;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        x0 x0Var = (x0) e1Var.a;
        ViewGroup.LayoutParams layoutParams = x0Var.getLayoutParams();
        y0 y0Var = this.d;
        layoutParams.height = ((y0Var.getHeight() - y0Var.getPaddingTop()) - y0Var.getPaddingBottom()) / 2;
        sg.k0 k0Var = y0Var.i3;
        if (k0Var != null) {
            x0Var.a = k0Var.b(i7);
            x0Var.invalidate();
            x0Var.b = y0Var.h3 == i7 ? 1.0f : 0.0f;
            x0Var.invalidate();
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        return new cj0(new x0(this.d, this.c));
    }
}
