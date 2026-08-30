package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class s40 extends Paint {
    public final /* synthetic */ c60 a;

    public s40(c60 c60Var) {
        this.a = c60Var;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        c60 c60Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.g3) c60Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.g3) c60Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
