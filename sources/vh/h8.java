package vh;

import org.telegram.ui.jx0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                jx0 jx0Var = (jx0) this.h;
                jx0Var.Q = false;
                jx0Var.invalidate();
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
                jx0 jx0Var = (jx0) this.h;
                jx0Var.Q = true;
                jx0Var.invalidate();
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
