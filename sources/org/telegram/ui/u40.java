package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class u40 extends Paint {
    public final /* synthetic */ f60 a;

    public u40(f60 f60Var) {
        this.a = f60Var;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        f60 f60Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) f60Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) f60Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
