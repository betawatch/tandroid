package ug;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h2 extends h0 {
    public final /* synthetic */ j2 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(j2 j2Var, Context context, float f10) {
        super(context, f10);
        this.u0 = j2Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        this.u0.d.invalidate();
        super.invalidate();
    }
}
