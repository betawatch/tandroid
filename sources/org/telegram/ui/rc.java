package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class rc extends org.telegram.ui.Components.ll0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ tc f;

    public rc(tc tcVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this.f = tcVar;
        this.c = context;
        this.d = f6Var;
        this.e = i10;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.e).peerColors;
        if (peerColors == null) {
            return 0;
        }
        return peerColors.colors.size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        sc scVar = (sc) c1Var.a;
        scVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, this.d));
        boolean z10 = i10 == this.f.e;
        scVar.s = z10;
        scVar.v.f(z10, true);
        scVar.invalidate();
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.e).peerColors;
        if (peerColors == null || i10 < 0 || i10 >= peerColors.colors.size()) {
            return;
        }
        scVar.a(peerColors.colors.get(i10));
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.wk0(new sc(this.f, this.c));
    }
}
