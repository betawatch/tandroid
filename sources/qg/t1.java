package qg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.ul0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class t1 extends ul0 {
    @Override // org.telegram.ui.Components.ul0
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
        return new fl0(o1Var);
    }
}
