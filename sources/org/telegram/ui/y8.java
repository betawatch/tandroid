package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class y8 extends FragmentContextView {
    public final /* synthetic */ int Y0 = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 Z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(j9 j9Var, Context context, j9 j9Var2, w8 w8Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, j9Var2, w8Var, false, h6Var);
        this.Z0 = j9Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i7) {
        switch (this.Y0) {
            case 0:
                j9 j9Var = (j9) this.Z0;
                j9Var.I.j(j9Var.J, i7 == 0, true);
                break;
            default:
                y91 y91Var = (y91) this.Z0;
                y91Var.V0.j(y91Var.G0, i7 == 0, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(y91 y91Var, Context context, y91 y91Var2) {
        super(context, y91Var2, null, false, null);
        this.Z0 = y91Var;
    }
}
