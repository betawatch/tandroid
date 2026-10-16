package zh;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m5 b;
    public final /* synthetic */ long c;

    public /* synthetic */ l5(m5 m5Var, long j10, int i10) {
        this.a = i10;
        this.b = m5Var;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m5 m5Var = this.b;
                m5Var.q.d0(m5Var.b, m5Var.c, this.c, true, true, m5Var.n);
                break;
            default:
                m5 m5Var2 = this.b;
                m5Var2.q.d0(m5Var2.b, m5Var2.c, this.c, true, true, m5Var2.n);
                break;
        }
    }
}
