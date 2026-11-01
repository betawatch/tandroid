package vh;

import org.telegram.messenger.r20;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e8 b;

    public /* synthetic */ m(e8 e8Var, int i10) {
        this.a = i10;
        this.b = e8Var;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        Integer num = (Integer) obj;
        switch (this.a) {
            case 0:
                int intValue = num.intValue();
                e8 e8Var = this.b;
                e8Var.setPeriod(intValue);
                r20 r20Var = e8Var.A1;
                if (r20Var != null) {
                    r20Var.a(num);
                    break;
                }
                break;
            default:
                r20 r20Var2 = this.b.B1;
                if (r20Var2 != null) {
                    r20Var2.a(num);
                    break;
                }
                break;
        }
    }
}
