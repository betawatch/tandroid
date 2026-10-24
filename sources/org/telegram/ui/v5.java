package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
                ((s9) obj).b.onFragmentDestroy();
                break;
            case 2:
                md mdVar = (md) obj;
                if (!mdVar.w.g()) {
                    mdVar.K.P(86);
                    mdVar.n.d();
                    break;
                } else {
                    mdVar.K.N(0, false, false);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj;
                if (t1Var != null) {
                    t1Var.E3(-1);
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
                    koVar.Q0.P(86);
                    koVar.b0.e.d();
                    break;
                } else {
                    koVar.Q0.N(0, false, false);
                    break;
                }
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                break;
            case 7:
                w60 w60Var = (w60) obj;
                if (!w60Var.N.g()) {
                    w60Var.R.P(86);
                    w60Var.f.d();
                    break;
                } else {
                    w60Var.R.N(0, false, false);
                    break;
                }
            case 8:
                ue0 ue0Var = (ue0) obj;
                org.telegram.ui.Components.yj0 yj0Var2 = ue0Var.I;
                jd jdVar = ue0Var.n;
                if (!ue0Var.L.g()) {
                    jdVar.setAnimation(yj0Var2);
                    yj0Var2.P(86);
                    jdVar.setOnAnimationEndListener(new ed0(ue0Var, 2));
                    jdVar.d();
                    break;
                } else {
                    jdVar.setAnimation(yj0Var2);
                    yj0Var2.N(0, false, false);
                    ue0Var.K = true;
                    break;
                }
            case 9:
                ((org.telegram.ui.ActionBar.h3) obj).dismiss();
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
                if (!privacyControlActivity.t0.g()) {
                    privacyControlActivity.u0.P(86);
                    privacyControlActivity.v0.e.d();
                    break;
                } else {
                    privacyControlActivity.u0.N(0, false, false);
                    break;
                }
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.r0.g()) {
                    profileActivity.V.P(86);
                    profileActivity.W.P(86);
                    org.telegram.ui.Components.ci0 ci0Var = profileActivity.a0;
                    if (ci0Var != null) {
                        org.telegram.ui.Components.zh0 j10 = org.telegram.ui.Components.ci0.j(14, ci0Var.a);
                        if (j10 != null && (yj0Var = j10.k) != null) {
                            yj0Var.start();
                        }
                    } else {
                        profileActivity.v.d();
                    }
                    org.telegram.ui.Cells.r8 r8Var = profileActivity.N2;
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
                ((b61) obj).w(0.0f);
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
                ((oh1) obj).u0.b();
                break;
        }
    }
}
