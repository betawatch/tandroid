package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class y40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChatObject.VideoParticipant a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ j60 c;

    public y40(j60 j60Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.c = j60Var;
        this.a = videoParticipant;
        this.b = z10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        j60 j60Var = this.c;
        p50 p50Var = j60Var.Q;
        p50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        j60Var.q2 = null;
        a40 a40Var = j60Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.a;
        a40Var.j(videoParticipant);
        if (j60Var.s0) {
            j60Var.s0 = false;
            j60Var.O0(true);
            if (this.b && videoParticipant != null) {
                p50Var.u0(0);
            }
            j60Var.s0 = true;
        } else {
            j60Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) j60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
