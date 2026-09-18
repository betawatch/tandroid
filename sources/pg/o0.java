package pg;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;
    public final /* synthetic */ a5.a c;

    public /* synthetic */ o0(q0 q0Var, a5.a aVar, int i10) {
        this.a = i10;
        this.b = q0Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p(this.c, true);
                break;
            default:
                q0 q0Var = this.b;
                q0Var.f.f(new o0(q0Var, this.c, 0));
                break;
        }
    }
}
