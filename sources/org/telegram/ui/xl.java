package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nm b;
    public final /* synthetic */ org.telegram.messenger.ij c;

    public /* synthetic */ xl(nm nmVar, org.telegram.messenger.ij ijVar, int i7) {
        this.a = i7;
        this.b = nmVar;
        this.c = ijVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nm nmVar = this.b;
                cn cnVar = nmVar.a;
                cnVar.g8();
                UndoView undoView = cnVar.M3;
                if (undoView != null) {
                    int i7 = (cnVar.Z.getVisibility() != 0 || cnVar.S.getVisibility() == 0) ? 17 : 16;
                    org.telegram.messenger.ij ijVar = this.c;
                    undoView.k(0L, i7, ijVar.C0(), null, null, new xl(nmVar, ijVar, 2));
                    break;
                }
                break;
            case 1:
                cn cnVar2 = this.b.a;
                cnVar2.Yb = this.c.e1();
                cnVar2.Zb = 0;
                break;
            default:
                cn cnVar3 = this.b.a;
                if (cnVar3.u7()) {
                    org.telegram.messenger.ez b10 = org.telegram.messenger.ez.b(this.c.C0(), cnVar3.j6, cnVar3.D5, cnVar3.l4, null, false, null, null, null, true, 0, 0, null, false);
                    b10.K = cnVar3.X8();
                    cnVar3.getSendMessagesHelper().r0(b10);
                    break;
                }
                break;
        }
    }
}
