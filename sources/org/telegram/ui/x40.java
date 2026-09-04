package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
