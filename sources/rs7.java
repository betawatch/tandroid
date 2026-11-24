// default package

import android.view.ViewGroup;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class rs7 extends n39 {
    @Override // n39
    public final boolean D(s49 s49Var) {
        return true;
    }

    @Override // w39
    public final int b() {
        return qs7.a().size();
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        gs7 gs7Var = (gs7) s49Var.a;
        qs7 qs7Var = (qs7) qs7.a().get(i);
        gs7Var.getClass();
        gs7Var.setTypeface(qs7Var.b());
        String str = qs7Var.c;
        if (str == null) {
            str = k96.N0(qs7Var.b);
        }
        gs7Var.setText(str);
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        gs7 gs7Var = new gs7(viewGroup.getContext());
        gs7Var.setLayoutParams(new e49(-1, -2));
        return new y29(gs7Var);
    }
}
