package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class wl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mm b;
    public final /* synthetic */ org.telegram.messenger.fj c;

    public /* synthetic */ wl(mm mmVar, org.telegram.messenger.fj fjVar, int i7) {
        this.a = i7;
        this.b = mmVar;
        this.c = fjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mm mmVar = this.b;
                bn bnVar = mmVar.a;
                bnVar.h8();
                UndoView undoView = bnVar.N3;
                if (undoView != null) {
                    int i7 = (bnVar.a0.getVisibility() != 0 || bnVar.T.getVisibility() == 0) ? 17 : 16;
                    org.telegram.messenger.fj fjVar = this.c;
                    undoView.k(0L, i7, fjVar.C0(), null, null, new wl(mmVar, fjVar, 2));
                    break;
                }
                break;
            case 1:
                bn bnVar2 = this.b.a;
                bnVar2.ac = this.c.e1();
                bnVar2.bc = 0;
                break;
            default:
                bn bnVar3 = this.b.a;
                if (bnVar3.u7()) {
                    org.telegram.messenger.xy b10 = org.telegram.messenger.xy.b(this.c.C0(), bnVar3.l6, bnVar3.F5, bnVar3.m4, null, false, null, null, null, true, 0, 0, null, false);
                    b10.K = bnVar3.Y8();
                    bnVar3.getSendMessagesHelper().r0(b10);
                    break;
                }
                break;
        }
    }
}
