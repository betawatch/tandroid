package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ve implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;
    public final /* synthetic */ int c;

    public /* synthetic */ ve(qn qnVar, int i9, int i10) {
        this.a = i10;
        this.b = qnVar;
        this.c = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        switch (this.a) {
            case 0:
                this.b.getConnectionsManager().cancelRequest(this.c, true);
                break;
            case 1:
                this.b.j(this.c, 0, false, 0, true, 0);
                break;
            case 2:
                this.b.getConnectionsManager().cancelRequest(this.c, true);
                break;
            case 3:
                qn qnVar = this.b;
                ij ijVar = qnVar.t0;
                if (ijVar != null) {
                    int childCount = ijVar.getChildCount();
                    for (int i9 = 0; i9 < childCount; i9++) {
                        View childAt = qnVar.t0.getChildAt(i9);
                        if ((childAt instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject.equals(qnVar.C3)) {
                            t1Var.g4(this.c, true, true);
                        }
                    }
                }
                qnVar.C3 = null;
                break;
            case 4:
                this.b.getConnectionsManager().cancelRequest(this.c, true);
                break;
            case 5:
                qn.U(this.b, this.c);
                break;
            case 6:
                this.b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.c, new Object[0]));
                break;
            case 7:
                this.b.getConnectionsManager().cancelRequest(this.c, true);
                break;
            case 8:
                qn.d0(this.b, this.c);
                break;
            default:
                qn.e1(this.b, this.c);
                break;
        }
    }
}
