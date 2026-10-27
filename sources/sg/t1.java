package sg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class t1 extends mm0 {
    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return rg.j0.c().size();
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        o1 o1Var = (o1) e1Var.a;
        rg.j0 j0Var = (rg.j0) rg.j0.c().get(i10);
        o1Var.getClass();
        o1Var.setTypeface(j0Var.d());
        String str = j0Var.c;
        if (str == null) {
            str = LocaleController.getString(j0Var.b);
        }
        o1Var.setText(str);
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        o1 o1Var = new o1(viewGroup.getContext());
        o1Var.setLayoutParams(new s4.q0(-1, -2));
        return new wl0(o1Var);
    }
}
