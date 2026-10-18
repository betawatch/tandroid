package zh;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;

    public /* synthetic */ a0(f0 f0Var, int i10) {
        this.a = i10;
        this.b = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f0 f0Var = this.b;
                if (f0Var.h == null && f0Var.d != null && !f0Var.isFinished && f0Var.getParentActivity() != null) {
                    f0Var.b0(f0Var.d.H0(), 0.0f, true);
                    f0Var.h.setVisibility(4);
                    c cVar = f0Var.x;
                    if (cVar != null) {
                        cVar.setVisibility(4);
                        break;
                    }
                }
                break;
            case 1:
                f0 f0Var2 = this.b;
                c cVar2 = f0Var2.x;
                if (cVar2 != null) {
                    cVar2.invalidate();
                }
                f0Var2.h0();
                break;
            default:
                this.b.f0();
                break;
        }
    }
}
