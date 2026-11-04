package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zg implements org.telegram.messenger.d9, uq0, r0.m, org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ wm a;

    public /* synthetic */ zg(wm wmVar) {
        this.a = wmVar;
    }

    @Override // r0.m
    public r0.k1 R0(View view, r0.k1 k1Var) {
        wm wmVar = this.a;
        r0.k1 N8 = wmVar.N8(k1Var);
        i0.b I0 = org.telegram.messenger.g0.I0(N8, false);
        int i3 = I0.a;
        int i10 = I0.c;
        if (wmVar.ob != i3 || wmVar.pb != i10) {
            wmVar.ob = i3;
            wmVar.pb = i10;
            wmVar.m1.requestLayout();
        }
        wmVar.w.j(N8);
        ai.o2 o2Var = wmVar.Z3;
        if (o2Var != null) {
            o2Var.setPadding(i3, 0, i10, 0);
        }
        wmVar.B7();
        wmVar.F7();
        wmVar.L9();
        boolean p10 = N8.a.p(8);
        if (wmVar.nb != p10) {
            wmVar.nb = p10;
            wmVar.m1.R();
        }
        gi.g1 g1Var = wmVar.F1;
        if (g1Var != null) {
            r0.i0.b(g1Var, N8);
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.uq0
    public void a(float[] fArr) {
        wm wmVar = this.a;
        fArr[1] = wmVar.A0.getBottom() - wmVar.Va;
        fArr[0] = (wmVar.A0.getTop() + wmVar.M9) - org.telegram.messenger.g0.L(4.0f);
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        wm wmVar = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
            wmVar.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.messenger.d9
    public boolean run() {
        wm wmVar = this.a;
        return wmVar.h != null || wmVar.U9();
    }
}
