package ug;

import android.content.Context;
import android.widget.Scroller;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class v0 extends Scroller {
    public final /* synthetic */ w0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(w0 w0Var, Context context) {
        super(context);
        this.a = w0Var;
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i7, int i10, int i11, int i12, int i13) {
        super.startScroll(i7, i10, i11, i12, (this.a.y0 ? 3 : 1) * i13);
    }
}
