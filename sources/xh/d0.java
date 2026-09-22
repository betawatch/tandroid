package xh;

import org.telegram.ui.Components.o6;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                o6 o6Var = j0Var.w;
                if (o6Var != null) {
                    o6Var.setTranslationY(-iVar.c());
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
