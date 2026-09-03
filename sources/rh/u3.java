package rh;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v3 b;

    public /* synthetic */ u3(v3 v3Var, int i10) {
        this.a = i10;
        this.b = v3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v3 v3Var = this.b;
                if (v3Var.w) {
                    v3Var.d();
                    break;
                }
                break;
            default:
                this.b.invalidateSelf();
                break;
        }
    }
}
