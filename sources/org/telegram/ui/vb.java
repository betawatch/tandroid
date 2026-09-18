package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class vb extends w7.y5 {
    public MessageObject a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public final /* synthetic */ wb f;

    public vb(wb wbVar) {
        this.f = wbVar;
    }

    @Override // w7.y5
    public final void a() {
        MessageObject messageObject = this.a;
        wb wbVar = this.f;
        if (messageObject != null) {
            int indexOf = wbVar.o0.indexOf(messageObject) + wbVar.E.f;
            if (indexOf >= 0) {
                wbVar.x.i1(indexOf, this.e, false);
            }
        } else {
            wbVar.x.i1(this.b, this.d, this.c);
        }
        this.a = null;
        wbVar.V = true;
        wbVar.d1();
        AndroidUtilities.runOnUIThread(new ou0(this, 21));
    }

    @Override // w7.y5
    public final void c() {
        wb wbVar = this.f;
        wbVar.K0 = wbVar.getNotificationCenter().setAnimationInProgress(wbVar.K0, wb.R0);
    }

    @Override // w7.y5
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            this.f.h.add((org.telegram.ui.Cells.t1) view);
        }
    }
}
