// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class yp1 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ i49 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ w49 n;
    public final /* synthetic */ r47 r;
    public final /* synthetic */ zu1 s;

    public yp1(zu1 zu1Var, boolean z, boolean z2, int i, boolean z3, i49 i49Var, float f, float f2, w49 w49Var, r47 r47Var) {
        this.s = zu1Var;
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = z3;
        this.e = i49Var;
        this.f = f;
        this.h = f2;
        this.n = w49Var;
        this.r = r47Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a) {
            return;
        }
        zu1 zu1Var = this.s;
        if (zu1Var.Xc != null) {
            zu1Var.Xc = null;
            if (this.b) {
                zu1Var.z6(new xp1(this, this.c, this.d, this.e, this.f, this.h, this.n, (byte) 0));
            } else {
                zu1Var.z6(new jj1(this, this.r, (byte) 20));
            }
            zu1Var.M5(true);
        }
    }
}
