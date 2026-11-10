package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class x8 extends FragmentContextView {
    public final /* synthetic */ int X0 = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(i9 i9Var, Context context, i9 i9Var2, v8 v8Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, i9Var2, v8Var, false, h6Var);
        this.Y0 = i9Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i7) {
        switch (this.X0) {
            case 0:
                i9 i9Var = (i9) this.Y0;
                i9Var.I.i(i9Var.J, i7 == 0, true);
                break;
            default:
                z91 z91Var = (z91) this.Y0;
                z91Var.U0.i(z91Var.F0, i7 == 0, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(z91 z91Var, Context context, z91 z91Var2) {
        super(context, z91Var2, null, false, null);
        this.Y0 = z91Var;
    }
}
