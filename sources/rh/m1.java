package rh;

import org.telegram.messenger.r20;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m1 implements r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4 b;
    public final /* synthetic */ Long c;
    public final /* synthetic */ mg.i2[] d;

    public /* synthetic */ m1(e4 e4Var, Long l4, mg.i2[] i2VarArr, int i10) {
        this.a = i10;
        this.b = e4Var;
        this.c = l4;
        this.d = i2VarArr;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                gf.e eVar = (gf.e) obj;
                eVar.d();
                long longValue = this.c.longValue();
                e4 e4Var = this.b;
                e4Var.s1(longValue, new kg.d0(e4Var, eVar, this.d, 8));
                break;
            default:
                e4 e4Var2 = this.b;
                e4Var2.getClass();
                e4Var2.r1(this.c.longValue(), null, (gf.e) obj, this.d[0]);
                break;
        }
    }
}
