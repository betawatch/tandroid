package ph;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.z6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class g2 extends a51 {
    public static final /* synthetic */ int b = 0;

    static {
        a51.h(new g2());
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        p80 p80Var = (p80) view;
        p80Var.setGravity(b51Var.z);
        Object obj = b51Var.H;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = b51Var.G;
            a7.V(p80Var, intValue, obj2 instanceof p6 ? (p6) obj2 : null);
        } else {
            z6 z6Var = a7.a;
            p80Var.setTag(R.id.theme_bind, null);
            p80Var.setTextColor((int) b51Var.B);
        }
        p80Var.setTextSize(1, b51Var.A);
        p80Var.setTypeface(b51Var.q ? org.telegram.messenger.i0.o() : null);
        int i10 = b51Var.i;
        p80Var.setPadding(i10, 0, i10, b51Var.k);
        p80Var.setText(b51Var.l);
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, uk0 uk0Var, int i10, p6 p6Var) {
        return new kg.t1(7, context, null);
    }
}
