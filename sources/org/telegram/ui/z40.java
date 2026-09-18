package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class z40 extends Paint {
    public final /* synthetic */ k60 a;

    public z40(k60 k60Var) {
        this.a = k60Var;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        k60 k60Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.g3) k60Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.g3) k60Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
