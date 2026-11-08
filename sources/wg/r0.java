package wg;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;

    public /* synthetic */ r0(w0 w0Var, int i7) {
        this.a = i7;
        this.b = w0Var;
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
                w0 w0Var = this.b;
                w0Var.W1.clear();
                w0Var.X1.clear();
                w0Var.dismiss();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
