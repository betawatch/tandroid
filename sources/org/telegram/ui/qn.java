package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class qn extends w7.b6 {
    public MessageObject a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public boolean f;
    public int g;
    public final /* synthetic */ eo h;

    public qn(eo eoVar) {
        this.h = eoVar;
    }

    @Override // w7.b6
    public final void a() {
        MessageObject messageObject = this.a;
        eo eoVar = this.h;
        if (messageObject != null) {
            eoVar.A0.T();
            int indexOf = eoVar.u6.indexOf(this.a) + eoVar.A0.J;
            if (indexOf >= 0) {
                eoVar.z0.i1(indexOf, (int) ((this.e + this.g) - eoVar.s9), this.f);
            }
        } else {
            eoVar.A0.T();
            eoVar.z0.i1(this.b, this.d, this.c);
        }
        this.a = null;
        eoVar.m3 = true;
        eoVar.Wc(false);
        AndroidUtilities.runOnUIThread(new fj(this, 8));
    }

    @Override // w7.b6
    public final void c() {
        eo eoVar = this.h;
        eoVar.I9 = eoVar.getNotificationCenter().setAnimationInProgress(eoVar.I9, eo.Nc);
        xk xkVar = eoVar.wa;
        if (xkVar.n) {
            xkVar.d();
        }
    }

    @Override // w7.b6
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            t1Var.setDelegate(null);
            t1Var.setResourcesProvider(null);
        }
    }
}
