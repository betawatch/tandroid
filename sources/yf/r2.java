package yf;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r2 extends n0 {
    public final /* synthetic */ t2 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(t2 t2Var, Context context, float f10) {
        super(context, f10);
        this.p0 = t2Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        this.p0.d.invalidate();
        super.invalidate();
    }
}
