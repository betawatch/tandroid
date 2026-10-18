package rg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.sl0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class s1 extends hm0 {
    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override // s4.g0
    public final int h() {
        return qg.l0.c().size();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        n1 n1Var = (n1) b1Var.a;
        qg.l0 l0Var = (qg.l0) qg.l0.c().get(i10);
        n1Var.getClass();
        n1Var.setTypeface(l0Var.d());
        String str = l0Var.c;
        if (str == null) {
            str = LocaleController.getString(l0Var.b);
        }
        n1Var.setText(str);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        n1 n1Var = new n1(viewGroup.getContext());
        n1Var.setLayoutParams(new s4.o0(-1, -2));
        return new sl0(n1Var);
    }
}
