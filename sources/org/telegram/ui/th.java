package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class th implements org.telegram.messenger.k9, os0, r0.m, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ un a;

    public /* synthetic */ th(un unVar) {
        this.a = unVar;
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        un unVar = this.a;
        r0.j1 K8 = unVar.K8(j1Var);
        i0.c I0 = org.telegram.messenger.i0.I0(K8, false);
        int i10 = I0.a;
        int i11 = I0.c;
        if (unVar.nb != i10 || unVar.ob != i11) {
            unVar.nb = i10;
            unVar.ob = i11;
            unVar.l1.requestLayout();
        }
        unVar.w.j(K8);
        org.telegram.ui.Components.voip.j0 j0Var = unVar.Y3;
        if (j0Var != null) {
            j0Var.setPadding(i10, 0, i11, 0);
        }
        unVar.z7();
        unVar.D7();
        unVar.G9();
        boolean p5 = K8.a.p(8);
        if (unVar.mb != p5) {
            unVar.mb = p5;
            unVar.l1.R();
        }
        hk hkVar = unVar.E1;
        if (hkVar != null) {
            r0.h0.b(hkVar, K8);
        }
        return r0.j1.b;
    }

    @Override // org.telegram.ui.os0
    public void a(float[] fArr) {
        un unVar = this.a;
        fArr[1] = unVar.z0.getBottom() - unVar.Ua;
        fArr[0] = (unVar.z0.getTop() + unVar.L9) - org.telegram.messenger.i0.L(4.0f);
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        un unVar = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.b.getPackageName()));
            unVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.messenger.k9
    public boolean run() {
        un unVar = this.a;
        return unVar.h != null || unVar.P9();
    }
}
