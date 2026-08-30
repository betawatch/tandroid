package vh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class t0 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new t0());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        u0 u0Var = (u0) view;
        a aVar = (a) i51Var.G;
        m2 m2Var = (m2) i51Var.H;
        u0Var.a = aVar;
        u0Var.v = m2Var;
        u0Var.w = LocaleController.isRTL;
        u0Var.c(aVar);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, f6 f6Var) {
        return new u0(context, f6Var);
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean isClickable() {
        return false;
    }
}
