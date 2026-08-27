package zf;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.lk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class g1 extends f2.q0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ i1 d;

    public g1(i1 i1Var, Context context) {
        this.d = i1Var;
        this.c = context;
    }

    @Override // f2.q0
    public final int h() {
        return 14;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        h1 h1Var = (h1) o1Var.a;
        ViewGroup.LayoutParams layoutParams = h1Var.getLayoutParams();
        i1 i1Var = this.d;
        layoutParams.height = ((i1Var.getHeight() - i1Var.getPaddingTop()) - i1Var.getPaddingBottom()) / 2;
        yf.r0 r0Var = i1Var.W2;
        if (r0Var != null) {
            h1Var.a = r0Var.b(i10);
            h1Var.invalidate();
            h1Var.b = i1Var.V2 == i10 ? 1.0f : 0.0f;
            h1Var.invalidate();
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        return new lk0(new h1(this.d, this.c));
    }
}
