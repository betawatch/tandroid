package rg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class u1 extends kl0 {
    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return qg.j0.c().size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        p1 p1Var = (p1) c1Var.a;
        qg.j0 j0Var = (qg.j0) qg.j0.c().get(i10);
        p1Var.getClass();
        p1Var.setTypeface(j0Var.d());
        String str = j0Var.c;
        if (str == null) {
            str = LocaleController.getString(j0Var.b);
        }
        p1Var.setText(str);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        p1 p1Var = new p1(viewGroup.getContext());
        p1Var.setLayoutParams(new s4.p0(-1, -2));
        return new vk0(p1Var);
    }
}
