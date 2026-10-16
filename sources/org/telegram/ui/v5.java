package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.yj0 yj0Var;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((w5) obj).a.x0(false);
                break;
            case 1:
                ((u9) obj).b.onFragmentDestroy();
                break;
            case 2:
                sd sdVar = (sd) obj;
                if (!sdVar.v.g()) {
                    sdVar.J.P(86);
                    sdVar.h.d();
                    break;
                } else {
                    sdVar.J.N(0, false, false);
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
                org.telegram.ui.Components.sc scVar = ((org.telegram.ui.Components.sc[]) obj)[0];
                if (scVar != null) {
                    scVar.b();
                    break;
                }
                break;
            case 5:
                zo zoVar = (zo) obj;
                if (!zoVar.s.g()) {
                    zoVar.R0.P(86);
                    zoVar.b0.e.d();
                    break;
                } else {
                    zoVar.R0.N(0, false, false);
                    break;
                }
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                break;
            case 7:
                p70 p70Var = (p70) obj;
                if (!p70Var.N.g()) {
                    p70Var.R.P(86);
                    p70Var.f.d();
                    break;
                } else {
                    p70Var.R.N(0, false, false);
                    break;
                }
            case 8:
                lf0 lf0Var = (lf0) obj;
                org.telegram.ui.Components.yj0 yj0Var2 = lf0Var.I;
                pd pdVar = lf0Var.n;
                if (!lf0Var.L.g()) {
                    pdVar.setAnimation(yj0Var2);
                    yj0Var2.P(86);
                    pdVar.setOnAnimationEndListener(new xd0(lf0Var, 2));
                    pdVar.d();
                    break;
                } else {
                    pdVar.setAnimation(yj0Var2);
                    yj0Var2.N(0, false, false);
                    lf0Var.K = true;
                    break;
                }
            case 9:
                ((org.telegram.ui.ActionBar.e3) obj).dismiss();
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
                if (!profileActivity.q0.g()) {
                    profileActivity.V.P(86);
                    profileActivity.W.P(86);
                    org.telegram.ui.Components.ei0 ei0Var = profileActivity.a0;
                    if (ei0Var != null) {
                        org.telegram.ui.Components.bi0 j10 = org.telegram.ui.Components.ei0.j(14, ei0Var.a);
                        if (j10 != null && (yj0Var = j10.k) != null) {
                            yj0Var.start();
                        }
                    } else {
                        profileActivity.v.d();
                    }
                    org.telegram.ui.Cells.r8 r8Var = profileActivity.M2;
                    if (r8Var != null) {
                        r8Var.getImageView().d();
                        break;
                    }
                } else {
                    profileActivity.V.N(0, false, false);
                    profileActivity.W.N(0, false, false);
                    break;
                }
                break;
            case 14:
                ((r71) obj).w(0.0f);
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
                ((cj1) obj).u0.b();
                break;
        }
    }
}
