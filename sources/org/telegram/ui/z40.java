package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class z40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ g60 a;

    public z40(g60 g60Var) {
        this.a = g60Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        g60 g60Var = this.a;
        g60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        g60Var.a2.j(null);
        AndroidUtilities.updateVisibleRows(g60Var.m2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) g60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
