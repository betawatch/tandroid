package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class x40 extends Paint {
    public final /* synthetic */ i60 a;

    public x40(i60 i60Var) {
        this.a = i60Var;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        i60 i60Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) i60Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) i60Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
