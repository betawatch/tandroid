package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w8 extends FragmentContextView {
    public final /* synthetic */ int Y0 = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 Z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(h9 h9Var, Context context, h9 h9Var2, ai.h5 h5Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, h9Var2, h5Var, false, e6Var);
        this.Z0 = h9Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i3) {
        switch (this.Y0) {
            case 0:
                h9 h9Var = (h9) this.Z0;
                h9Var.J.i(h9Var.K, i3 == 0, true);
                break;
            default:
                m91 m91Var = (m91) this.Z0;
                m91Var.V0.i(m91Var.G0, i3 == 0, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(m91 m91Var, Context context, m91 m91Var2) {
        super(context, m91Var2, null, false, null);
        this.Z0 = m91Var;
    }
}
