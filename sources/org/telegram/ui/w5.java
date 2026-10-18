package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.uj0 uj0Var;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((x5) obj).a.x0(false);
                break;
            case 1:
                ((t9) obj).b.onFragmentDestroy();
                break;
            case 2:
                od odVar = (od) obj;
                if (!odVar.v.g()) {
                    odVar.J.P(86);
                    odVar.h.d();
                    break;
                } else {
                    odVar.J.N(0, false, false);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj;
                if (u1Var != null) {
                    u1Var.F3(-1);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.qc qcVar = ((org.telegram.ui.Components.qc[]) obj)[0];
                if (qcVar != null) {
                    qcVar.b();
                    break;
                }
                break;
            case 5:
                ko koVar = (ko) obj;
                if (!koVar.s.g()) {
                    koVar.R0.P(86);
                    koVar.b0.e.d();
                    break;
                } else {
                    koVar.R0.N(0, false, false);
                    break;
                }
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                break;
            case 7:
                u60 u60Var = (u60) obj;
                if (!u60Var.N.g()) {
                    u60Var.R.P(86);
                    u60Var.f.d();
                    break;
                } else {
                    u60Var.R.N(0, false, false);
                    break;
                }
            case 8:
                pe0 pe0Var = (pe0) obj;
                org.telegram.ui.Components.uj0 uj0Var2 = pe0Var.I;
                ld ldVar = pe0Var.n;
                if (!pe0Var.L.g()) {
                    ldVar.setAnimation(uj0Var2);
                    uj0Var2.P(86);
                    ldVar.setOnAnimationEndListener(new bd0(pe0Var, 2));
                    ldVar.d();
                    break;
                } else {
                    ldVar.setAnimation(uj0Var2);
                    uj0Var2.N(0, false, false);
                    pe0Var.K = true;
                    break;
                }
            case 9:
                ((org.telegram.ui.ActionBar.f3) obj).dismiss();
                break;
            case 10:
                ((PhotoViewer) obj).P1 = null;
                break;
            case 11:
                Drawable[] drawableArr = PhotoViewer.U8;
                ((Runnable) obj).run();
                break;
            case 12:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (!privacyControlActivity.s0.g()) {
                    privacyControlActivity.t0.P(86);
                    privacyControlActivity.u0.e.d();
                    break;
                } else {
                    privacyControlActivity.t0.N(0, false, false);
                    break;
                }
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.r0.g()) {
                    profileActivity.V.P(86);
                    profileActivity.W.P(86);
                    org.telegram.ui.Components.yh0 yh0Var = profileActivity.a0;
                    if (yh0Var != null) {
                        org.telegram.ui.Components.vh0 j10 = org.telegram.ui.Components.yh0.j(14, yh0Var.a);
                        if (j10 != null && (uj0Var = j10.k) != null) {
                            uj0Var.start();
                        }
                    } else {
                        profileActivity.v.d();
                    }
                    org.telegram.ui.Cells.q8 q8Var = profileActivity.N2;
                    if (q8Var != null) {
                        q8Var.getImageView().d();
                        break;
                    }
                } else {
                    profileActivity.V.N(0, false, false);
                    profileActivity.W.N(0, false, false);
                    break;
                }
                break;
            case 14:
                ((z51) obj).w(0.0f);
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
                twoStepVerificationActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                break;
            default:
                ((jh1) obj).u0.b();
                break;
        }
    }
}
