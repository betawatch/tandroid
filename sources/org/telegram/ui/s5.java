package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s5(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.ch0 ch0Var;
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                ((t5) obj).a.y0(false);
                break;
            case 1:
                ((n9) obj).j1.onFragmentDestroy();
                break;
            case 2:
                ad adVar = (ad) obj;
                if (!adVar.x.g()) {
                    adVar.L.P(86);
                    adVar.n.d();
                    break;
                } else {
                    adVar.L.N(0, false, false);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                if (q1Var != null) {
                    q1Var.d3(-1);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.ac acVar = ((org.telegram.ui.Components.ac[]) obj)[0];
                if (acVar != null) {
                    acVar.b();
                    break;
                }
                break;
            case 5:
                ln lnVar = (ln) obj;
                if (!lnVar.s.g()) {
                    lnVar.S0.P(86);
                    lnVar.c0.e.d();
                    break;
                } else {
                    lnVar.S0.N(0, false, false);
                    break;
                }
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.y;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                break;
            case 7:
                y40 y40Var = (y40) obj;
                if (!y40Var.O.g()) {
                    y40Var.S.P(86);
                    y40Var.f.d();
                    break;
                } else {
                    y40Var.S.N(0, false, false);
                    break;
                }
            case 8:
                nc0 nc0Var = (nc0) obj;
                org.telegram.ui.Components.ch0 ch0Var2 = nc0Var.J;
                xc xcVar = nc0Var.n;
                if (!nc0Var.M.g()) {
                    xcVar.setAnimation(ch0Var2);
                    ch0Var2.P(86);
                    xcVar.setOnAnimationEndListener(new xa0(nc0Var, 2));
                    xcVar.d();
                    break;
                } else {
                    xcVar.setAnimation(ch0Var2);
                    ch0Var2.N(0, false, false);
                    nc0Var.L = true;
                    break;
                }
            case 9:
                ((org.telegram.ui.ActionBar.t2) obj).dismiss();
                break;
            case 10:
                ((PhotoViewer) obj).Q1 = null;
                break;
            case 11:
                Drawable[] drawableArr = PhotoViewer.V8;
                ((Runnable) obj).run();
                break;
            case 12:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (!privacyControlActivity.u0.g()) {
                    privacyControlActivity.v0.P(86);
                    privacyControlActivity.w0.e.d();
                    break;
                } else {
                    privacyControlActivity.v0.N(0, false, false);
                    break;
                }
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.r0.g()) {
                    profileActivity.V.P(86);
                    profileActivity.W.P(86);
                    org.telegram.ui.Components.gf0 gf0Var = profileActivity.a0;
                    if (gf0Var != null) {
                        org.telegram.ui.Components.df0 i10 = org.telegram.ui.Components.gf0.i(14, gf0Var.a);
                        if (i10 != null && (ch0Var = i10.k) != null) {
                            ch0Var.start();
                        }
                    } else {
                        profileActivity.s.d();
                    }
                    org.telegram.ui.Cells.l8 l8Var = profileActivity.M2;
                    if (l8Var != null) {
                        l8Var.getImageView().d();
                        break;
                    }
                } else {
                    profileActivity.V.N(0, false, false);
                    profileActivity.W.N(0, false, false);
                    break;
                }
                break;
            case 14:
                ((g11) obj).w(0.0f);
                break;
            case 15:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.a = null;
                break;
            case 16:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.r = null;
                themeActivity.h = null;
                themeActivity.n = null;
                break;
            case 17:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().k(53, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                break;
            default:
                ((zb1) obj).v0.b();
                break;
        }
    }
}
