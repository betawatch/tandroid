package tg;

import android.content.Context;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class g2 extends i0 {
    public final /* synthetic */ i2 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(i2 i2Var, Context context, float f10) {
        super(context, f10);
        this.t0 = i2Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        this.t0.d.invalidate();
        super.invalidate();
    }
}
