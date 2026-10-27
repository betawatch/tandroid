package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ze implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;
    public final /* synthetic */ int c;

    public /* synthetic */ ze(wn wnVar, int i10, int i11) {
        this.a = i11;
        this.b = wnVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Cells.s1 s1Var;
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
                wn wnVar = this.b;
                rj rjVar = wnVar.x0;
                if (rjVar != null) {
                    int childCount = rjVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = wnVar.x0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) != null && messageObject.equals(wnVar.S3)) {
                            s1Var.i4(this.c, true, true);
                        }
                    }
                }
                wnVar.S3 = null;
                break;
            case 4:
                this.b.getConnectionsManager().cancelRequest(this.c, true);
                break;
            case 5:
                wn.Z(this.b, this.c);
                break;
            case 6:
                this.b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.c, new Object[0]));
                break;
            case 7:
                this.b.getConnectionsManager().cancelRequest(this.c, true);
                break;
            case 8:
                wn.p1(this.b, this.c);
                break;
            default:
                wn.L0(this.b, this.c);
                break;
        }
    }
}
