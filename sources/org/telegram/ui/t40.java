package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class t40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChatObject.VideoParticipant a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ c60 c;

    public t40(c60 c60Var, ChatObject.VideoParticipant videoParticipant, boolean z4) {
        this.c = c60Var;
        this.a = videoParticipant;
        this.b = z4;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        c60 c60Var = this.c;
        j50 j50Var = c60Var.N;
        j50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        c60Var.n2 = null;
        v30 v30Var = c60Var.X1;
        ChatObject.VideoParticipant videoParticipant = this.a;
        v30Var.j(videoParticipant);
        if (c60Var.p0) {
            c60Var.p0 = false;
            c60Var.O0(true);
            if (this.b && videoParticipant != null) {
                j50Var.u0(0);
            }
            c60Var.p0 = true;
        } else {
            c60Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.g3) c60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
