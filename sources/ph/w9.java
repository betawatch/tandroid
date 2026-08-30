package ph;

import org.telegram.ui.tz0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class w9 extends y9 {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ w9(Object obj, int i10) {
        this.g = i10;
        this.h = obj;
    }

    @Override // ph.y9
    public final void e() {
        switch (this.g) {
            case 0:
                tz0 tz0Var = (tz0) this.h;
                tz0Var.N = false;
                tz0Var.invalidate();
                break;
            case 1:
                nh.d4 t6 = ((nh.i9) this.h).t();
                if (t6 != null) {
                    t6.m0(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.p9 p9Var = (org.telegram.ui.Components.p9) this.h;
                p9Var.post(new org.telegram.ui.web.o0(p9Var, 29));
                break;
        }
    }

    @Override // ph.y9
    public final void f(boolean z4) {
        switch (this.g) {
            case 0:
                tz0 tz0Var = (tz0) this.h;
                tz0Var.N = true;
                tz0Var.invalidate();
                break;
            case 1:
                nh.d4 t6 = ((nh.i9) this.h).t();
                if (t6 != null) {
                    t6.m0(false);
                }
                nh.i3 i3Var = this.f;
                if (i3Var != null) {
                    i3Var.setTranslationX(0.0f);
                    this.f.setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                ((org.telegram.ui.Components.p9) this.h).setVisibility(0);
                break;
        }
    }
}
