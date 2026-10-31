package vh;

import org.telegram.messenger.q20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e8 b;

    public /* synthetic */ m(e8 e8Var, int i10) {
        this.a = i10;
        this.b = e8Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        Integer num = (Integer) obj;
        switch (this.a) {
            case 0:
                int intValue = num.intValue();
                e8 e8Var = this.b;
                e8Var.setPeriod(intValue);
                q20 q20Var = e8Var.A1;
                if (q20Var != null) {
                    q20Var.a(num);
                    break;
                }
                break;
            default:
                q20 q20Var2 = this.b.B1;
                if (q20Var2 != null) {
                    q20Var2.a(num);
                    break;
                }
                break;
        }
    }
}
