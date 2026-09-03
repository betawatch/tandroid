package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class u40 extends Paint {
    public final /* synthetic */ e60 a;

    public u40(e60 e60Var) {
        this.a = e60Var;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        e60 e60Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.g3) e60Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.g3) e60Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
