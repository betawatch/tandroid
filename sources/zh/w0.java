package zh;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
