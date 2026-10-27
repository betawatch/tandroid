package sg;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class s2 extends o0 {
    public final /* synthetic */ u2 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(u2 u2Var, Context context, float f7) {
        super(context, f7);
        this.t0 = u2Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        this.t0.d.invalidate();
        super.invalidate();
    }
}
