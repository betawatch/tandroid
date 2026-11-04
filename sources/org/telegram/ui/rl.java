package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hm b;
    public final /* synthetic */ org.telegram.messenger.zi c;

    public /* synthetic */ rl(hm hmVar, org.telegram.messenger.zi ziVar, int i3) {
        this.a = i3;
        this.b = hmVar;
        this.c = ziVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hm hmVar = this.b;
                wm wmVar = hmVar.a;
                wmVar.f8();
                UndoView undoView = wmVar.N3;
                if (undoView != null) {
                    int i3 = (wmVar.a0.getVisibility() != 0 || wmVar.T.getVisibility() == 0) ? 17 : 16;
                    org.telegram.messenger.zi ziVar = this.c;
                    undoView.k(0L, i3, ziVar.C0(), null, null, new rl(hmVar, ziVar, 2));
                    break;
                }
                break;
            case 1:
                wm wmVar2 = this.b.a;
                wmVar2.Xb = this.c.f1();
                wmVar2.Yb = 0;
                break;
            default:
                wm wmVar3 = this.b.a;
                if (wmVar3.t7()) {
                    org.telegram.messenger.wy b10 = org.telegram.messenger.wy.b(this.c.C0(), wmVar3.k6, wmVar3.E5, wmVar3.m4, null, false, null, null, null, true, 0, 0, null, false);
                    b10.K = wmVar3.W8();
                    wmVar3.getSendMessagesHelper().r0(b10);
                    break;
                }
                break;
        }
    }
}
