package yh;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class r5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s5 b;
    public final /* synthetic */ long c;

    public /* synthetic */ r5(s5 s5Var, long j3, int i10) {
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
