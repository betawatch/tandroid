package yh;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s5 b;
    public final /* synthetic */ long c;

    public /* synthetic */ q5(s5 s5Var, long j3, int i10) {
        this.a = i10;
        this.b = s5Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s5 s5Var = this.b;
                s5Var.q.d0(s5Var.b, s5Var.c, this.c, true, true, s5Var.n);
                break;
            default:
                s5 s5Var2 = this.b;
                s5Var2.q.d0(s5Var2.b, s5Var2.c, this.c, true, true, s5Var2.n);
                break;
        }
    }
}
