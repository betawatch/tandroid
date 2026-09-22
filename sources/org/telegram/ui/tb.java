package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class tb extends w7.y5 {
    public MessageObject a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public final /* synthetic */ ub f;

    public tb(ub ubVar) {
        this.f = ubVar;
    }

    @Override // w7.y5
    public final void a() {
        MessageObject messageObject = this.a;
        ub ubVar = this.f;
        if (messageObject != null) {
            int indexOf = ubVar.o0.indexOf(messageObject) + ubVar.E.f;
            if (indexOf >= 0) {
                ubVar.x.i1(indexOf, this.e, false);
            }
        } else {
            ubVar.x.i1(this.b, this.d, this.c);
        }
        this.a = null;
        ubVar.V = true;
        ubVar.d1();
        AndroidUtilities.runOnUIThread(new mu0(this, 21));
    }

    @Override // w7.y5
    public final void c() {
        ub ubVar = this.f;
        ubVar.K0 = ubVar.getNotificationCenter().setAnimationInProgress(ubVar.K0, ub.R0);
    }

    @Override // w7.y5
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            this.f.h.add((org.telegram.ui.Cells.t1) view);
        }
    }
}
