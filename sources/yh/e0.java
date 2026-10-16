package yh;

import org.telegram.ui.Components.s6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;

    public /* synthetic */ e0(k0 k0Var, int i10) {
        this.a = i10;
        this.b = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k0 k0Var = this.b;
                qh.i iVar = k0Var.h;
                ih.f fVar = k0Var.f;
                if (fVar != null) {
                    fVar.d();
                }
                j0 j0Var = k0Var.H;
                if (j0Var != null) {
                    j0Var.setTranslationY(-iVar.d());
                }
                s6 s6Var = k0Var.w;
                if (s6Var != null) {
                    s6Var.setTranslationY(-iVar.d());
                }
                k0Var.q();
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
