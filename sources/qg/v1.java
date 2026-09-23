package qg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class v1 extends ll0 {
    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return pg.k0.c().size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        q1 q1Var = (q1) c1Var.a;
        pg.k0 k0Var = (pg.k0) pg.k0.c().get(i10);
        q1Var.getClass();
        q1Var.setTypeface(k0Var.d());
        String str = k0Var.c;
        if (str == null) {
            str = LocaleController.getString(k0Var.b);
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
