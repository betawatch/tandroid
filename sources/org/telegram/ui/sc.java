package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class sc extends org.telegram.ui.Components.ql0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ uc f;

    public sc(uc ucVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this.f = ucVar;
        this.c = context;
        this.d = f6Var;
        this.e = i10;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override // f2.o0
    public final int h() {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.e).peerColors;
        if (peerColors == null) {
            return 0;
        }
        return peerColors.colors.size();
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        tc tcVar = (tc) l1Var.a;
        tcVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, this.d));
        boolean z4 = i10 == this.f.e;
        tcVar.s = z4;
        tcVar.v.f(z4, true);
        tcVar.invalidate();
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.e).peerColors;
        if (peerColors == null || i10 < 0 || i10 >= peerColors.colors.size()) {
            return;
        }
        tcVar.a(peerColors.colors.get(i10));
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.dl0(new tc(this.f, this.c));
    }
}
