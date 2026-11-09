package zh;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class k1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ k1(z1 z1Var, int i7, int i10) {
        this.a = i10;
        this.b = z1Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.scrollBy(0, this.c);
                break;
            default:
                fi.w3 w3Var = this.b.f;
                if (w3Var != null) {
                    w3Var.setSpanCount(this.c);
                    break;
                }
                break;
        }
    }
}
