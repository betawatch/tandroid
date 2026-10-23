package yh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xb;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class m2 extends g61 {
    public static final /* synthetic */ int a = 0;

    static {
        g61.setup(new m2());
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        x90 x90Var = (x90) view;
        x90Var.setGravity(h61Var.z);
        x90Var.setTextColor((int) h61Var.B);
        x90Var.setTextSize(1, h61Var.A);
        x90Var.setTypeface(h61Var.q ? AndroidUtilities.bold() : null);
        int i10 = h61Var.i;
        x90Var.setPadding(i10, 0, i10, h61Var.k);
        x90Var.setText(h61Var.l);
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, d6 d6Var) {
        return new xb(context, 5, null);
    }
}
