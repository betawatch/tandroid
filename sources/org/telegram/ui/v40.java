package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class v40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChatObject.VideoParticipant a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ f60 c;

    public v40(f60 f60Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.c = f60Var;
        this.a = videoParticipant;
        this.b = z10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        f60 f60Var = this.c;
        l50 l50Var = f60Var.Q;
        l50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        f60Var.q2 = null;
        x30 x30Var = f60Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.a;
        x30Var.j(videoParticipant);
        if (f60Var.s0) {
            f60Var.s0 = false;
            f60Var.O0(true);
            if (this.b && videoParticipant != null) {
                l50Var.u0(0);
            }
            f60Var.s0 = true;
        } else {
            f60Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) f60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
