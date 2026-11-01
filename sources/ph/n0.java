package ph;

import org.telegram.messenger.r20;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l1 b;
    public final /* synthetic */ r20 c;

    public /* synthetic */ n0(l1 l1Var, r20 r20Var, int i10) {
        this.a = i10;
        this.b = l1Var;
        this.c = r20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l1 l1Var = this.b;
                r20 r20Var = this.c;
                if (r20Var != null) {
                    l1Var.getClass();
                    r20Var.a(Boolean.FALSE);
                }
                l1Var.dismiss();
                break;
            case 1:
                l1 l1Var2 = this.b;
                r20 r20Var2 = this.c;
                if (r20Var2 != null) {
                    l1Var2.getClass();
                    r20Var2.a(Boolean.FALSE);
                }
                l1Var2.dismiss();
                break;
            default:
                l1 l1Var3 = this.b;
                r20 r20Var3 = this.c;
                if (r20Var3 != null) {
                    l1Var3.getClass();
                    r20Var3.a(Boolean.FALSE);
                }
                l1Var3.dismiss();
                break;
        }
    }
}
