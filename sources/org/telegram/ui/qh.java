package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FlagSecureReason;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qh implements FlagSecureReason.FlagSecureCondition, bv0, r0.n, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ wn a;

    public /* synthetic */ qh(wn wnVar) {
        this.a = wnVar;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        wn wnVar = this.a;
        r0.k1 F8 = wnVar.F8(k1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(F8, false);
        int i10 = defaultWindowInsets.a;
        int i11 = defaultWindowInsets.c;
        if (wnVar.tb != i10 || wnVar.ub != i11) {
            wnVar.tb = i10;
            wnVar.ub = i11;
            wnVar.j1.requestLayout();
        }
        wnVar.v.j(F8);
        bh.r rVar = wnVar.W3;
        if (rVar != null) {
            rVar.setPadding(i10, 0, i11, 0);
        }
        wnVar.w7();
        wnVar.A7();
        wnVar.B9();
        boolean p10 = F8.a.p(8);
        if (wnVar.sb != p10) {
            wnVar.sb = p10;
            wnVar.j1.R();
        }
        fi.h1 h1Var = wnVar.C1;
        if (h1Var != null) {
            r0.i0.b(h1Var, F8);
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.bv0
    public void a(float[] fArr) {
        wn wnVar = this.a;
        fArr[1] = wnVar.x0.getBottom() - wnVar.Ra;
        fArr[0] = (wnVar.x0.getTop() + wnVar.I9) - AndroidUtilities.dp(4.0f);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
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
        return wnVar.h != null || wnVar.K9();
    }
}
