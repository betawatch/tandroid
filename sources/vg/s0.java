package vg;

import android.content.Context;
import android.widget.Scroller;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s0 extends Scroller {
    public final /* synthetic */ t0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(t0 t0Var, Context context) {
        super(context);
        this.a = t0Var;
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i3, int i10, int i11, int i12, int i13) {
        super.startScroll(i3, i10, i11, i12, (this.a.y0 ? 3 : 1) * i13);
    }
}
