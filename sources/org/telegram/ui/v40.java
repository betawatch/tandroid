package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class v40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ d60 a;

    public v40(d60 d60Var) {
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
