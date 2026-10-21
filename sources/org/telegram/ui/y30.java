package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class y30 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ org.telegram.ui.Components.od0 b;
    public final /* synthetic */ u30 c;
    public final /* synthetic */ v30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y30(LaunchActivity launchActivity, org.telegram.ui.Components.od0 od0Var, u30 u30Var, v30 v30Var) {
        super(launchActivity);
        this.b = od0Var;
        this.c = u30Var;
        this.d = v30Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        org.telegram.ui.Components.od0 od0Var = this.b;
        od0Var.setItemCount(5);
        u30 u30Var = this.c;
        u30Var.setItemCount(5);
        v30 v30Var = this.d;
        v30Var.setItemCount(5);
        od0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        u30Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        v30Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
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
