package zh;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class x7 extends pg.s0 {
    public final /* synthetic */ y7 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(y7 y7Var, Context context, float f7) {
        super(context, f7);
        this.Q = y7Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        View view = this.Q.c;
        if (view != null) {
            view.invalidate();
        }
    }
}
