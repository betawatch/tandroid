package wg;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
                this.b.j1(true);
                break;
            case 1:
                this.b.o1(true, false);
                break;
            case 2:
                this.b.f1();
                break;
            case 3:
                this.b.o1(true, false);
                break;
            case 4:
                this.b.o1(true, false);
                break;
            case 5:
                this.b.o1(true, false);
                break;
            case 6:
                w0 w0Var = this.b;
                w0Var.a2.clear();
                w0Var.b2.clear();
                w0Var.dismiss();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
