package qh;

import org.telegram.ui.vz0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class u9 extends x9 {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ u9(Object obj, int i10) {
        this.g = i10;
        this.h = obj;
    }

    @Override // qh.x9
    public final void e() {
        switch (this.g) {
            case 0:
                vz0 vz0Var = (vz0) this.h;
                vz0Var.N = false;
                vz0Var.invalidate();
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
                p9Var.post(new v9(p9Var, 0));
                break;
        }
    }

    @Override // qh.x9
    public final void f(boolean z4) {
        switch (this.g) {
            case 0:
                vz0 vz0Var = (vz0) this.h;
                vz0Var.N = true;
                vz0Var.invalidate();
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
