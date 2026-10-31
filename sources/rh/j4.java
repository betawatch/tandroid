package rh;

import org.telegram.messenger.j20;
import org.telegram.messenger.q20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j4 implements j20 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ j20 c;
    public final /* synthetic */ q20 d;

    public /* synthetic */ j4(q20 q20Var, boolean[] zArr, j20 j20Var) {
        this.d = q20Var;
        this.b = zArr;
        this.c = j20Var;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        Long l4 = (Long) obj;
        Boolean bool = (Boolean) obj2;
        switch (this.a) {
            case 0:
                q20 q20Var = this.d;
                if (q20Var != null) {
                    q20Var.a(Boolean.TRUE);
                }
                this.b[0] = true;
                j20 j20Var = this.c;
                if (j20Var != null) {
                    j20Var.a(bool.booleanValue() ? "paid" : "failed", l4);
                    break;
                }
                break;
            default:
                this.b[0] = true;
                j20 j20Var2 = this.c;
                if (j20Var2 != null) {
                    j20Var2.a(bool.booleanValue() ? "paid" : "failed", l4);
                }
                q20 q20Var2 = this.d;
                if (q20Var2 != null) {
                    q20Var2.a(Boolean.TRUE);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ j4(boolean[] zArr, j20 j20Var, q20 q20Var) {
        this.b = zArr;
        this.c = j20Var;
        this.d = q20Var;
    }
}
