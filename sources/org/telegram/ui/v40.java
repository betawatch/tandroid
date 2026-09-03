package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class v40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChatObject.VideoParticipant a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ e60 c;

    public v40(e60 e60Var, ChatObject.VideoParticipant videoParticipant, boolean z4) {
        this.c = e60Var;
        this.a = videoParticipant;
        this.b = z4;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        e60 e60Var = this.c;
        l50 l50Var = e60Var.N;
        l50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        e60Var.n2 = null;
        x30 x30Var = e60Var.X1;
        ChatObject.VideoParticipant videoParticipant = this.a;
        x30Var.j(videoParticipant);
        if (e60Var.p0) {
            e60Var.p0 = false;
            e60Var.O0(true);
            if (this.b && videoParticipant != null) {
                l50Var.u0(0);
            }
            e60Var.p0 = true;
        } else {
            e60Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.g3) e60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
