package rh;

import org.telegram.messenger.r20;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n4 implements r20 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ e6 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ r20 d;
    public final /* synthetic */ boolean[] e;
    public final /* synthetic */ r20 f;

    public /* synthetic */ n4(e6 e6Var, int i10, r20 r20Var, boolean[] zArr, r20 r20Var2) {
        this.b = e6Var;
        this.c = i10;
        this.d = r20Var;
        this.e = zArr;
        this.f = r20Var2;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.a) {
            case 0:
                this.e[0] = true;
                if (this.c > 0) {
                    this.b.R();
                }
                r20 r20Var = this.d;
                if (r20Var != null) {
                    r20Var.a(bool.booleanValue() ? "paid" : "failed");
                }
                r20 r20Var2 = this.f;
                if (r20Var2 != null) {
                    r20Var2.a(Boolean.TRUE);
                    break;
                }
                break;
            default:
                if (this.c > 0) {
                    this.b.R();
                }
                r20 r20Var3 = this.d;
                if (r20Var3 != null) {
                    r20Var3.a(Boolean.TRUE);
                }
                this.e[0] = true;
                r20 r20Var4 = this.f;
                if (r20Var4 != null) {
                    r20Var4.a(bool.booleanValue() ? "paid" : "failed");
                    break;
                }
                break;
        }
    }

    public /* synthetic */ n4(e6 e6Var, boolean[] zArr, int i10, r20 r20Var, r20 r20Var2) {
        this.b = e6Var;
        this.e = zArr;
        this.c = i10;
        this.d = r20Var;
        this.f = r20Var2;
    }
}
