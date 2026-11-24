// default package

import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class wq1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xq1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ v29 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ k39 n;

    public /* synthetic */ wq1(xq1 xq1Var, int i, boolean z, v29 v29Var, float f, float f2, k39 k39Var, byte b) {
        this.a = b;
        this.b = xq1Var;
        this.c = i;
        this.d = z;
        this.e = v29Var;
        this.f = f;
        this.h = f2;
        this.n = k39Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        switch (this.a) {
            case 0:
                gm.d3(new wq1(this.b, this.c, this.d, this.e, this.f, this.h, this.n, (byte) 1), 50L);
                break;
            default:
                yv1 yv1Var = this.b.s;
                hg0 L6 = yv1Var.L6(this.c, true);
                if (this.d) {
                    i = ((d) yv1Var).currentAccount;
                    g39.d(yv1Var, this.e, L6, null, this.f, this.h, this.n, i, 1);
                    g39.f();
                    break;
                }
                break;
        }
    }
}
