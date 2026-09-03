package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        d60Var.N.getViewTreeObserver().removeOnPreDrawListener(this);
        d60Var.X1.j(null);
        AndroidUtilities.updateVisibleRows(d60Var.j2);
        viewGroup = ((org.telegram.ui.ActionBar.h3) d60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
