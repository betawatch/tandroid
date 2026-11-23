package tg;

import android.view.ViewGroup;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.mj0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class j1 extends dk0 {
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
        e1 e1Var = (e1) f1Var.a;
        sg.a0 a0Var = (sg.a0) sg.a0.c().get(i7);
        e1Var.getClass();
        e1Var.setTypeface(a0Var.d());
        String str = a0Var.c;
        if (str == null) {
            str = hd.O0(a0Var.b);
        }
        e1Var.setText(str);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        e1 e1Var = new e1(viewGroup.getContext());
        e1Var.setLayoutParams(new v4.q0(-1, -2));
        return new mj0(e1Var);
    }
}
