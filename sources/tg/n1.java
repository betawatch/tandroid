package tg;

import android.view.ViewGroup;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.mj0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class n1 extends dk0 {
    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override // v4.i0
    public final int b() {
        return sg.a0.c().size();
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        i1 i1Var = (i1) f1Var.a;
        sg.a0 a0Var = (sg.a0) sg.a0.c().get(i7);
        i1Var.getClass();
        i1Var.setTypeface(a0Var.d());
        String str = a0Var.c;
        if (str == null) {
            str = gd.O0(a0Var.b);
        }
        i1Var.setText(str);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        i1 i1Var = new i1(viewGroup.getContext());
        i1Var.setLayoutParams(new v4.q0(-1, -2));
        return new mj0(i1Var);
    }
}
