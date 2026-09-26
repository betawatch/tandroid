package qg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class t1 extends vl0 {
    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return pg.k0.c().size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        o1 o1Var = (o1) c1Var.a;
        pg.k0 k0Var = (pg.k0) pg.k0.c().get(i10);
        o1Var.getClass();
        o1Var.setTypeface(k0Var.d());
        String str = k0Var.c;
        if (str == null) {
            str = LocaleController.getString(k0Var.b);
        }
        o1Var.setText(str);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        o1 o1Var = new o1(viewGroup.getContext());
        o1Var.setLayoutParams(new s4.p0(-1, -2));
        return new gl0(o1Var);
    }
}
