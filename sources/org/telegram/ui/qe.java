package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;
    public final /* synthetic */ int c;

    public /* synthetic */ qe(an anVar, int i7, int i10) {
        this.a = i10;
        this.b = anVar;
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
                an anVar = this.b;
                aj ajVar = anVar.z0;
                if (ajVar != null) {
                    int childCount = ajVar.getChildCount();
                    for (int i7 = 0; i7 < childCount; i7++) {
                        View childAt = anVar.z0.getChildAt(i7);
                        if ((childAt instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject.T(anVar.U3)) {
                            q1Var.F3(this.c, true, true);
                        }
                    }
                }
                anVar.U3 = null;
                break;
            case 4:
                this.b.actionBar.getActionBarMenuOnItemClick().b(this.c);
                break;
            case 5:
                this.b.getConnectionsManager().cancelRequest(this.c, true);
                break;
            case 6:
                an.b0(this.b, this.c);
                break;
            case 7:
                this.b.actionBar.setSubtitle(org.telegram.messenger.hd.G(this.c, "messages", new Object[0]));
                break;
            case 8:
                this.b.getConnectionsManager().cancelRequest(this.c, true);
                break;
            case 9:
                an.L0(this.b, this.c);
                break;
            default:
                an.Y0(this.b, this.c);
                break;
        }
    }
}
