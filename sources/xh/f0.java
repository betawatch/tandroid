package xh;

import org.telegram.ui.Components.r6;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ f0(l0 l0Var, int i10) {
        this.a = i10;
        this.b = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l0 l0Var = this.b;
                ph.i iVar = l0Var.h;
                hh.f fVar = l0Var.f;
                if (fVar != null) {
                    fVar.d();
                }
                k0 k0Var = l0Var.H;
                if (k0Var != null) {
                    k0Var.setTranslationY(-iVar.d());
                }
                r6 r6Var = l0Var.w;
                if (r6Var != null) {
                    r6Var.setTranslationY(-iVar.d());
                }
                l0Var.q();
                break;
            case 1:
                this.b.H.performClick();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
