package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class u40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChatObject.VideoParticipant a;
    public final /* synthetic */ d60 b;

    public u40(d60 d60Var, ChatObject.VideoParticipant videoParticipant) {
        this.b = d60Var;
        this.a = videoParticipant;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        d60 d60Var = this.b;
        d60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        d60Var.q2 = null;
        d60Var.a2.j(this.a);
        AndroidUtilities.updateVisibleRows(d60Var.m2);
        viewGroup = ((org.telegram.ui.ActionBar.e3) d60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
