// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qs1 extends ew1 {
    public final /* synthetic */ yv1 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs1(yv1 yv1Var, Context context, ylb ylbVar, jr1 jr1Var, km0 km0Var) {
        super(context, ylbVar, jr1Var, km0Var);
        this.N = yv1Var;
    }

    @Override // ew1, android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        this.N.ud.s(3, i == 0, getMeasuredWidth() > 0);
    }
}
