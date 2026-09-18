package u2;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;

    public /* synthetic */ p0(u0 u0Var, int i10) {
        this.a = i10;
        this.b = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Z = true;
                break;
            case 1:
                this.b.w();
                break;
            default:
                u0 u0Var = this.b;
                if (!u0Var.f0) {
                    c0 c0Var = u0Var.I;
                    c0Var.getClass();
                    c0Var.v(u0Var);
                    break;
                }
                break;
        }
    }
}
