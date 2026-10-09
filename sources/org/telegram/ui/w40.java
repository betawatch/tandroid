package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class w40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChatObject.VideoParticipant a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ g60 c;

    public w40(g60 g60Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.c = g60Var;
        this.a = videoParticipant;
        this.b = z10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        g60 g60Var = this.c;
        m50 m50Var = g60Var.Q;
        m50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        g60Var.q2 = null;
        y30 y30Var = g60Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.a;
        y30Var.j(videoParticipant);
        if (g60Var.s0) {
            g60Var.s0 = false;
            g60Var.P0(true);
            if (this.b && videoParticipant != null) {
                m50Var.u0(0);
            }
            g60Var.s0 = true;
        } else {
            g60Var.P0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) g60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
