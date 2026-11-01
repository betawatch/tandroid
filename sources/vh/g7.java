package vh;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o8 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ g7(o8 o8Var, boolean z10, int i10) {
        this.a = i10;
        this.b = o8Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e(this.c);
                break;
            case 1:
                o8 o8Var = this.b;
                if (!this.c) {
                    o8Var.J0.b(false, false);
                    break;
                } else {
                    o8Var.getClass();
                    break;
                }
            default:
                o8 o8Var2 = this.b;
                o8Var2.R = null;
                o8Var2.e = false;
                o8Var2.p(this.c);
                break;
        }
    }
}
