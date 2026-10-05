package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class rc extends org.telegram.ui.Components.yl0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ tc f;

    public rc(tc tcVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        this.f = tcVar;
        this.c = context;
        this.d = d6Var;
        this.e = i10;
    }

    @Override // org.telegram.ui.Components.yl0
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
        scVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.d6, this.d));
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
        return new org.telegram.ui.Components.il0(new sc(this.f, this.c));
    }
}
