// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class y99 implements z99 {
    public final /* synthetic */ bo1 a;
    public final /* synthetic */ c41 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ q63 d;
    public final /* synthetic */ ecc e;

    public y99(bo1 bo1Var, c41 c41Var, Context context, q63 q63Var, ecc eccVar) {
        this.a = bo1Var;
        this.b = c41Var;
        this.c = context;
        this.d = q63Var;
        this.e = eccVar;
    }

    @Override // z99
    public final void d() {
        gm.d3(new w99(this.a, this.b, this.c, this.d, (byte) 2), 200L);
    }

    @Override // z99
    public final void f() {
        gm.d3(new ey8(this.a, this.b, (byte) 15), 200L);
    }

    @Override // z99
    public final void i() {
        this.e.run();
    }
}
