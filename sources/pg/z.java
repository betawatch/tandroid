package pg;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0 b;

    public /* synthetic */ z(d0 d0Var, int i10) {
        this.a = i10;
        this.b = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d0 d0Var = this.b;
                m mVar = d0Var.A;
                if (mVar != null) {
                    d0Var.a.g(mVar);
                    d0Var.A = null;
                    break;
                }
                break;
            default:
                this.b.a(null, true, null);
                break;
        }
    }
}
