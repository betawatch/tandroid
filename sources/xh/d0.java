package xh;

import org.telegram.ui.Components.n6;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ d0(j0 j0Var, int i10) {
        this.a = i10;
        this.b = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j0 j0Var = this.b;
                ph.i iVar = j0Var.h;
                hh.g gVar = j0Var.f;
                if (gVar != null) {
                    gVar.d();
                }
                i0 i0Var = j0Var.H;
                if (i0Var != null) {
                    i0Var.setTranslationY(-iVar.c());
                }
                n6 n6Var = j0Var.w;
                if (n6Var != null) {
                    n6Var.setTranslationY(-iVar.c());
                }
                j0Var.o();
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
