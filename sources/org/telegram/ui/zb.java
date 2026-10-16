package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class zb extends w7.a6 {
    public MessageObject a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public final /* synthetic */ ac f;

    public zb(ac acVar) {
        this.f = acVar;
    }

    @Override // w7.a6
    public final void a() {
        MessageObject messageObject = this.a;
        ac acVar = this.f;
        if (messageObject != null) {
            int indexOf = acVar.o0.indexOf(messageObject) + acVar.E.f;
            if (indexOf >= 0) {
                acVar.x.i1(indexOf, this.e, false);
            }
        } else {
            acVar.x.i1(this.b, this.d, this.c);
        }
        this.a = null;
        acVar.V = true;
        acVar.d1();
        AndroidUtilities.runOnUIThread(new su0(this, 21));
    }

    @Override // w7.a6
    public final void c() {
        ac acVar = this.f;
        acVar.K0 = acVar.getNotificationCenter().setAnimationInProgress(acVar.K0, ac.R0);
    }

    @Override // w7.a6
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            this.f.h.add((org.telegram.ui.Cells.u1) view);
        }
    }
}
