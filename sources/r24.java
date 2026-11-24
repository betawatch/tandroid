// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class r24 extends u0b {
    public final /* synthetic */ byte H3;
    public final /* synthetic */ s24 I3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r24(s24 s24Var, Context context, int i, ylb ylbVar, int i2) {
        super(i, ylbVar, context);
        this.I3 = s24Var;
        this.H3 = i2;
    }

    @Override // u0b
    public final boolean B1() {
        return e86.e(8200);
    }

    @Override // u0b
    public final void H1(int i) {
        q04 q04Var;
        j14 j14Var;
        super.H1(i);
        s24 s24Var = this.I3;
        e34 e34Var = s24Var.H;
        r24 r24Var = s24Var.r;
        boolean z = r24Var.getSelectedCategory() == null;
        int i2 = e34.U2;
        e34Var.L(z);
        byte b = this.H3;
        if (b == 1 && (j14Var = e34Var.J) != null) {
            j14Var.n(r24Var.getSelectedCategory() == null);
        } else if (b == 0 && (q04Var = e34Var.C0) != null) {
            q04Var.p0 = r24Var.getSelectedCategory() == null;
            q04Var.invalidate();
        }
        s24Var.g(false);
    }
}
