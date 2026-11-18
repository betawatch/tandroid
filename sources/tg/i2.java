package tg;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class i2 extends i0 {
    public final /* synthetic */ k2 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(k2 k2Var, Context context, float f10) {
        super(context, f10);
        this.u0 = k2Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        this.u0.d.invalidate();
        super.invalidate();
    }
}
