package yh;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ e1(g1 g1Var, boolean z10, int i10) {
        this.a = i10;
        this.b = g1Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                g1 g1Var = this.b;
                if (!z10) {
                    g1Var.G.setVisibility(8);
                    break;
                } else {
                    g1Var.getClass();
                    break;
                }
            default:
                boolean z11 = this.c;
                g1 g1Var2 = this.b;
                if (!z11) {
                    g1Var2.v.setVisibility(8);
                    break;
                } else {
                    g1Var2.getClass();
                    break;
                }
        }
    }
}
