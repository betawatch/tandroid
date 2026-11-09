package org.telegram.ui;

import android.widget.LinearLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class s20 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ org.telegram.ui.Components.ib0 b;
    public final /* synthetic */ o20 c;
    public final /* synthetic */ p20 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s20(LaunchActivity launchActivity, org.telegram.ui.Components.ib0 ib0Var, o20 o20Var, p20 p20Var) {
        super(launchActivity);
        this.b = ib0Var;
        this.c = o20Var;
        this.d = p20Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        this.a = true;
        org.telegram.ui.Components.ib0 ib0Var = this.b;
        ib0Var.setItemCount(5);
        o20 o20Var = this.c;
        o20Var.setItemCount(5);
        p20 p20Var = this.d;
        p20Var.setItemCount(5);
        ib0Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        o20Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        p20Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
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
