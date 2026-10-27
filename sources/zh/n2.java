package zh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.xb;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class n2 extends t61 {
    public static final /* synthetic */ int a = 0;

    static {
        t61.setup(new n2());
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        aa0 aa0Var = (aa0) view;
        aa0Var.setGravity(u61Var.z);
        Object obj = u61Var.H;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = u61Var.G;
            f7.V(aa0Var, intValue, obj2 instanceof u6 ? (u6) obj2 : null);
        } else {
            f7.r(aa0Var);
            aa0Var.setTextColor((int) u61Var.B);
        }
        aa0Var.setTextSize(1, u61Var.A);
        aa0Var.setTypeface(u61Var.q ? AndroidUtilities.bold() : null);
        int i10 = u61Var.i;
        aa0Var.setPadding(i10, 0, i10, u61Var.k);
        aa0Var.setText(u61Var.l);
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        return new xb(context, 5, null);
    }
}
