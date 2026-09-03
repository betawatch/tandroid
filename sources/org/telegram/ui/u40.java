package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class u40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChatObject.VideoParticipant a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ d60 c;

    public u40(d60 d60Var, ChatObject.VideoParticipant videoParticipant, boolean z4) {
        this.c = d60Var;
        this.a = videoParticipant;
        this.b = z4;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        d60 d60Var = this.c;
        k50 k50Var = d60Var.N;
        k50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        d60Var.n2 = null;
        w30 w30Var = d60Var.X1;
        ChatObject.VideoParticipant videoParticipant = this.a;
        w30Var.j(videoParticipant);
        if (d60Var.p0) {
            d60Var.p0 = false;
            d60Var.O0(true);
            if (this.b && videoParticipant != null) {
                k50Var.u0(0);
            }
            d60Var.p0 = true;
        } else {
            d60Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.h3) d60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
