package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class x8 extends FragmentContextView {
    public final /* synthetic */ int Y0 = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 Z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(i9 i9Var, Context context, i9 i9Var2, v8 v8Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i9Var2, v8Var, false, e6Var);
        this.Z0 = i9Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i7) {
        switch (this.Y0) {
            case 0:
                i9 i9Var = (i9) this.Z0;
                i9Var.J.i(i9Var.K, i7 == 0, true);
                break;
            default:
                u91 u91Var = (u91) this.Z0;
                u91Var.V0.i(u91Var.G0, i7 == 0, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(u91 u91Var, Context context, u91 u91Var2) {
        super(context, u91Var2, null, false, null);
        this.Z0 = u91Var;
    }
}
