package qg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class v1 extends kl0 {
    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return pg.j0.c().size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        q1 q1Var = (q1) c1Var.a;
        pg.j0 j0Var = (pg.j0) pg.j0.c().get(i10);
        q1Var.getClass();
        q1Var.setTypeface(j0Var.d());
        String str = j0Var.c;
        if (str == null) {
            str = LocaleController.getString(j0Var.b);
        }
        q1Var.setText(str);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        q1 q1Var = new q1(viewGroup.getContext());
        q1Var.setLayoutParams(new s4.p0(-1, -2));
        return new vk0(q1Var);
    }
}
