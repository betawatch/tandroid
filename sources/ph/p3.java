package ph;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class p3 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new p3());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        q3 q3Var = (q3) view;
        q3Var.a(i51Var.d, i51Var.z, (t6) i51Var.G);
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
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new q3(context, f6Var);
    }
}
