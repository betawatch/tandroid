package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class w40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChatObject.VideoParticipant a;
    public final /* synthetic */ f60 b;

    public w40(f60 f60Var, ChatObject.VideoParticipant videoParticipant) {
        this.b = f60Var;
        this.a = videoParticipant;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        f60 f60Var = this.b;
        f60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        f60Var.q2 = null;
        f60Var.a2.j(this.a);
        AndroidUtilities.updateVisibleRows(f60Var.m2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) f60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
