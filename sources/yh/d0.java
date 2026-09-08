package yh;

import org.telegram.ui.Components.q6;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                qh.i iVar = j0Var.h;
                ih.g gVar = j0Var.f;
                if (gVar != null) {
                    gVar.d();
                }
                i0 i0Var = j0Var.H;
                if (i0Var != null) {
                    i0Var.setTranslationY(-iVar.c());
                }
                q6 q6Var = j0Var.w;
                if (q6Var != null) {
                    q6Var.setTranslationY(-iVar.c());
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
