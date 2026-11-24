// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class qu1 extends r59 implements o4b {
    public final /* synthetic */ yv1 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu1(yv1 yv1Var, Context context, wv1 wv1Var) {
        super(context, wv1Var);
        this.f3 = yv1Var;
    }

    @Override // o4b
    public final void b(int[] iArr) {
        yv1 yv1Var = this.f3;
        iArr[0] = ((int) yv1Var.P9) - gm.L(4.0f);
        iArr[1] = hg9.f(3.0f, yv1Var.A0.getPaddingBottom(), yv1Var.A0.getMeasuredHeight());
    }
}
