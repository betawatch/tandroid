package qg;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.gl0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class h1 extends s4.h0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ j1 d;

    public h1(j1 j1Var, Context context) {
        this.d = j1Var;
        this.c = context;
    }

    @Override // s4.h0
    public final int h() {
        return 14;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        i1 i1Var = (i1) c1Var.a;
        ViewGroup.LayoutParams layoutParams = i1Var.getLayoutParams();
        j1 j1Var = this.d;
        layoutParams.height = ((j1Var.getHeight() - j1Var.getPaddingTop()) - j1Var.getPaddingBottom()) / 2;
        pg.u0 u0Var = j1Var.a3;
        if (u0Var != null) {
            i1Var.a = u0Var.b(i10);
            i1Var.invalidate();
            i1Var.b = j1Var.Z2 == i10 ? 1.0f : 0.0f;
            i1Var.invalidate();
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new gl0(new i1(this.d, this.c));
    }
}
