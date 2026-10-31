package rh;

import org.telegram.messenger.q20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n4 implements q20 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ e6 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ q20 d;
    public final /* synthetic */ boolean[] e;
    public final /* synthetic */ q20 f;

    public /* synthetic */ n4(e6 e6Var, int i10, q20 q20Var, boolean[] zArr, q20 q20Var2) {
        this.b = e6Var;
        this.c = i10;
        this.d = q20Var;
        this.e = zArr;
        this.f = q20Var2;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.a) {
            case 0:
                this.e[0] = true;
                if (this.c > 0) {
                    this.b.R();
                }
                q20 q20Var = this.d;
                if (q20Var != null) {
                    q20Var.a(bool.booleanValue() ? "paid" : "failed");
                }
                q20 q20Var2 = this.f;
                if (q20Var2 != null) {
                    q20Var2.a(Boolean.TRUE);
                    break;
                }
                break;
            default:
                if (this.c > 0) {
                    this.b.R();
                }
                q20 q20Var3 = this.d;
                if (q20Var3 != null) {
                    q20Var3.a(Boolean.TRUE);
                }
                this.e[0] = true;
                q20 q20Var4 = this.f;
                if (q20Var4 != null) {
                    q20Var4.a(bool.booleanValue() ? "paid" : "failed");
                    break;
                }
                break;
        }
    }

    public /* synthetic */ n4(e6 e6Var, boolean[] zArr, int i10, q20 q20Var, q20 q20Var2) {
        this.b = e6Var;
        this.e = zArr;
        this.c = i10;
        this.d = q20Var;
        this.f = q20Var2;
    }
}
