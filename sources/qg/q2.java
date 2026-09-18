package qg;

import android.content.Context;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class q2 extends o0 {
    public final /* synthetic */ s2 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(s2 s2Var, Context context, float f7) {
        super(context, f7);
        this.t0 = s2Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        this.t0.d.invalidate();
        super.invalidate();
    }
}
