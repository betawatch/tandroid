package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class t40 extends Paint {
    public final /* synthetic */ d60 a;

    public t40(d60 d60Var) {
        this.a = d60Var;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        d60 d60Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.h3) d60Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.h3) d60Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
