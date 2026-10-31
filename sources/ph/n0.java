package ph;

import org.telegram.messenger.q20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l1 b;
    public final /* synthetic */ q20 c;

    public /* synthetic */ n0(l1 l1Var, q20 q20Var, int i10) {
        this.a = i10;
        this.b = l1Var;
        this.c = q20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l1 l1Var = this.b;
                q20 q20Var = this.c;
                if (q20Var != null) {
                    l1Var.getClass();
                    q20Var.a(Boolean.FALSE);
                }
                l1Var.dismiss();
                break;
            case 1:
                l1 l1Var2 = this.b;
                q20 q20Var2 = this.c;
                if (q20Var2 != null) {
                    l1Var2.getClass();
                    q20Var2.a(Boolean.FALSE);
                }
                l1Var2.dismiss();
                break;
            default:
                l1 l1Var3 = this.b;
                q20 q20Var3 = this.c;
                if (q20Var3 != null) {
                    l1Var3.getClass();
                    q20Var3.a(Boolean.FALSE);
                }
                l1Var3.dismiss();
                break;
        }
    }
}
