package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yh implements r0.n, yf.a0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ bo a;

    public /* synthetic */ yh(bo boVar) {
        this.a = boVar;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.a;
        int i11 = defaultWindowInsets.c;
        bo boVar = this.a;
        if (boVar.Ta != i10 || boVar.Ua != i11) {
            boVar.Ta = i10;
            boVar.Ua = i11;
            boVar.X0.requestLayout();
        }
        boVar.v.i(l1Var);
        hh.f fVar = boVar.K3;
        if (fVar != null) {
            fVar.setPadding(i10, 0, i11, 0);
        }
        boVar.n7();
        boVar.r7();
        boVar.p9();
        boolean p5 = l1Var.a.p(8);
        if (boVar.Sa != p5) {
            boVar.Sa = p5;
            boVar.X0.S();
        }
        ci.i1 i1Var = boVar.q1;
        if (i1Var != null) {
            r0.i0.b(i1Var, l1Var);
        }
        return r0.l1.b;
    }

    @Override // yf.a0
    public void a(int i10) {
        bo.S0(this.a, i10);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        bo boVar = this.a;
        boVar.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            boVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
