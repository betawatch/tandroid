package zh;

import bi.ea;
import bi.k7;
import bi.uc;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a4 b;

    public /* synthetic */ q3(a4 a4Var, int i7) {
        this.a = i7;
        this.b = a4Var;
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
                a4 a4Var = this.b;
                k7 k7Var = new k7(a4Var.getContext(), a4Var.Q1, a4Var.R1, a4Var.I0, null);
                long j3 = a4Var.U1.id;
                String str = a4Var.X1;
                k7Var.f3 = true;
                ea.y(k7Var.a, false).K(j3, new ai.f1(3, k7Var, str));
                break;
            case 3:
                a4 a4Var2 = this.b;
                u.g1(a4Var2.getContext(), a4Var2.U1, a4Var2.I0);
                break;
            case 4:
                a4 a4Var3 = this.b;
                new uc(a4Var3.getContext(), a4Var3.I0).show();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
