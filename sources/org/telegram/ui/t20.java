package org.telegram.ui;

import android.widget.LinearLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class t20 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ org.telegram.ui.Components.sb0 b;
    public final /* synthetic */ p20 c;
    public final /* synthetic */ q20 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t20(LaunchActivity launchActivity, org.telegram.ui.Components.sb0 sb0Var, p20 p20Var, q20 q20Var) {
        super(launchActivity);
        this.b = sb0Var;
        this.c = p20Var;
        this.d = q20Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        this.a = true;
        org.telegram.ui.Components.sb0 sb0Var = this.b;
        sb0Var.setItemCount(5);
        p20 p20Var = this.c;
        p20Var.setItemCount(5);
        q20 q20Var = this.d;
        q20Var.setItemCount(5);
        sb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
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
