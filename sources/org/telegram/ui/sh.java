package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sh implements r0.o, lf.d0, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ xn a;

    public /* synthetic */ sh(xn xnVar) {
        this.a = xnVar;
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i10 = defaultWindowInsets.a;
        int i11 = defaultWindowInsets.c;
        xn xnVar = this.a;
        if (xnVar.Ra != i10 || xnVar.Sa != i11) {
            xnVar.Ra = i10;
            xnVar.Sa = i11;
            xnVar.U0.requestLayout();
        }
        xnVar.v.i(m1Var);
        vg.e eVar = xnVar.H3;
        if (eVar != null) {
            eVar.setPadding(i10, 0, i11, 0);
        }
        xnVar.n7();
        xnVar.r7();
        xnVar.p9();
        boolean p10 = m1Var.a.p(8);
        if (xnVar.Qa != p10) {
            xnVar.Qa = p10;
            xnVar.U0.S();
        }
        ek ekVar = xnVar.n1;
        if (ekVar != null) {
            r0.j0.b(ekVar, m1Var);
        }
        return r0.m1.b;
    }

    @Override // lf.d0
    public void a(int i10) {
        xn.S0(this.a, i10);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        xn xnVar = this.a;
        xnVar.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            xnVar.getParentActivity().startActivity(intent);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }
}
