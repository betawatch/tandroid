package wh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wb;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class n2 extends u51 {
    public static final /* synthetic */ int a = 0;

    static {
        u51.setup(new n2());
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        m90 m90Var = (m90) view;
        m90Var.setGravity(v51Var.z);
        m90Var.setTextColor((int) v51Var.B);
        m90Var.setTextSize(1, v51Var.A);
        m90Var.setTypeface(v51Var.q ? AndroidUtilities.bold() : null);
        int i10 = v51Var.i;
        m90Var.setPadding(i10, 0, i10, v51Var.k);
        m90Var.setText(v51Var.l);
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        return new wb(context, 5, null);
    }
}
