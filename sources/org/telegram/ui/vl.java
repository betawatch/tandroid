package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lm b;
    public final /* synthetic */ org.telegram.messenger.ij c;

    public /* synthetic */ vl(lm lmVar, org.telegram.messenger.ij ijVar, int i7) {
        this.a = i7;
        this.b = lmVar;
        this.c = ijVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lm lmVar = this.b;
                an anVar = lmVar.a;
                anVar.f8();
                UndoView undoView = anVar.M3;
                if (undoView != null) {
                    int i7 = (anVar.Z.getVisibility() != 0 || anVar.S.getVisibility() == 0) ? 17 : 16;
                    org.telegram.messenger.ij ijVar = this.c;
                    undoView.k(0L, i7, ijVar.C0(), null, null, new vl(lmVar, ijVar, 2));
                    break;
                }
                break;
            case 1:
                an anVar2 = this.b.a;
                anVar2.Wb = this.c.f1();
                anVar2.Xb = 0;
                break;
            default:
                an anVar3 = this.b.a;
                if (anVar3.t7()) {
                    org.telegram.messenger.ez b10 = org.telegram.messenger.ez.b(this.c.C0(), anVar3.j6, anVar3.D5, anVar3.l4, null, false, null, null, null, true, 0, 0, null, false);
                    b10.K = anVar3.W8();
                    anVar3.getSendMessagesHelper().r0(b10);
                    break;
                }
                break;
        }
    }
}
