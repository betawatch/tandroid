package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class u40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChatObject.VideoParticipant a;
    public final /* synthetic */ c60 b;

    public u40(c60 c60Var, ChatObject.VideoParticipant videoParticipant) {
        this.b = c60Var;
        this.a = videoParticipant;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        c60 c60Var = this.b;
        c60Var.N.getViewTreeObserver().removeOnPreDrawListener(this);
        c60Var.n2 = null;
        c60Var.X1.j(this.a);
        AndroidUtilities.updateVisibleRows(c60Var.j2);
        viewGroup = ((org.telegram.ui.ActionBar.g3) c60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
