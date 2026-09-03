package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class y40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ e60 a;

    public y40(e60 e60Var) {
        this.a = e60Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        e60 e60Var = this.a;
        e60Var.N.getViewTreeObserver().removeOnPreDrawListener(this);
        e60Var.X1.j(null);
        AndroidUtilities.updateVisibleRows(e60Var.j2);
        viewGroup = ((org.telegram.ui.ActionBar.g3) e60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
