package zh;

import bi.ea;
import bi.k7;
import bi.uc;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                k7 k7Var = new k7(b4Var.getContext(), b4Var.T1, b4Var.U1, b4Var.I0, null);
                long j3 = b4Var.X1.id;
                String str = b4Var.a2;
                k7Var.i3 = true;
                ea.y(k7Var.a, false).K(j3, new ai.f1(3, k7Var, str));
                break;
            case 3:
                b4 b4Var2 = this.b;
                u.g1(b4Var2.getContext(), b4Var2.X1, b4Var2.I0);
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
