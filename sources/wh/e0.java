package wh;

import org.telegram.ui.Components.o6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
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
                oh.i iVar = k0Var.h;
                gh.g gVar = k0Var.f;
                if (gVar != null) {
                    gVar.d();
                }
                j0 j0Var = k0Var.H;
                if (j0Var != null) {
                    j0Var.setTranslationY(-iVar.c());
                }
                o6 o6Var = k0Var.w;
                if (o6Var != null) {
                    o6Var.setTranslationY(-iVar.c());
                }
                k0Var.o();
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
