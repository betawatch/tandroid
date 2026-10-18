package yh;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h1 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ f1(h1 h1Var, boolean z10, int i10) {
        this.a = i10;
        this.b = h1Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                h1 h1Var = this.b;
                if (!z10) {
                    h1Var.G.setVisibility(8);
                    break;
                } else {
                    h1Var.getClass();
                    break;
                }
            default:
                boolean z11 = this.c;
                h1 h1Var2 = this.b;
                if (!z11) {
                    h1Var2.v.setVisibility(8);
                    break;
                } else {
                    h1Var2.getClass();
                    break;
                }
        }
    }
}
