package vh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class e0 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new e0());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        f0 f0Var = (f0) view;
        a aVar = (a) i51Var.G;
        d0 d0Var = (d0) i51Var.H;
        f0Var.a = aVar;
        f0Var.B = d0Var;
        f0Var.c(aVar);
        f0Var.i();
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, f6 f6Var) {
        f0 f0Var = new f0(context, i10, f6Var);
        f0Var.setBackground(new v1(j6.v0(j6.d6, f6Var)));
        return f0Var;
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean isClickable() {
        return false;
    }
}
