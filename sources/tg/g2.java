package tg;

import android.content.Context;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
