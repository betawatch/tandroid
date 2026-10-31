package vh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w2 extends z41 {
    public static final /* synthetic */ int b = 0;

    static {
        z41.h(new w2());
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        x2 x2Var = (x2) view;
        x2Var.a(a51Var.d, a51Var.z, (n5) a51Var.G);
        x2Var.b(a51Var.e, false);
        boolean z11 = a51Var.f;
        if (x2Var.h != z11) {
            x2Var.h = z11;
            x2Var.F.a(z11);
            x2Var.invalidate();
        }
        x2Var.setOnCheckboxClick(a51Var.D);
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new x2(context, p6Var);
    }
}
