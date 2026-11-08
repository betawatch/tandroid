package ug;

import android.content.Context;
import android.widget.Scroller;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class t0 extends Scroller {
    public final /* synthetic */ u0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, Context context) {
        super(context);
        this.a = u0Var;
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i7, int i10, int i11, int i12, int i13) {
        super.startScroll(i7, i10, i11, i12, (this.a.x0 ? 3 : 1) * i13);
    }
}
