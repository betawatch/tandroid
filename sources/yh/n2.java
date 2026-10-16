package yh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.zb;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class n2 extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new n2());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        da0 da0Var = (da0) view;
        da0Var.setGravity(m61Var.z);
        da0Var.setTextColor((int) m61Var.B);
        da0Var.setTextSize(1, m61Var.A);
        da0Var.setTypeface(m61Var.q ? AndroidUtilities.bold() : null);
        int i10 = m61Var.i;
        da0Var.setPadding(i10, 0, i10, m61Var.k);
        da0Var.setText(m61Var.l);
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        return new zb(context, 5, null);
    }
}
