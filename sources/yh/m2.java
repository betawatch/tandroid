package yh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xb;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class m2 extends f61 {
    public static final /* synthetic */ int a = 0;

    static {
        f61.setup(new m2());
    }

    @Override // org.telegram.ui.Components.f61
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        x90 x90Var = (x90) view;
        x90Var.setGravity(g61Var.z);
        x90Var.setTextColor((int) g61Var.B);
        x90Var.setTextSize(1, g61Var.A);
        x90Var.setTypeface(g61Var.q ? AndroidUtilities.bold() : null);
        int i10 = g61Var.i;
        x90Var.setPadding(i10, 0, i10, g61Var.k);
        x90Var.setText(g61Var.l);
    }

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        return new xb(context, 5, null);
    }
}
