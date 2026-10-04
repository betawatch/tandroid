package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class y40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChatObject.VideoParticipant a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ h60 c;

    public y40(h60 h60Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.c = h60Var;
        this.a = videoParticipant;
        this.b = z10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        h60 h60Var = this.c;
        o50 o50Var = h60Var.Q;
        o50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        h60Var.q2 = null;
        a40 a40Var = h60Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.a;
        a40Var.j(videoParticipant);
        if (h60Var.s0) {
            h60Var.s0 = false;
            h60Var.O0(true);
            if (this.b && videoParticipant != null) {
                o50Var.v0(0);
            }
            h60Var.s0 = true;
        } else {
            h60Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) h60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
