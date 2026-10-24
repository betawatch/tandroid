package yh;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class r1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ r1(l2 l2Var, int i10, int i11) {
        this.a = i11;
        this.b = l2Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.scrollBy(0, this.c);
                break;
            default:
                g2 g2Var = this.b.f;
                if (g2Var != null) {
                    g2Var.setSpanCount(this.c);
                    break;
                }
                break;
        }
    }
}
