package zh;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ w0(y0 y0Var, boolean z9, int i7) {
        this.a = i7;
        this.b = y0Var;
        this.c = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z9 = this.c;
                y0 y0Var = this.b;
                if (!z9) {
                    y0Var.G.setVisibility(8);
                    break;
                } else {
                    y0Var.getClass();
                    break;
                }
            default:
                boolean z10 = this.c;
                y0 y0Var2 = this.b;
                if (!z10) {
                    y0Var2.w.setVisibility(8);
                    break;
                } else {
                    y0Var2.getClass();
                    break;
                }
        }
    }
}
