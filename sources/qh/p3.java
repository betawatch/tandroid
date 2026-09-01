package qh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class p3 extends i51 {
    public static final /* synthetic */ int a = 0;

    static {
        i51.setup(new p3());
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        q3 q3Var = (q3) view;
        q3Var.a(j51Var.d, j51Var.z, (s6) j51Var.G);
        q3Var.b(j51Var.e, false);
        boolean z10 = j51Var.f;
        if (q3Var.f != z10) {
            q3Var.f = z10;
            q3Var.B.a(z10);
            q3Var.invalidate();
        }
        q3Var.setOnCheckboxClick(j51Var.D);
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new q3(context, g6Var);
    }
}
