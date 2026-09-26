package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FlagSecureReason;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vh implements FlagSecureReason.FlagSecureCondition, ev0, r0.n, yf.a0, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ wn a;

    public /* synthetic */ vh(wn wnVar) {
        this.a = wnVar;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.a;
        int i11 = defaultWindowInsets.c;
        wn wnVar = this.a;
        if (wnVar.Ta != i10 || wnVar.Ua != i11) {
            wnVar.Ta = i10;
            wnVar.Ua = i11;
            wnVar.X0.requestLayout();
        }
        wnVar.v.i(l1Var);
        hh.f fVar = wnVar.K3;
        if (fVar != null) {
            fVar.setPadding(i10, 0, i11, 0);
        }
        wnVar.n7();
        wnVar.r7();
        wnVar.p9();
        boolean p5 = l1Var.a.p(8);
        if (wnVar.Sa != p5) {
            wnVar.Sa = p5;
            wnVar.X0.S();
        }
        ci.i1 i1Var = wnVar.q1;
        if (i1Var != null) {
            r0.i0.b(i1Var, l1Var);
        }
        return r0.l1.b;
    }

    @Override // yf.a0
    public void a(int i10) {
        wn.U0(this.a, i10);
    }

    @Override // org.telegram.ui.ev0
    public void b(float[] fArr) {
        wn wnVar = this.a;
        fArr[1] = wnVar.x0.getBottom() - wnVar.Aa;
        fArr[0] = (wnVar.x0.getTop() + wnVar.s9) - AndroidUtilities.dp(4.0f);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        wn wnVar = this.a;
        wnVar.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            wnVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        wn wnVar = this.a;
        return wnVar.h != null || wnVar.y9();
    }
}
