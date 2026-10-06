package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class x40 extends Paint {
    public final /* synthetic */ h60 a;

    public x40(h60 h60Var) {
        this.a = h60Var;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        h60 h60Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) h60Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) h60Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
