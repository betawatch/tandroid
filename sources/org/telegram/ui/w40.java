package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class w40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChatObject.VideoParticipant a;
    public final /* synthetic */ e60 b;

    public w40(e60 e60Var, ChatObject.VideoParticipant videoParticipant) {
        this.b = e60Var;
        this.a = videoParticipant;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        e60 e60Var = this.b;
        e60Var.N.getViewTreeObserver().removeOnPreDrawListener(this);
        e60Var.n2 = null;
        e60Var.X1.j(this.a);
        AndroidUtilities.updateVisibleRows(e60Var.j2);
        viewGroup = ((org.telegram.ui.ActionBar.g3) e60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
