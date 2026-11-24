// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class t12 extends u26 {
    public final /* synthetic */ ar0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t12(ar0 ar0Var, Context context) {
        super(context);
        this.r = ar0Var;
    }

    @Override // u26
    public final int k(int i, View view) {
        return de9.f(7.0f, ((v12) this.r.R).n.getPaddingTop(), super.k(i, view));
    }

    @Override // u26
    public final int m(int i) {
        return super.m(i) << 1;
    }
}
