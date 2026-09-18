package yh;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u5 b;
    public final /* synthetic */ long c;

    public /* synthetic */ t5(u5 u5Var, long j3, int i10) {
        this.a = i10;
        this.b = u5Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u5 u5Var = this.b;
                u5Var.q.d0(u5Var.b, u5Var.c, this.c, true, true, u5Var.n);
                break;
            default:
                u5 u5Var2 = this.b;
                u5Var2.q.d0(u5Var2.b, u5Var2.c, this.c, true, true, u5Var2.n);
                break;
        }
    }
}
