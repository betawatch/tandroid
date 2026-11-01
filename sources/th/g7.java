package th;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class g7 extends r {
    public final /* synthetic */ o7 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(Context context, o7 o7Var) {
        super(context);
        this.a = o7Var;
    }

    @Override // th.r, android.view.View
    public final void invalidate() {
        super.invalidate();
        k2.t0 t0Var = this.a.G0;
        if (t0Var != null) {
            t0Var.b();
        }
    }
}
