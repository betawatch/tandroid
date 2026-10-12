package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class rn extends w7.b6 {
    public MessageObject a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public boolean f;
    public int g;
    public final /* synthetic */ fo h;

    public rn(fo foVar) {
        this.h = foVar;
    }

    @Override // w7.b6
    public final void a() {
        MessageObject messageObject = this.a;
        fo foVar = this.h;
        if (messageObject != null) {
            foVar.A0.T();
            int indexOf = foVar.u6.indexOf(this.a) + foVar.A0.J;
            if (indexOf >= 0) {
                foVar.z0.i1(indexOf, (int) ((this.e + this.g) - foVar.s9), this.f);
            }
        } else {
            foVar.A0.T();
            foVar.z0.i1(this.b, this.d, this.c);
        }
        this.a = null;
        foVar.m3 = true;
        foVar.ad(false);
        AndroidUtilities.runOnUIThread(new gj(this, 9));
    }

    @Override // w7.b6
    public final void c() {
        fo foVar = this.h;
        foVar.I9 = foVar.getNotificationCenter().setAnimationInProgress(foVar.I9, fo.Nc);
        bl blVar = foVar.wa;
        if (blVar.n) {
            blVar.d();
        }
    }

    @Override // w7.b6
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            u1Var.setDelegate(null);
            u1Var.setResourcesProvider(null);
        }
    }
}
