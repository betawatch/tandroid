package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class z40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChatObject.VideoParticipant a;
    public final /* synthetic */ i60 b;

    public z40(i60 i60Var, ChatObject.VideoParticipant videoParticipant) {
        this.b = i60Var;
        this.a = videoParticipant;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        i60 i60Var = this.b;
        i60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        i60Var.q2 = null;
        i60Var.a2.j(this.a);
        AndroidUtilities.updateVisibleRows(i60Var.m2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) i60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
