package yh;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
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
