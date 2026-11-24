// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class s81 extends eda {
    public final /* synthetic */ n81 m0;
    public final /* synthetic */ t81 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s81(t81 t81Var, Context context, n81 n81Var) {
        super(0, null, context);
        this.n0 = t81Var;
        this.m0 = n81Var;
    }

    @Override // eda
    public final void a() {
        w81 w81Var = this.n0.n;
        n81 n81Var = this.m0;
        w81Var.b((b81) n81Var.getTag(), n81Var);
    }
}
