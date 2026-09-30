package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class w40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ d60 a;

    public w40(d60 d60Var) {
        this.a = d60Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        d60 d60Var = this.a;
        d60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        d60Var.a2.j(null);
        AndroidUtilities.updateVisibleRows(d60Var.m2);
        viewGroup = ((org.telegram.ui.ActionBar.e3) d60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
