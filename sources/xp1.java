// default package

import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class xp1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yp1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ i49 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ w49 n;

    public /* synthetic */ xp1(yp1 yp1Var, int i, boolean z, i49 i49Var, float f, float f2, w49 w49Var, byte b) {
        this.a = b;
        this.b = yp1Var;
        this.c = i;
        this.d = z;
        this.e = i49Var;
        this.f = f;
        this.h = f2;
        this.n = w49Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        switch (this.a) {
            case 0:
                hl.d3(new xp1(this.b, this.c, this.d, this.e, this.f, this.h, this.n, (byte) 1), 50L);
                break;
            default:
                zu1 zu1Var = this.b.s;
                jf0 L6 = zu1Var.L6(this.c, true);
                if (this.d) {
                    i = ((e) zu1Var).currentAccount;
                    s49.d(zu1Var, this.e, L6, null, this.f, this.h, this.n, i, 1);
                    s49.f();
                    break;
                }
                break;
        }
    }
}
