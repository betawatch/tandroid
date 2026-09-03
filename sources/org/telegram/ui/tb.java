package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class tb extends k7.c6 {
    public MessageObject a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public final /* synthetic */ ub f;

    public tb(ub ubVar) {
        this.f = ubVar;
    }

    @Override // k7.c6
    public final void a() {
        MessageObject messageObject = this.a;
        ub ubVar = this.f;
        if (messageObject != null) {
            int indexOf = ubVar.p0.indexOf(messageObject) + ubVar.F.f;
            if (indexOf >= 0) {
                ubVar.D.i1(indexOf, this.e, false);
            }
        } else {
            ubVar.D.i1(this.b, this.d, this.c);
        }
        this.a = null;
        ubVar.W = true;
        ubVar.e1();
        AndroidUtilities.runOnUIThread(new yt0(this, 21));
    }

    @Override // k7.c6
    public final void c() {
        ub ubVar = this.f;
        ubVar.L0 = ubVar.getNotificationCenter().setAnimationInProgress(ubVar.L0, ub.V0);
    }

    @Override // k7.c6
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            this.f.v.add((org.telegram.ui.Cells.s1) view);
        }
    }
}
