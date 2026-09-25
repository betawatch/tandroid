package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.ij0 ij0Var;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((s5) obj).a.w0(false);
                break;
            case 1:
                ((q9) obj).b.onFragmentDestroy();
                break;
            case 2:
                ld ldVar = (ld) obj;
                if (!ldVar.v.h()) {
                    ldVar.J.P(86);
                    ldVar.h.d();
                    break;
                } else {
                    ldVar.J.N(0, false, false);
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
                ro roVar = (ro) obj;
                if (!roVar.s.h()) {
                    roVar.R0.P(86);
                    roVar.b0.e.d();
                    break;
                } else {
                    roVar.R0.N(0, false, false);
                    break;
                }
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                break;
            case 7:
                g70 g70Var = (g70) obj;
                if (!g70Var.N.h()) {
                    g70Var.R.P(86);
                    g70Var.f.d();
                    break;
                } else {
                    g70Var.R.N(0, false, false);
                    break;
                }
            case 8:
                bf0 bf0Var = (bf0) obj;
                org.telegram.ui.Components.ij0 ij0Var2 = bf0Var.I;
                id idVar = bf0Var.n;
                if (!bf0Var.L.h()) {
                    idVar.setAnimation(ij0Var2);
                    ij0Var2.P(86);
                    idVar.setOnAnimationEndListener(new od0(bf0Var, 2));
                    idVar.d();
                    break;
                } else {
                    idVar.setAnimation(ij0Var2);
                    ij0Var2.N(0, false, false);
                    bf0Var.K = true;
                    break;
                }
            case 9:
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) obj;
                cl0.a = null;
                org.telegram.ui.ActionBar.e3 e3Var = e3VarArr[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                    e3VarArr[0] = null;
                    break;
                }
                break;
            case 10:
                ((org.telegram.ui.ActionBar.e3) obj).dismiss();
                break;
            case 11:
                ((PhotoViewer) obj).P1 = null;
                break;
            case 12:
                Drawable[] drawableArr = PhotoViewer.U8;
                ((Runnable) obj).run();
                break;
            case 13:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (!privacyControlActivity.s0.h()) {
                    privacyControlActivity.t0.P(86);
                    privacyControlActivity.u0.e.d();
                    break;
                } else {
                    privacyControlActivity.t0.N(0, false, false);
                    break;
                }
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.q0.h()) {
                    profileActivity.V.P(86);
                    profileActivity.W.P(86);
                    org.telegram.ui.Components.oh0 oh0Var = profileActivity.a0;
                    if (oh0Var != null) {
                        org.telegram.ui.Components.lh0 j3 = org.telegram.ui.Components.oh0.j(14, oh0Var.a);
                        if (j3 != null && (ij0Var = j3.k) != null) {
                            ij0Var.start();
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
            case 15:
                ((a71) obj).w(0.0f);
                break;
            case 16:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i11 = ShareActivity.b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.a = null;
                break;
            case 17:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.r = null;
                themeActivity.h = null;
                themeActivity.n = null;
                break;
            case 18:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                break;
            default:
                ((mi1) obj).u0.b();
                break;
        }
    }
}
