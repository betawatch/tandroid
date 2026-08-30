package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class v40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ c60 a;

    public v40(c60 c60Var) {
        this.a = c60Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        c60 c60Var = this.a;
        c60Var.N.getViewTreeObserver().removeOnPreDrawListener(this);
        c60Var.X1.j(null);
        AndroidUtilities.updateVisibleRows(c60Var.j2);
        viewGroup = ((org.telegram.ui.ActionBar.g3) c60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
