// default package

import android.view.TextureView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class z55 implements ka8 {
    public final /* synthetic */ h75 a;

    public z55(h75 h75Var) {
        this.a = h75Var;
    }

    @Override // ka8
    public final TextureView k0() {
        return null;
    }

    @Override // ka8
    public final void u0(k27 k27Var) {
        this.a.b.invalidate();
    }

    @Override // ka8
    public final void z(k27 k27Var) {
        h75 h75Var = this.a;
        h75Var.J1.J0(true);
        h75Var.V3.f.r0(gl.L(13.0f), gl.L(13.0f), 0, 0);
        h75Var.b.invalidate();
    }
}
