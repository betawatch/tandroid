package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fn b;
    public final /* synthetic */ org.telegram.messenger.kj c;

    public /* synthetic */ qm(fn fnVar, org.telegram.messenger.kj kjVar, int i10) {
        this.a = i10;
        this.b = fnVar;
        this.c = kjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fn fnVar = this.b;
                un unVar = fnVar.a;
                unVar.c8();
                UndoView undoView = unVar.M3;
                if (undoView != null) {
                    int i10 = (unVar.Z.getVisibility() != 0 || unVar.S.getVisibility() == 0) ? 17 : 16;
                    org.telegram.messenger.kj kjVar = this.c;
                    undoView.k(0L, i10, kjVar.C0(), null, null, new qm(fnVar, kjVar, 2));
                    break;
                }
                break;
            case 1:
                un unVar2 = this.b.a;
                unVar2.Sb = this.c.f1();
                unVar2.Tb = 0;
                break;
            default:
                un unVar3 = this.b.a;
                if (unVar3.r7()) {
                    org.telegram.messenger.pz b10 = org.telegram.messenger.pz.b(this.c.C0(), unVar3.j6, unVar3.D5, unVar3.l4, null, false, null, null, null, true, 0, 0, null, false);
                    b10.K = unVar3.T8();
                    unVar3.getSendMessagesHelper().r0(b10);
                    break;
                }
                break;
        }
    }
}
