package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class z40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChatObject.VideoParticipant a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ j60 c;

    public z40(j60 j60Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
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
        b40 b40Var = j60Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.a;
        b40Var.j(videoParticipant);
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
        viewGroup = ((org.telegram.ui.ActionBar.h3) j60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
