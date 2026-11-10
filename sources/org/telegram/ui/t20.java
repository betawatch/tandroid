package org.telegram.ui;

import android.widget.LinearLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class t20 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ org.telegram.ui.Components.hb0 b;
    public final /* synthetic */ p20 c;
    public final /* synthetic */ q20 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t20(LaunchActivity launchActivity, org.telegram.ui.Components.hb0 hb0Var, p20 p20Var, q20 q20Var) {
        super(launchActivity);
        this.b = hb0Var;
        this.c = p20Var;
        this.d = q20Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        this.a = true;
        org.telegram.ui.Components.hb0 hb0Var = this.b;
        hb0Var.setItemCount(5);
        p20 p20Var = this.c;
        p20Var.setItemCount(5);
        q20 q20Var = this.d;
        q20Var.setItemCount(5);
        hb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        p20Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        q20Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        this.a = false;
        super.onMeasure(i7, i10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.a) {
            return;
        }
        super.requestLayout();
    }
}
