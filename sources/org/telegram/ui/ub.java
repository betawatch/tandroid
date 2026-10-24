package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ub extends w7.a6 {
    public MessageObject a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public final /* synthetic */ vb f;

    public ub(vb vbVar) {
        this.f = vbVar;
    }

    @Override // w7.a6
    public final void a() {
        MessageObject messageObject = this.a;
        vb vbVar = this.f;
        if (messageObject != null) {
            int indexOf = vbVar.o0.indexOf(messageObject) + vbVar.E.f;
            if (indexOf >= 0) {
                vbVar.x.i1(indexOf, this.e, false);
            }
        } else {
            vbVar.x.i1(this.b, this.d, this.c);
        }
        this.a = null;
        vbVar.V = true;
        vbVar.d1();
        AndroidUtilities.runOnUIThread(new vt0(this, 21));
    }

    @Override // w7.a6
    public final void c() {
        vb vbVar = this.f;
        vbVar.K0 = vbVar.getNotificationCenter().setAnimationInProgress(vbVar.K0, vb.R0);
    }

    @Override // w7.a6
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            this.f.h.add((org.telegram.ui.Cells.t1) view);
        }
    }
}
