package ph;

import org.telegram.ui.a01;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                a01 a01Var = (a01) this.h;
                a01Var.N = false;
                a01Var.invalidate();
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
                p9Var.post(new org.telegram.ui.web.q0(p9Var, 29));
                break;
        }
    }

    @Override // ph.y9
    public final void f(boolean z4) {
        switch (this.g) {
            case 0:
                a01 a01Var = (a01) this.h;
                a01Var.N = true;
                a01Var.invalidate();
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
