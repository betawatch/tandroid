package qh;

import org.telegram.ui.a01;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class t9 extends w9 {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ t9(Object obj, int i10) {
        this.g = i10;
        this.h = obj;
    }

    @Override // qh.w9
    public final void e() {
        switch (this.g) {
            case 0:
                a01 a01Var = (a01) this.h;
                a01Var.N = false;
                a01Var.invalidate();
                break;
            case 1:
                oh.f4 t6 = ((oh.i9) this.h).t();
                if (t6 != null) {
                    t6.m0(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.p9 p9Var = (org.telegram.ui.Components.p9) this.h;
                p9Var.post(new u9(p9Var, 0));
                break;
        }
    }

    @Override // qh.w9
    public final void f(boolean z4) {
        switch (this.g) {
            case 0:
                a01 a01Var = (a01) this.h;
                a01Var.N = true;
                a01Var.invalidate();
                break;
            case 1:
                oh.f4 t6 = ((oh.i9) this.h).t();
                if (t6 != null) {
                    t6.m0(false);
                }
                oh.j3 j3Var = this.f;
                if (j3Var != null) {
                    j3Var.setTranslationX(0.0f);
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
