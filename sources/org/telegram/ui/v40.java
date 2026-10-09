package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class v40 extends Paint {
    public final /* synthetic */ g60 a;

    public v40(g60 g60Var) {
        this.a = g60Var;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        g60 g60Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) g60Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) g60Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
