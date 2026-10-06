package xh;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final /* synthetic */ class g1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i1 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ g1(i1 i1Var, boolean z10, int i10) {
        this.a = i10;
        this.b = i1Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                i1 i1Var = this.b;
                if (!z10) {
                    i1Var.G.setVisibility(8);
                    break;
                } else {
                    i1Var.getClass();
                    break;
                }
            default:
                boolean z11 = this.c;
                i1 i1Var2 = this.b;
                if (!z11) {
                    i1Var2.v.setVisibility(8);
                    break;
                } else {
                    i1Var2.getClass();
                    break;
                }
        }
    }
}
