package yh;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t5 b;
    public final /* synthetic */ long c;

    public /* synthetic */ s5(t5 t5Var, long j3, int i10) {
        this.a = i10;
        this.b = t5Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t5 t5Var = this.b;
                t5Var.q.d0(t5Var.b, t5Var.c, this.c, true, true, t5Var.n);
                break;
            default:
                t5 t5Var2 = this.b;
                t5Var2.q.d0(t5Var2.b, t5Var2.c, this.c, true, true, t5Var2.n);
                break;
        }
    }
}
