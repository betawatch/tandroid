package rg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class t1 extends lm0 {
    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override // s4.g0
    public final int h() {
        return qg.l0.c().size();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        o1 o1Var = (o1) b1Var.a;
        qg.l0 l0Var = (qg.l0) qg.l0.c().get(i10);
        o1Var.getClass();
        o1Var.setTypeface(l0Var.d());
        String str = l0Var.c;
        if (str == null) {
            str = LocaleController.getString(l0Var.b);
        }
        o1Var.setText(str);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        o1 o1Var = new o1(viewGroup.getContext());
        o1Var.setLayoutParams(new s4.o0(-1, -2));
        return new wl0(o1Var);
    }
}
