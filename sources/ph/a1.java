package ph;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ a1(c1 c1Var, boolean z10, int i10) {
        this.a = i10;
        this.b = c1Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                c1 c1Var = this.b;
                if (!z10) {
                    c1Var.G.setVisibility(8);
                    break;
                } else {
                    c1Var.getClass();
                    break;
                }
            default:
                boolean z11 = this.c;
                c1 c1Var2 = this.b;
                if (!z11) {
                    c1Var2.w.setVisibility(8);
                    break;
                } else {
                    c1Var2.getClass();
                    break;
                }
        }
    }
}
