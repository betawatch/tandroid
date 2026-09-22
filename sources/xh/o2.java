package xh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class o2 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new o2());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        c90 c90Var = (c90) view;
        c90Var.setGravity(i51Var.z);
        c90Var.setTextColor((int) i51Var.B);
        c90Var.setTextSize(1, i51Var.A);
        c90Var.setTypeface(i51Var.q ? AndroidUtilities.bold() : null);
        int i10 = i51Var.i;
        c90Var.setPadding(i10, 0, i10, i51Var.k);
        c90Var.setText(i51Var.l);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, e6 e6Var) {
        return new vb(context, 5, null);
    }
}
