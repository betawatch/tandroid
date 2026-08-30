package vh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class d0 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new d0());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        e0 e0Var = (e0) view;
        a aVar = (a) i51Var.G;
        c0 c0Var = (c0) i51Var.H;
        e0Var.a = aVar;
        e0Var.B = c0Var;
        e0Var.c(aVar);
        e0Var.i();
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, f6 f6Var) {
        e0 e0Var = new e0(context, i10, f6Var);
        e0Var.setBackground(new v1(j6.v0(j6.d6, f6Var)));
        return e0Var;
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean isClickable() {
        return false;
    }
}
