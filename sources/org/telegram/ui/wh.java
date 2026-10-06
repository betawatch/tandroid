package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FlagSecureReason;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class wh implements FlagSecureReason.FlagSecureCondition, hv0, r0.n, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ yn a;

    public /* synthetic */ wh(yn ynVar) {
        this.a = ynVar;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.a;
        int i11 = defaultWindowInsets.c;
        yn ynVar = this.a;
        if (ynVar.Ra != i10 || ynVar.Sa != i11) {
            ynVar.Ra = i10;
            ynVar.Sa = i11;
            ynVar.V0.requestLayout();
        }
        ynVar.v.i(l1Var);
        hh.f fVar = ynVar.I3;
        if (fVar != null) {
            fVar.setPadding(i10, 0, i11, 0);
        }
        ynVar.n7();
        ynVar.r7();
        ynVar.p9();
        boolean p5 = l1Var.a.p(8);
        if (ynVar.Qa != p5) {
            ynVar.Qa = p5;
            ynVar.V0.S();
        }
        ci.i1 i1Var = ynVar.o1;
        if (i1Var != null) {
            r0.i0.b(i1Var, l1Var);
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.hv0
    public void a(float[] fArr) {
        yn ynVar = this.a;
        fArr[1] = ynVar.v0.getBottom() - ynVar.ya;
        fArr[0] = (ynVar.v0.getTop() + ynVar.q9) - AndroidUtilities.dp(4.0f);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        yn ynVar = this.a;
        ynVar.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            ynVar.getParentActivity().startActivity(intent);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        yn ynVar = this.a;
        return ynVar.h != null || ynVar.x9();
    }
}
