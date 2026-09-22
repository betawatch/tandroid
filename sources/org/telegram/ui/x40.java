package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
