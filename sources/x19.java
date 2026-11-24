// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class x19 extends tk4 {
    public final /* synthetic */ c29 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x19(c29 c29Var, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.V = c29Var;
    }

    @Override // tk4
    public final int getAdditionalHeight() {
        j37 j37Var;
        c29 c29Var = this.V;
        if (c29Var.I.isEmpty() || (j37Var = c29Var.K) == null) {
            return 0;
        }
        return gm.L(8.0f) + j37Var.getMeasuredHeight();
    }
}
