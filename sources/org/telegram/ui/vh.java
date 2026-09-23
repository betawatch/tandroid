package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class vh implements r0.n, yf.a0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ xn a;

    public /* synthetic */ vh(xn xnVar) {
        this.a = xnVar;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.a;
        int i11 = defaultWindowInsets.c;
        xn xnVar = this.a;
        if (xnVar.Ta != i10 || xnVar.Ua != i11) {
            xnVar.Ta = i10;
            xnVar.Ua = i11;
            xnVar.X0.requestLayout();
        }
        xnVar.v.i(l1Var);
        hh.f fVar = xnVar.K3;
        if (fVar != null) {
            fVar.setPadding(i10, 0, i11, 0);
        }
        xnVar.n7();
        xnVar.r7();
        xnVar.p9();
        boolean p5 = l1Var.a.p(8);
        if (xnVar.Sa != p5) {
            xnVar.Sa = p5;
            xnVar.X0.S();
        }
        ci.i1 i1Var = xnVar.q1;
        if (i1Var != null) {
            r0.i0.b(i1Var, l1Var);
        }
        return r0.l1.b;
    }

    @Override // yf.a0
    public void a(int i10) {
        xn.S0(this.a, i10);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        xn xnVar = this.a;
        xnVar.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            xnVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
