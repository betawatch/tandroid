package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x30 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ org.telegram.ui.Components.bc0 b;
    public final /* synthetic */ t30 c;
    public final /* synthetic */ u30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x30(LaunchActivity launchActivity, org.telegram.ui.Components.bc0 bc0Var, t30 t30Var, u30 u30Var) {
        super(launchActivity);
        this.b = bc0Var;
        this.c = t30Var;
        this.d = u30Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        this.a = true;
        org.telegram.ui.Components.bc0 bc0Var = this.b;
        bc0Var.setItemCount(5);
        t30 t30Var = this.c;
        t30Var.setItemCount(5);
        u30 u30Var = this.d;
        u30Var.setItemCount(5);
        bc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        t30Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        u30Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        this.a = false;
        super.onMeasure(i9, i10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.a) {
            return;
        }
        super.requestLayout();
    }
}
