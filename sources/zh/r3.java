package zh;

import bi.ea;
import bi.k7;
import bi.uc;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class r3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4 b;

    public /* synthetic */ r3(b4 b4Var, int i7) {
        this.a = i7;
        this.b = b4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f1(false);
                break;
            case 1:
                this.b.f1(true);
                break;
            case 2:
                b4 b4Var = this.b;
                k7 k7Var = new k7(b4Var.getContext(), b4Var.Q1, b4Var.R1, b4Var.I0, null);
                long j3 = b4Var.U1.id;
                String str = b4Var.X1;
                k7Var.f3 = true;
                ea.y(k7Var.a, false).K(j3, new ai.f1(3, k7Var, str));
                break;
            case 3:
                b4 b4Var2 = this.b;
                u.g1(b4Var2.getContext(), b4Var2.U1, b4Var2.I0);
                break;
            case 4:
                b4 b4Var3 = this.b;
                new uc(b4Var3.getContext(), b4Var3.I0).show();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
