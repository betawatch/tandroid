package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class wl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mm b;
    public final /* synthetic */ org.telegram.messenger.gj c;

    public /* synthetic */ wl(mm mmVar, org.telegram.messenger.gj gjVar, int i7) {
        this.a = i7;
        this.b = mmVar;
        this.c = gjVar;
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
                    org.telegram.messenger.gj gjVar = this.c;
                    undoView.k(0L, i7, gjVar.C0(), null, null, new wl(mmVar, gjVar, 2));
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
                    org.telegram.messenger.yy b10 = org.telegram.messenger.yy.b(this.c.C0(), bnVar3.l6, bnVar3.F5, bnVar3.m4, null, false, null, null, null, true, 0, 0, null, false);
                    b10.K = bnVar3.Y8();
                    bnVar3.getSendMessagesHelper().r0(b10);
                    break;
                }
                break;
        }
    }
}
