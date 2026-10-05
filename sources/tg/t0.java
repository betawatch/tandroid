package tg;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z0 b;

    public /* synthetic */ t0(z0 z0Var, int i10) {
        this.a = i10;
        this.b = z0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.U(true);
                break;
            case 1:
                this.b.b0(true, false);
                break;
            case 2:
                this.b.P();
                break;
            case 3:
                this.b.b0(true, false);
                break;
            case 4:
                this.b.b0(true, false);
                break;
            case 5:
                this.b.b0(true, false);
                break;
            case 6:
                z0 z0Var = this.b;
                z0Var.e0.clear();
                z0Var.f0.clear();
                z0Var.dismiss();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
