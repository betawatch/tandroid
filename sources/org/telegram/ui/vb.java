package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class vb extends w7.b6 {
    public MessageObject a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public final /* synthetic */ wb f;

    public vb(wb wbVar) {
        this.f = wbVar;
    }

    @Override // w7.b6
    public final void a() {
        MessageObject messageObject = this.a;
        wb wbVar = this.f;
        if (messageObject != null) {
            int indexOf = wbVar.s0.indexOf(messageObject) + wbVar.I.f;
            if (indexOf >= 0) {
                wbVar.G.i1(indexOf, this.e, false);
            }
        } else {
            wbVar.G.i1(this.b, this.d, this.c);
        }
        this.a = null;
        wbVar.Z = true;
        wbVar.e1();
        AndroidUtilities.runOnUIThread(new mu0(this, 21));
    }

    @Override // w7.b6
    public final void c() {
        wb wbVar = this.f;
        wbVar.O0 = wbVar.getNotificationCenter().setAnimationInProgress(wbVar.O0, wb.Y0);
    }

    @Override // w7.b6
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            this.f.v.add((org.telegram.ui.Cells.t1) view);
        }
    }
}
