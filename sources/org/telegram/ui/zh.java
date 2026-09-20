package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FlagSecureReason;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class zh implements FlagSecureReason.FlagSecureCondition, mv0, r0.n, yf.a0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ zn a;

    public /* synthetic */ zh(zn znVar) {
        this.a = znVar;
    }

    @Override // r0.n
    public r0.l1 P0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.a;
        int i11 = defaultWindowInsets.c;
        zn znVar = this.a;
        if (znVar.Ta != i10 || znVar.Ua != i11) {
            znVar.Ta = i10;
            znVar.Ua = i11;
            znVar.X0.requestLayout();
        }
        znVar.v.i(l1Var);
        hh.f fVar = znVar.K3;
        if (fVar != null) {
            fVar.setPadding(i10, 0, i11, 0);
        }
        znVar.n7();
        znVar.r7();
        znVar.p9();
        boolean p5 = l1Var.a.p(8);
        if (znVar.Sa != p5) {
            znVar.Sa = p5;
            znVar.X0.S();
        }
        ci.i1 i1Var = znVar.q1;
        if (i1Var != null) {
            r0.i0.b(i1Var, l1Var);
        }
        return r0.l1.b;
    }

    @Override // yf.a0
    public void a(int i10) {
        zn.V0(this.a, i10);
    }

    @Override // org.telegram.ui.mv0
    public void b(float[] fArr) {
        zn znVar = this.a;
        fArr[1] = znVar.x0.getBottom() - znVar.Aa;
        fArr[0] = (znVar.x0.getTop() + znVar.s9) - AndroidUtilities.dp(4.0f);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        zn znVar = this.a;
        znVar.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            znVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        zn znVar = this.a;
        return znVar.h != null || znVar.y9();
    }
}
