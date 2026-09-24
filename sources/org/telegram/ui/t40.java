package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class t40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChatObject.VideoParticipant a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ d60 c;

    public t40(d60 d60Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.c = d60Var;
        this.a = videoParticipant;
        this.b = z10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        d60 d60Var = this.c;
        j50 j50Var = d60Var.Q;
        j50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        d60Var.q2 = null;
        v30 v30Var = d60Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.a;
        v30Var.j(videoParticipant);
        if (d60Var.s0) {
            d60Var.s0 = false;
            d60Var.O0(true);
            if (this.b && videoParticipant != null) {
                j50Var.u0(0);
            }
            d60Var.s0 = true;
        } else {
            d60Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.e3) d60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
