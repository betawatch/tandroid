package rh;

import org.telegram.messenger.k20;
import org.telegram.messenger.r20;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j4 implements k20 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ k20 c;
    public final /* synthetic */ r20 d;

    public /* synthetic */ j4(r20 r20Var, boolean[] zArr, k20 k20Var) {
        this.d = r20Var;
        this.b = zArr;
        this.c = k20Var;
    }

    @Override // org.telegram.messenger.k20
    public final void a(Object obj, Object obj2) {
        Long l4 = (Long) obj;
        Boolean bool = (Boolean) obj2;
        switch (this.a) {
            case 0:
                r20 r20Var = this.d;
                if (r20Var != null) {
                    r20Var.a(Boolean.TRUE);
                }
                this.b[0] = true;
                k20 k20Var = this.c;
                if (k20Var != null) {
                    k20Var.a(bool.booleanValue() ? "paid" : "failed", l4);
                    break;
                }
                break;
            default:
                this.b[0] = true;
                k20 k20Var2 = this.c;
                if (k20Var2 != null) {
                    k20Var2.a(bool.booleanValue() ? "paid" : "failed", l4);
                }
                r20 r20Var2 = this.d;
                if (r20Var2 != null) {
                    r20Var2.a(Boolean.TRUE);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ j4(boolean[] zArr, k20 k20Var, r20 r20Var) {
        this.b = zArr;
        this.c = k20Var;
        this.d = r20Var;
    }
}
