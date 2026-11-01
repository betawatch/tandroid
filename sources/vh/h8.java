package vh;

import org.telegram.ui.ix0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class h8 extends j8 {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ h8(Object obj, int i10) {
        this.g = i10;
        this.h = obj;
    }

    @Override // vh.j8
    public final void e() {
        switch (this.g) {
            case 0:
                ix0 ix0Var = (ix0) this.h;
                ix0Var.Q = false;
                ix0Var.invalidate();
                break;
            case 1:
                th.z2 H = ((th.o7) this.h).H();
                if (H != null) {
                    H.k0(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.g9 g9Var = (org.telegram.ui.Components.g9) this.h;
                g9Var.post(new d0(g9Var, 19));
                break;
        }
    }

    @Override // vh.j8
    public final void f(boolean z10) {
        switch (this.g) {
            case 0:
                ix0 ix0Var = (ix0) this.h;
                ix0Var.Q = true;
                ix0Var.invalidate();
                break;
            case 1:
                th.z2 H = ((th.o7) this.h).H();
                if (H != null) {
                    H.k0(false);
                }
                th.g2 g2Var = this.f;
                if (g2Var != null) {
                    g2Var.setTranslationX(0.0f);
                    this.f.setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                ((org.telegram.ui.Components.g9) this.h).setVisibility(0);
                break;
        }
    }
}
