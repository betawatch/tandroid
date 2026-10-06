package qg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class s1 extends yl0 {
    @Override // org.telegram.ui.Components.yl0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return pg.k0.c().size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        n1 n1Var = (n1) c1Var.a;
        pg.k0 k0Var = (pg.k0) pg.k0.c().get(i10);
        n1Var.getClass();
        n1Var.setTypeface(k0Var.d());
        String str = k0Var.c;
        if (str == null) {
            str = LocaleController.getString(k0Var.b);
        }
        n1Var.setText(str);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        n1 n1Var = new n1(viewGroup.getContext());
        n1Var.setLayoutParams(new s4.p0(-1, -2));
        return new il0(n1Var);
    }
}
