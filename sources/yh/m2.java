package yh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.y90;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class m2 extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new m2());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        y90 y90Var = (y90) view;
        y90Var.setGravity(m61Var.z);
        Object obj = m61Var.H;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = m61Var.G;
            r6.W(y90Var, intValue, obj2 instanceof g6 ? (g6) obj2 : null);
        } else {
            r6.r(y90Var);
            y90Var.setTextColor((int) m61Var.B);
        }
        y90Var.setTextSize(1, m61Var.A);
        y90Var.setTypeface(m61Var.q ? AndroidUtilities.bold() : null);
        int i10 = m61Var.i;
        y90Var.setPadding(i10, 0, i10, m61Var.k);
        y90Var.setText(m61Var.l);
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, g6 g6Var) {
        return new xb(context, 5, null);
    }
}
