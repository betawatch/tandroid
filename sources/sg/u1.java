package sg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class u1 extends lm0 {
    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return rg.j0.c().size();
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        p1 p1Var = (p1) e1Var.a;
        rg.j0 j0Var = (rg.j0) rg.j0.c().get(i10);
        p1Var.getClass();
        p1Var.setTypeface(j0Var.d());
        String str = j0Var.c;
        if (str == null) {
            str = LocaleController.getString(j0Var.b);
        }
        p1Var.setText(str);
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        p1 p1Var = new p1(viewGroup.getContext());
        p1Var.setLayoutParams(new s4.q0(-1, -2));
        return new vl0(p1Var);
    }
}
