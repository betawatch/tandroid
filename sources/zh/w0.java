package zh;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
