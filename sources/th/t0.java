package th;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class t0 extends v41 {
    public static final /* synthetic */ int a = 0;

    static {
        v41.setup(new t0());
    }

    @Override // org.telegram.ui.Components.v41
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        u0 u0Var = (u0) view;
        a aVar = (a) w41Var.G;
        l2 l2Var = (l2) w41Var.H;
        u0Var.a = aVar;
        u0Var.v = l2Var;
        u0Var.w = LocaleController.isRTL;
        u0Var.c(aVar);
    }

    @Override // org.telegram.ui.Components.v41
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, c6 c6Var) {
        return new u0(context, c6Var);
    }

    @Override // org.telegram.ui.Components.v41
    public final boolean isClickable() {
        return false;
    }
}
