package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class r40 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ org.telegram.ui.Components.vc0 b;
    public final /* synthetic */ n40 c;
    public final /* synthetic */ o40 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r40(LaunchActivity launchActivity, org.telegram.ui.Components.vc0 vc0Var, n40 n40Var, o40 o40Var) {
        super(launchActivity);
        this.b = vc0Var;
        this.c = n40Var;
        this.d = o40Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        org.telegram.ui.Components.vc0 vc0Var = this.b;
        vc0Var.setItemCount(5);
        n40 n40Var = this.c;
        n40Var.setItemCount(5);
        o40 o40Var = this.d;
        o40Var.setItemCount(5);
        vc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        n40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        o40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        this.a = false;
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.a) {
            return;
        }
        super.requestLayout();
    }
}
