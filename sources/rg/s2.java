package rg;

import android.content.Context;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
