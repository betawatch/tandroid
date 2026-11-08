package zh;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l3 b;

    public /* synthetic */ i2(l3 l3Var, int i7) {
        this.a = i7;
        this.b = l3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b3 b3Var = this.b.d;
                if (!b3Var.l.isEmpty()) {
                    b3Var.l.clear();
                    b3Var.h();
                    break;
                }
                break;
            case 1:
                b3 b3Var2 = this.b.d;
                if (!b3Var2.k.isEmpty()) {
                    b3Var2.k.clear();
                    b3Var2.h();
                    break;
                }
                break;
            case 2:
                b3 b3Var3 = this.b.d;
                if (!b3Var3.j.isEmpty()) {
                    b3Var3.j.clear();
                    b3Var3.h();
                    break;
                }
                break;
            case 3:
                this.b.d.i(a3.a);
                break;
            case 4:
                this.b.d.i(a3.b);
                break;
            default:
                this.b.d.i(a3.c);
                break;
        }
    }
}
