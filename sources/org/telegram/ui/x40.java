package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class x40 extends Paint {
    public final /* synthetic */ i60 a;

    public x40(i60 i60Var) {
        this.a = i60Var;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        i60 i60Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) i60Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) i60Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
