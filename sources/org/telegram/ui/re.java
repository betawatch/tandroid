package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class re implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;
    public final /* synthetic */ int c;

    public /* synthetic */ re(cn cnVar, int i7, int i10) {
        this.a = i10;
        this.b = cnVar;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ij messageObject;
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
                cn cnVar = this.b;
                cj cjVar = cnVar.z0;
                if (cjVar != null) {
                    int childCount = cjVar.getChildCount();
                    for (int i7 = 0; i7 < childCount; i7++) {
                        View childAt = cnVar.z0.getChildAt(i7);
                        if ((childAt instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject.T(cnVar.U3)) {
                            q1Var.G3(this.c, true, true);
                        }
                    }
                }
                cnVar.U3 = null;
                break;
            case 4:
                this.b.actionBar.getActionBarMenuOnItemClick().b(this.c);
                break;
            case 5:
                this.b.getConnectionsManager().cancelRequest(this.c, true);
                break;
            case 6:
                cn.c0(this.b, this.c);
                break;
            case 7:
                this.b.actionBar.setSubtitle(org.telegram.messenger.id.G(this.c, "messages", new Object[0]));
                break;
            case 8:
                this.b.getConnectionsManager().cancelRequest(this.c, true);
                break;
            case 9:
                cn.O0(this.b, this.c);
                break;
            default:
                cn.d1(this.b, this.c);
                break;
        }
    }
}
