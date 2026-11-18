package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class x8 extends FragmentContextView {
    public final /* synthetic */ int Y0 = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.h2 Z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(i9 i9Var, Context context, i9 i9Var2, v8 v8Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i9Var2, v8Var, false, i6Var);
        this.Z0 = i9Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i7) {
        switch (this.Y0) {
            case 0:
                i9 i9Var = (i9) this.Z0;
                i9Var.I.j(i9Var.J, i7 == 0, true);
                break;
            default:
                y91 y91Var = (y91) this.Z0;
                y91Var.V0.j(y91Var.G0, i7 == 0, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(y91 y91Var, Context context, y91 y91Var2) {
        super(context, y91Var2, null, false, null);
        this.Z0 = y91Var;
    }
}
