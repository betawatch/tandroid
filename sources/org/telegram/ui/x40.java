package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class x40 extends Paint {
    public final /* synthetic */ j60 a;

    public x40(j60 j60Var) {
        this.a = j60Var;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        j60 j60Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) j60Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) j60Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
