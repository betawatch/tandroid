package qg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.pm0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class s1 extends pm0 {
    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override // s4.i0
    public final int h() {
        return pg.k0.c().size();
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        n1 n1Var = (n1) d1Var.a;
        pg.k0 k0Var = (pg.k0) pg.k0.c().get(i10);
        n1Var.getClass();
        n1Var.setTypeface(k0Var.d());
        String str = k0Var.c;
        if (str == null) {
            str = LocaleController.getString(k0Var.b);
        }
        n1Var.setText(str);
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        n1 n1Var = new n1(viewGroup.getContext());
        n1Var.setLayoutParams(new s4.q0(-1, -2));
        return new am0(n1Var);
    }
}
