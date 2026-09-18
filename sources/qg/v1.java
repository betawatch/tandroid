package qg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class v1 extends ll0 {
    @Override // org.telegram.ui.Components.ll0
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
        return new wk0(q1Var);
    }
}
