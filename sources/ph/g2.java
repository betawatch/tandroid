package ph;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.z6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g2 extends z41 {
    public static final /* synthetic */ int b = 0;

    static {
        z41.h(new g2());
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        p80 p80Var = (p80) view;
        p80Var.setGravity(a51Var.z);
        Object obj = a51Var.H;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = a51Var.G;
            a7.V(p80Var, intValue, obj2 instanceof p6 ? (p6) obj2 : null);
        } else {
            z6 z6Var = a7.a;
            p80Var.setTag(R.id.theme_bind, null);
            p80Var.setTextColor((int) a51Var.B);
        }
        p80Var.setTextSize(1, a51Var.A);
        p80Var.setTypeface(a51Var.q ? org.telegram.messenger.i0.o() : null);
        int i10 = a51Var.i;
        p80Var.setPadding(i10, 0, i10, a51Var.k);
        p80Var.setText(a51Var.l);
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        return new kg.t1(7, context, null);
    }
}
