package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class vb extends w7.a6 {
    public MessageObject a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public final /* synthetic */ wb f;

    public vb(wb wbVar) {
        this.f = wbVar;
    }

    @Override // w7.a6
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
        AndroidUtilities.runOnUIThread(new hu0(this, 21));
    }

    @Override // w7.a6
    public final void c() {
        wb wbVar = this.f;
        wbVar.K0 = wbVar.getNotificationCenter().setAnimationInProgress(wbVar.K0, wb.R0);
    }

    @Override // w7.a6
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            this.f.h.add((org.telegram.ui.Cells.u1) view);
        }
    }
}
