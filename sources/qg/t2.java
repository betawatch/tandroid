package qg;

import android.content.Context;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class t2 extends r0 {
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
