package tg;

import android.content.Context;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class j2 extends j0 {
    public final /* synthetic */ l2 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(l2 l2Var, Context context, float f10) {
        super(context, f10);
        this.u0 = l2Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        this.u0.d.invalidate();
        super.invalidate();
    }
}
