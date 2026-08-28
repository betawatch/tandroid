package zf;

import android.content.Context;
import android.widget.Scroller;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class t0 extends Scroller {
    public final /* synthetic */ u0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, Context context) {
        super(context);
        this.a = u0Var;
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i9, int i10, int i11, int i12, int i13) {
        super.startScroll(i9, i10, i11, i12, (this.a.t0 ? 3 : 1) * i13);
    }
}
