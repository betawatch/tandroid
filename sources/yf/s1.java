package yf;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s1 extends vk0 {
    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override // f2.r0
    public final int h() {
        return xf.i0.c().size();
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        n1 n1Var = (n1) q1Var.a;
        xf.i0 i0Var = (xf.i0) xf.i0.c().get(i9);
        n1Var.getClass();
        n1Var.setTypeface(i0Var.d());
        String str = i0Var.c;
        if (str == null) {
            str = LocaleController.getString(i0Var.b);
        }
        n1Var.setText(str);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        n1 n1Var = new n1(viewGroup.getContext());
        n1Var.setLayoutParams(new f2.a1(-1, -2));
        return new ik0(n1Var);
    }
}
