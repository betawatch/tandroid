package rg;

import android.content.Context;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class t2 extends q0 {
    public final /* synthetic */ v2 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(v2 v2Var, Context context, float f7) {
        super(context, f7);
        this.t0 = v2Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        this.t0.d.invalidate();
        super.invalidate();
    }
}
