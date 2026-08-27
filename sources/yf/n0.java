package yf;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0 b;
    public final /* synthetic */ b6.a c;

    public /* synthetic */ n0(p0 p0Var, b6.a aVar, int i10) {
        this.a = i10;
        this.b = p0Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p(this.c, true);
                break;
            default:
                p0 p0Var = this.b;
                p0Var.f.f(new n0(p0Var, this.c, 0));
                break;
        }
    }
}
