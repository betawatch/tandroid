package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class s40 extends Paint {
    public final /* synthetic */ d60 a;

    public s40(d60 d60Var) {
        this.a = d60Var;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        d60 d60Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.e3) d60Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.e3) d60Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
