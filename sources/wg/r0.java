package wg;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
