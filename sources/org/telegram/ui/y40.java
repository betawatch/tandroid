package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class y40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChatObject.VideoParticipant a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ i60 c;

    public y40(i60 i60Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.c = i60Var;
        this.a = videoParticipant;
        this.b = z10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        i60 i60Var = this.c;
        o50 o50Var = i60Var.Q;
        o50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        i60Var.q2 = null;
        a40 a40Var = i60Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.a;
        a40Var.j(videoParticipant);
        if (i60Var.s0) {
            i60Var.s0 = false;
            i60Var.O0(true);
            if (this.b && videoParticipant != null) {
                o50Var.u0(0);
            }
            i60Var.s0 = true;
        } else {
            i60Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) i60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
