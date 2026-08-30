package ph;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class p3 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new p3());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        q3 q3Var = (q3) view;
        q3Var.a(i51Var.d, i51Var.z, (u6) i51Var.G);
        q3Var.b(i51Var.e, false);
        boolean z10 = i51Var.f;
        if (q3Var.f != z10) {
            q3Var.f = z10;
            q3Var.B.a(z10);
            q3Var.invalidate();
        }
        q3Var.setOnCheckboxClick(i51Var.D);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new q3(context, f6Var);
    }
}
