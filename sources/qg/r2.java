package qg;

import android.content.Context;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class r2 extends p0 {
    public final /* synthetic */ t2 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(t2 t2Var, Context context, float f7) {
        super(context, f7);
        this.t0 = t2Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        this.t0.d.invalidate();
        super.invalidate();
    }
}
