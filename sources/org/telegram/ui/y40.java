package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class y40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ f60 a;

    public y40(f60 f60Var) {
        this.a = f60Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        f60 f60Var = this.a;
        f60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        f60Var.a2.j(null);
        AndroidUtilities.updateVisibleRows(f60Var.m2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) f60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
