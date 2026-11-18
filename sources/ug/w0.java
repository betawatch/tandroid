package ug;

import android.content.Context;
import android.widget.Scroller;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class w0 extends Scroller {
    public final /* synthetic */ x0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(x0 x0Var, Context context) {
        super(context);
        this.a = x0Var;
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i7, int i10, int i11, int i12, int i13) {
        super.startScroll(i7, i10, i11, i12, (this.a.y0 ? 3 : 1) * i13);
    }
}
