// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xq1 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ v29 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ k39 n;
    public final /* synthetic */ k47 r;
    public final /* synthetic */ yv1 s;

    public xq1(yv1 yv1Var, boolean z, boolean z2, int i, boolean z3, v29 v29Var, float f, float f2, k39 k39Var, k47 k47Var) {
        this.s = yv1Var;
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = z3;
        this.e = v29Var;
        this.f = f;
        this.h = f2;
        this.n = k39Var;
        this.r = k47Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a) {
            return;
        }
        yv1 yv1Var = this.s;
        if (yv1Var.Uc != null) {
            yv1Var.Uc = null;
            if (this.b) {
                yv1Var.z6(new wq1(this, this.c, this.d, this.e, this.f, this.h, this.n, (byte) 0));
            } else {
                yv1Var.z6(new uj1(this, this.r, (byte) 21));
            }
            yv1Var.N5(true);
        }
    }
}
