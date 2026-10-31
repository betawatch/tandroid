package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class th implements org.telegram.messenger.j9, ps0, r0.m, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ un a;

    public /* synthetic */ th(un unVar) {
        this.a = unVar;
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        un unVar = this.a;
        r0.j1 G8 = unVar.G8(j1Var);
        i0.c I0 = org.telegram.messenger.i0.I0(G8, false);
        int i10 = I0.a;
        int i11 = I0.c;
        if (unVar.nb != i10 || unVar.ob != i11) {
            unVar.nb = i10;
            unVar.ob = i11;
            unVar.l1.requestLayout();
        }
        unVar.w.j(G8);
        org.telegram.ui.Components.voip.i0 i0Var = unVar.Y3;
        if (i0Var != null) {
            i0Var.setPadding(i10, 0, i11, 0);
        }
        unVar.v7();
        unVar.z7();
        unVar.B9();
        boolean p5 = G8.a.p(8);
        if (unVar.mb != p5) {
            unVar.mb = p5;
            unVar.l1.R();
        }
        hk hkVar = unVar.E1;
        if (hkVar != null) {
            r0.h0.b(hkVar, G8);
        }
        return r0.j1.b;
    }

    @Override // org.telegram.ui.ps0
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

    @Override // org.telegram.messenger.j9
    public boolean run() {
        un unVar = this.a;
        return unVar.h != null || unVar.K9();
    }
}
