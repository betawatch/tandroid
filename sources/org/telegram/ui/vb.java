package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class vb extends org.telegram.ui.Components.gb1 {
    public MessageObject c;
    public int d = 0;
    public boolean e = true;
    public int f = 0;
    public int g;
    public final /* synthetic */ wb h;

    public vb(wb wbVar) {
        this.h = wbVar;
    }

    @Override // org.telegram.ui.Components.gb1
    public final void N() {
        MessageObject messageObject = this.c;
        wb wbVar = this.h;
        if (messageObject != null) {
            int indexOf = wbVar.o0.indexOf(messageObject) + wbVar.E.f;
            if (indexOf >= 0) {
                wbVar.x.i1(indexOf, this.g, false);
            }
        } else {
            wbVar.x.i1(this.d, this.f, this.e);
        }
        this.c = null;
        wbVar.V = true;
        wbVar.e1();
        AndroidUtilities.runOnUIThread(new zt0(this, 21));
    }

    @Override // org.telegram.ui.Components.gb1
    public final void Q() {
        wb wbVar = this.h;
        wbVar.K0 = wbVar.getNotificationCenter().setAnimationInProgress(wbVar.K0, wb.R0);
    }

    @Override // org.telegram.ui.Components.gb1
    public final void S(View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            this.h.h.add((org.telegram.ui.Cells.s1) view);
        }
    }
}
