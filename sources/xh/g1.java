package xh;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final /* synthetic */ class g1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j1 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ g1(j1 j1Var, boolean z10, int i10) {
        this.a = i10;
        this.b = j1Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                j1 j1Var = this.b;
                if (!z10) {
                    j1Var.G.setVisibility(8);
                    break;
                } else {
                    j1Var.getClass();
                    break;
                }
            default:
                boolean z11 = this.c;
                j1 j1Var2 = this.b;
                if (!z11) {
                    j1Var2.v.setVisibility(8);
                    break;
                } else {
                    j1Var2.getClass();
                    break;
                }
        }
    }
}
