// default package

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class sx2 implements oo4, no7 {
    public final /* synthetic */ xx2 a;

    public /* synthetic */ sx2(xx2 xx2Var) {
        this.a = xx2Var;
    }

    @Override // no7
    public final vxc W(View view, vxc vxcVar) {
        WindowInsets g = vxcVar.g();
        xx2 xx2Var = this.a;
        xx2Var.q0(g);
        xx2Var.T1.a(vxcVar.a.f(8).d > 0, true);
        return vxc.b;
    }

    @Override // oo4
    public final void a(int i) {
        int min = Math.min(i, gl.L(144.0f));
        if (i > 0) {
            min -= gl.L(8.0f);
        }
        xx2 xx2Var = this.a;
        if (xx2Var.g2 != min) {
            xx2Var.g2 = min;
            xx2Var.S1.a(min);
            xx2Var.c2.postOnAnimation(new mk2(xx2Var, (byte) 12));
        }
    }
}
