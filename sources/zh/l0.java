package zh;

import org.telegram.messenger.c20;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h1 b;
    public final /* synthetic */ c20 c;

    public /* synthetic */ l0(h1 h1Var, c20 c20Var, int i7) {
        this.a = i7;
        this.b = h1Var;
        this.c = c20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h1 h1Var = this.b;
                c20 c20Var = this.c;
                if (c20Var != null) {
                    h1Var.getClass();
                    c20Var.a(Boolean.FALSE);
                }
                h1Var.dismiss();
                break;
            case 1:
                h1 h1Var2 = this.b;
                c20 c20Var2 = this.c;
                if (c20Var2 != null) {
                    h1Var2.getClass();
                    c20Var2.a(Boolean.FALSE);
                }
                h1Var2.dismiss();
                break;
            default:
                h1 h1Var3 = this.b;
                c20 c20Var3 = this.c;
                if (c20Var3 != null) {
                    h1Var3.getClass();
                    c20Var3.a(Boolean.FALSE);
                }
                h1Var3.dismiss();
                break;
        }
    }
}
