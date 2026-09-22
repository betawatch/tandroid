package qg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.xl0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class t1 extends xl0 {
    @Override // org.telegram.ui.Components.xl0
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
        return new il0(o1Var);
    }
}
