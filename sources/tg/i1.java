package tg;

import android.view.ViewGroup;
import org.telegram.messenger.id;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class i1 extends oj0 {
    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override // v4.g0
    public final int b() {
        return sg.b0.c().size();
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        d1 d1Var2 = (d1) d1Var.a;
        sg.b0 b0Var = (sg.b0) sg.b0.c().get(i7);
        d1Var2.getClass();
        d1Var2.setTypeface(b0Var.d());
        String str = b0Var.c;
        if (str == null) {
            str = id.N0(b0Var.b);
        }
        d1Var2.setText(str);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        d1 d1Var = new d1(viewGroup.getContext());
        d1Var.setLayoutParams(new v4.o0(-1, -2));
        return new xi0(d1Var);
    }
}
