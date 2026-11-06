package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class x8 extends FragmentContextView {
    public final /* synthetic */ int X0 = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(i9 i9Var, Context context, i9 i9Var2, v8 v8Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i9Var2, v8Var, false, f6Var);
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
                v91 v91Var = (v91) this.Y0;
                v91Var.U0.i(v91Var.F0, i7 == 0, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(v91 v91Var, Context context, v91 v91Var2) {
        super(context, v91Var2, null, false, null);
        this.Y0 = v91Var;
    }
}
