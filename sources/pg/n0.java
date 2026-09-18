package pg;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;

    public /* synthetic */ n0(q0 q0Var, int i10) {
        this.a = i10;
        this.b = q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q0 q0Var = this.b;
                q0Var.c = null;
                k2.u uVar = q0Var.a;
                if (uVar != null) {
                    uVar.W();
                    break;
                }
                break;
            default:
                this.b.b();
                break;
        }
    }
}
