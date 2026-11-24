// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class x74 extends l7c {
    public final /* synthetic */ byte Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x74(r59 r59Var, Context context, int i, int i2, boolean z, jac jacVar, ylb ylbVar, byte b) {
        super(r59Var, context, i, i2, z, jacVar, ylbVar);
        this.Q = b;
    }

    @Override // l7c, q59
    public final boolean D(u69 u69Var) {
        switch (this.Q) {
            case 0:
                return false;
            default:
                return super.D(u69Var);
        }
    }

    @Override // l7c
    public final int I(int i) {
        switch (this.Q) {
            case 1:
                if (i == cmb.h5) {
                    return -15921907;
                }
                return cmb.v0(i, this.x);
            default:
                return super.I(i);
        }
    }
}
