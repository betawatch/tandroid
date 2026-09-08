package yh;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
