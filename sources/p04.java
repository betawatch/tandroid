// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class p04 extends s24 {
    public final /* synthetic */ e34 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p04(e34 e34Var, Context context) {
        super(e34Var, context, 0);
        this.I = e34Var;
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        if (f != getTranslationY()) {
            super.setTranslationY(f);
            this.I.y0.invalidate();
        }
    }
}
