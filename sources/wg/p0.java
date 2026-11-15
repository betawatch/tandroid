package wg;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;

    public /* synthetic */ p0(u0 u0Var, int i7) {
        this.a = i7;
        this.b = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.i1(true);
                break;
            case 1:
                this.b.n1(true, false);
                break;
            case 2:
                this.b.e1();
                break;
            case 3:
                this.b.n1(true, false);
                break;
            case 4:
                this.b.n1(true, false);
                break;
            case 5:
                this.b.n1(true, false);
                break;
            case 6:
                u0 u0Var = this.b;
                u0Var.a2.clear();
                u0Var.b2.clear();
                u0Var.dismiss();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
