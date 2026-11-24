// default package

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zt7 extends y59 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ bu7 d;

    public zt7(bu7 bu7Var, Context context) {
        this.d = bu7Var;
        this.c = context;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        au7 au7Var = (au7) u69Var.a;
        ViewGroup.LayoutParams layoutParams = au7Var.getLayoutParams();
        bu7 bu7Var = this.d;
        layoutParams.height = ((bu7Var.getHeight() - bu7Var.getPaddingTop()) - bu7Var.getPaddingBottom()) / 2;
        m58 m58Var = bu7Var.i3;
        if (m58Var != null) {
            au7Var.a = m58Var.b(i);
            au7Var.invalidate();
            au7Var.b = bu7Var.h3 == i ? 1.0f : 0.0f;
            au7Var.invalidate();
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        return new b59(new au7(this.d, this.c));
    }
}
