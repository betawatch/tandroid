package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class re implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ int c;

    public /* synthetic */ re(bn bnVar, int i7, int i10) {
        this.a = i10;
        this.b = bnVar;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.fj messageObject;
        switch (this.a) {
            case 0:
                this.b.getConnectionsManager().cancelRequest(this.c, true);
                break;
            case 1:
                this.b.l(this.c, 0, false, 0, true, 0);
                break;
            case 2:
                this.b.getConnectionsManager().cancelRequest(this.c, true);
                break;
            case 3:
                bn bnVar = this.b;
                bj bjVar = bnVar.A0;
                if (bjVar != null) {
                    int childCount = bjVar.getChildCount();
                    for (int i7 = 0; i7 < childCount; i7++) {
                        View childAt = bnVar.A0.getChildAt(i7);
                        if ((childAt instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject.T(bnVar.V3)) {
                            q1Var.I3(this.c, true, true);
                        }
                    }
                }
                bnVar.V3 = null;
                break;
            case 4:
                this.b.actionBar.getActionBarMenuOnItemClick().b(this.c);
                break;
            case 5:
                this.b.getConnectionsManager().cancelRequest(this.c, true);
                break;
            case 6:
                bn.c0(this.b, this.c);
                break;
            case 7:
                this.b.actionBar.setSubtitle(org.telegram.messenger.gd.G(this.c, "messages", new Object[0]));
                break;
            case 8:
                this.b.getConnectionsManager().cancelRequest(this.c, true);
                break;
            case 9:
                bn.O0(this.b, this.c);
                break;
            default:
                bn.d1(this.b, this.c);
                break;
        }
    }
}
