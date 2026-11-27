// default package

import android.view.ViewGroup;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class yv7 extends c79 {
    @Override // c79
    public final boolean D(f89 f89Var) {
        return true;
    }

    @Override // j79
    public final int b() {
        return xv7.a().size();
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        mv7 mv7Var = (mv7) f89Var.a;
        xv7 xv7Var = (xv7) xv7.a().get(i);
        mv7Var.getClass();
        mv7Var.setTypeface(xv7Var.b());
        String str = xv7Var.c;
        if (str == null) {
            str = ob6.N0(xv7Var.b);
        }
        mv7Var.setText(str);
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        mv7 mv7Var = new mv7(viewGroup.getContext());
        mv7Var.setLayoutParams(new r79(-1, -2));
        return new n69(mv7Var);
    }
}
