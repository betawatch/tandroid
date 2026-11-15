package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class vl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lm b;
    public final /* synthetic */ org.telegram.messenger.gj c;

    public /* synthetic */ vl(lm lmVar, org.telegram.messenger.gj gjVar, int i7) {
        this.a = i7;
        this.b = lmVar;
        this.c = gjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lm lmVar = this.b;
                an anVar = lmVar.a;
                anVar.h8();
                UndoView undoView = anVar.N3;
                if (undoView != null) {
                    int i7 = (anVar.a0.getVisibility() != 0 || anVar.T.getVisibility() == 0) ? 17 : 16;
                    org.telegram.messenger.gj gjVar = this.c;
                    undoView.k(0L, i7, gjVar.C0(), null, null, new vl(lmVar, gjVar, 2));
                    break;
                }
                break;
            case 1:
                an anVar2 = this.b.a;
                anVar2.Zb = this.c.e1();
                anVar2.ac = 0;
                break;
            default:
                an anVar3 = this.b.a;
                if (anVar3.u7()) {
                    org.telegram.messenger.cz b10 = org.telegram.messenger.cz.b(this.c.C0(), anVar3.k6, anVar3.E5, anVar3.m4, null, false, null, null, null, true, 0, 0, null, false);
                    b10.K = anVar3.Y8();
                    anVar3.getSendMessagesHelper().r0(b10);
                    break;
                }
                break;
        }
    }
}
