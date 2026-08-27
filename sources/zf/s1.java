package zf;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.yk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class s1 extends yk0 {
    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    @Override // f2.q0
    public final int h() {
        return yf.i0.c().size();
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        n1 n1Var = (n1) o1Var.a;
        yf.i0 i0Var = (yf.i0) yf.i0.c().get(i10);
        n1Var.getClass();
        n1Var.setTypeface(i0Var.d());
        String str = i0Var.c;
        if (str == null) {
            str = LocaleController.getString(i0Var.b);
        }
        n1Var.setText(str);
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        n1 n1Var = new n1(viewGroup.getContext());
        n1Var.setLayoutParams(new f2.y0(-1, -2));
        return new lk0(n1Var);
    }
}
