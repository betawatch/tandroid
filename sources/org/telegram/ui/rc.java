package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class rc extends org.telegram.ui.Components.hm0 {
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

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override // s4.g0
    public final int h() {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.e).peerColors;
        if (peerColors == null) {
            return 0;
        }
        return peerColors.colors.size();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        sc scVar = (sc) b1Var.a;
        scVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, this.d));
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

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.sl0(new sc(this.f, this.c));
    }
}
