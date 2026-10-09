package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FlagSecureReason;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wh implements FlagSecureReason.FlagSecureCondition, nv0, r0.n, yf.a0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ zn a;

    public /* synthetic */ wh(zn znVar) {
        this.a = znVar;
    }

    @Override // r0.n
    public r0.k1 M0(View view, r0.k1 k1Var) {
        zn znVar = this.a;
        r0.k1 z82 = znVar.z8(k1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(z82, false);
        int i10 = defaultWindowInsets.a;
        int i11 = defaultWindowInsets.c;
        if (znVar.Ua != i10 || znVar.Va != i11) {
            znVar.Ua = i10;
            znVar.Va = i11;
            znVar.X0.requestLayout();
        }
        znVar.v.k(z82);
        ai.f0 f0Var = znVar.K3;
        if (f0Var != null) {
            f0Var.setPadding(i10, 0, i11, 0);
        }
        znVar.q7();
        znVar.u7();
        znVar.u9();
        boolean p5 = z82.a.p(8);
        if (znVar.Ta != p5) {
            znVar.Ta = p5;
            znVar.X0.S();
        }
        ci.h1 h1Var = znVar.q1;
        if (h1Var != null) {
            r0.i0.b(h1Var, z82);
        }
        return r0.k1.b;
    }

    @Override // yf.a0
    public void a(int i10) {
        zn.X0(this.a, i10);
    }

    @Override // org.telegram.ui.nv0
    public void b(float[] fArr) {
        zn znVar = this.a;
        fArr[1] = znVar.x0.getBottom() - znVar.Ba;
        fArr[0] = (znVar.x0.getTop() + znVar.s9) - AndroidUtilities.dp(4.0f);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        zn znVar = this.a;
        znVar.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            znVar.getParentActivity().startActivity(intent);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        zn znVar = this.a;
        return znVar.h != null || znVar.D9();
    }
}
