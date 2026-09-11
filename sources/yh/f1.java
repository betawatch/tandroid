package yh;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
