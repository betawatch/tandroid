package pg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.ul0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class s1 extends ul0 {
    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return og.m0.c().size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        n1 n1Var = (n1) c1Var.a;
        og.m0 m0Var = (og.m0) og.m0.c().get(i10);
        n1Var.getClass();
        n1Var.setTypeface(m0Var.d());
        String str = m0Var.c;
        if (str == null) {
            str = LocaleController.getString(m0Var.b);
        }
        n1Var.setText(str);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        n1 n1Var = new n1(viewGroup.getContext());
        n1Var.setLayoutParams(new s4.p0(-1, -2));
        return new fl0(n1Var);
    }
}
