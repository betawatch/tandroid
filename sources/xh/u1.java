package xh;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class u1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ u1(n2 n2Var, int i10, int i11) {
        this.a = i11;
        this.b = n2Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.scrollBy(0, this.c);
                break;
            default:
                i2 i2Var = this.b.f;
                if (i2Var != null) {
                    i2Var.setSpanCount(this.c);
                    break;
                }
                break;
        }
    }
}
