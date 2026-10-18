package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class wb extends w7.a6 {
    public MessageObject a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public final /* synthetic */ xb f;

    public wb(xb xbVar) {
        this.f = xbVar;
    }

    @Override // w7.a6
    public final void a() {
        MessageObject messageObject = this.a;
        xb xbVar = this.f;
        if (messageObject != null) {
            int indexOf = xbVar.o0.indexOf(messageObject) + xbVar.E.f;
            if (indexOf >= 0) {
                xbVar.x.i1(indexOf, this.e, false);
            }
        } else {
            xbVar.x.i1(this.b, this.d, this.c);
        }
        this.a = null;
        xbVar.V = true;
        xbVar.d1();
        AndroidUtilities.runOnUIThread(new ut0(this, 21));
    }

    @Override // w7.a6
    public final void c() {
        xb xbVar = this.f;
        xbVar.K0 = xbVar.getNotificationCenter().setAnimationInProgress(xbVar.K0, xb.R0);
    }

    @Override // w7.a6
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            this.f.h.add((org.telegram.ui.Cells.u1) view);
        }
    }
}
