// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class uy3 implements View.OnFocusChangeListener {
    public final /* synthetic */ t14 a;

    public uy3(t14 t14Var) {
        this.a = t14Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            String[] F0 = gl.F0();
            t14 t14Var = this.a;
            t14Var.X0 = F0;
            hq6.d0(t14Var.d1).O(t14Var.X0, false);
        }
    }
}
