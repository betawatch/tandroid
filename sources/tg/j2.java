package tg;

import android.content.Context;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
