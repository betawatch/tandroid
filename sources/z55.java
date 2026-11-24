// default package

import android.view.TextureView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class z55 implements ka8 {
    public final /* synthetic */ h75 a;

    public z55(h75 h75Var) {
        this.a = h75Var;
    }

    @Override // ka8
    public final TextureView j0() {
        return null;
    }

    @Override // ka8
    public final void t0(k27 k27Var) {
        this.a.b.invalidate();
    }

    @Override // ka8
    public final void y(k27 k27Var) {
        h75 h75Var = this.a;
        h75Var.J1.J0(true);
        h75Var.V3.f.r0(gl.L(13.0f), gl.L(13.0f), 0, 0);
        h75Var.b.invalidate();
    }
}
