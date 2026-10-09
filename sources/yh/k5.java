package yh;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l5 b;
    public final /* synthetic */ long c;

    public /* synthetic */ k5(l5 l5Var, long j3, int i10) {
        this.a = i10;
        this.b = l5Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l5 l5Var = this.b;
                l5Var.q.d0(l5Var.b, l5Var.c, this.c, true, true, l5Var.n);
                break;
            default:
                l5 l5Var2 = this.b;
                l5Var2.q.d0(l5Var2.b, l5Var2.c, this.c, true, true, l5Var2.n);
                break;
        }
    }
}
