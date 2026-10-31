package qh;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ d0(i0 i0Var, int i10) {
        this.a = i10;
        this.b = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i0 i0Var = this.b;
                if (i0Var.h == null && i0Var.d != null && !i0Var.isFinished && i0Var.getParentActivity() != null) {
                    i0Var.f0(i0Var.d.H0(), 0.0f, true);
                    i0Var.h.setVisibility(4);
                    c cVar = i0Var.y;
                    if (cVar != null) {
                        cVar.setVisibility(4);
                        break;
                    }
                }
                break;
            case 1:
                i0 i0Var2 = this.b;
                c cVar2 = i0Var2.y;
                if (cVar2 != null) {
                    cVar2.invalidate();
                }
                i0Var2.l0();
                break;
            default:
                this.b.j0();
                break;
        }
    }
}
