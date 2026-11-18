package tg;

import android.view.ViewGroup;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.kj0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class i1 extends bk0 {
    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override // v4.i0
    public final int b() {
        return sg.a0.c().size();
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        d1 d1Var = (d1) f1Var.a;
        sg.a0 a0Var = (sg.a0) sg.a0.c().get(i7);
        d1Var.getClass();
        d1Var.setTypeface(a0Var.d());
        String str = a0Var.c;
        if (str == null) {
            str = gd.N0(a0Var.b);
        }
        d1Var.setText(str);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        d1 d1Var = new d1(viewGroup.getContext());
        d1Var.setLayoutParams(new v4.q0(-1, -2));
        return new kj0(d1Var);
    }
}
