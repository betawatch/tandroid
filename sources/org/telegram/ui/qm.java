package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class qm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fn b;
    public final /* synthetic */ org.telegram.messenger.jj c;

    public /* synthetic */ qm(fn fnVar, org.telegram.messenger.jj jjVar, int i10) {
        this.a = i10;
        this.b = fnVar;
        this.c = jjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fn fnVar = this.b;
                un unVar = fnVar.a;
                unVar.Y7();
                UndoView undoView = unVar.M3;
                if (undoView != null) {
                    int i10 = (unVar.Z.getVisibility() != 0 || unVar.S.getVisibility() == 0) ? 17 : 16;
                    org.telegram.messenger.jj jjVar = this.c;
                    undoView.k(0L, i10, jjVar.C0(), null, null, new qm(fnVar, jjVar, 2));
                    break;
                }
                break;
            case 1:
                un unVar2 = this.b.a;
                unVar2.Rb = this.c.f1();
                unVar2.Sb = 0;
                break;
            default:
                un unVar3 = this.b.a;
                if (unVar3.n7()) {
                    org.telegram.messenger.oz b10 = org.telegram.messenger.oz.b(this.c.C0(), unVar3.j6, unVar3.D5, unVar3.l4, null, false, null, null, null, true, 0, 0, null, false);
                    b10.K = unVar3.P8();
                    unVar3.getSendMessagesHelper().r0(b10);
                    break;
                }
                break;
        }
    }
}
