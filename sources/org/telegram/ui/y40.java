package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class y40 extends Paint {
    public final /* synthetic */ j60 a;

    public y40(j60 j60Var) {
        this.a = j60Var;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        j60 j60Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.h3) j60Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.h3) j60Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
