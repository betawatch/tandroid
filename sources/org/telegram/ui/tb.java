package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
            int indexOf = ubVar.s0.indexOf(messageObject) + ubVar.I.f;
            if (indexOf >= 0) {
                ubVar.G.i1(indexOf, this.e, false);
            }
        } else {
            ubVar.G.i1(this.b, this.d, this.c);
        }
        this.a = null;
        ubVar.Z = true;
        ubVar.e1();
        AndroidUtilities.runOnUIThread(new lu0(this, 21));
    }

    @Override // w7.y5
    public final void c() {
        ub ubVar = this.f;
        ubVar.O0 = ubVar.getNotificationCenter().setAnimationInProgress(ubVar.O0, ub.Y0);
    }

    @Override // w7.y5
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            this.f.v.add((org.telegram.ui.Cells.t1) view);
        }
    }
}
