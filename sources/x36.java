// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class x36 extends cj8 {
    public final /* synthetic */ i46 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x36(i46 i46Var, Context context, ylb ylbVar) {
        super(ylbVar, context, true);
        this.S = i46Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.S.a2) {
            return;
        }
        super.invalidate();
    }
}
