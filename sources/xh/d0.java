package xh;

import org.telegram.ui.Components.n6;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
