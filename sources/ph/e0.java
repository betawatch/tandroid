package ph;

import org.telegram.ui.Components.f6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
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
                hh.i iVar = k0Var.n1;
                zg.e eVar = k0Var.m1;
                if (eVar != null) {
                    eVar.d();
                }
                j0 j0Var = k0Var.y1;
                if (j0Var != null) {
                    j0Var.setTranslationY(-iVar.d());
                }
                f6 f6Var = k0Var.s1;
                if (f6Var != null) {
                    f6Var.setTranslationY(-iVar.d());
                }
                k0Var.I0();
                break;
            case 1:
                this.b.y1.performClick();
                break;
            case 2:
                this.b.o1.G0();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
