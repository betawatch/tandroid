package tg;

import android.view.ViewGroup;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class i1 extends tj0 {
    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override // v4.h0
    public final int b() {
        return sg.a0.c().size();
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        d1 d1Var = (d1) e1Var.a;
        sg.a0 a0Var = (sg.a0) sg.a0.c().get(i7);
        d1Var.getClass();
        d1Var.setTypeface(a0Var.d());
        String str = a0Var.c;
        if (str == null) {
            str = hd.N0(a0Var.b);
        }
        d1Var.setText(str);
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        d1 d1Var = new d1(viewGroup.getContext());
        d1Var.setLayoutParams(new v4.p0(-1, -2));
        return new cj0(d1Var);
    }
}
