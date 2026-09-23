package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class s5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.yi0 yi0Var;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((t5) obj).a.w0(false);
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
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj;
                if (t1Var != null) {
                    t1Var.F3(-1);
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
                so soVar = (so) obj;
                if (!soVar.s.h()) {
                    soVar.R0.P(86);
                    soVar.b0.e.d();
                    break;
                } else {
                    soVar.R0.N(0, false, false);
                    break;
                }
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                break;
            case 7:
                i70 i70Var = (i70) obj;
                if (!i70Var.N.h()) {
                    i70Var.R.P(86);
                    i70Var.f.d();
                    break;
                } else {
                    i70Var.R.N(0, false, false);
                    break;
                }
            case 8:
                cf0 cf0Var = (cf0) obj;
                org.telegram.ui.Components.yi0 yi0Var2 = cf0Var.I;
                id idVar = cf0Var.n;
                if (!cf0Var.L.h()) {
                    idVar.setAnimation(yi0Var2);
                    yi0Var2.P(86);
                    idVar.setOnAnimationEndListener(new pd0(cf0Var, 2));
                    idVar.d();
                    break;
                } else {
                    idVar.setAnimation(yi0Var2);
                    yi0Var2.N(0, false, false);
                    cf0Var.K = true;
                    break;
                }
            case 9:
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                cl0.a = null;
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    f3VarArr[0] = null;
                    break;
                }
                break;
            case 10:
                ((org.telegram.ui.ActionBar.f3) obj).dismiss();
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
                    org.telegram.ui.Components.eh0 eh0Var = profileActivity.a0;
                    if (eh0Var != null) {
                        org.telegram.ui.Components.bh0 j3 = org.telegram.ui.Components.eh0.j(14, eh0Var.a);
                        if (j3 != null && (yi0Var = j3.k) != null) {
                            yi0Var.start();
                        }
                    } else {
                        profileActivity.v.d();
                    }
                    org.telegram.ui.Cells.s8 s8Var = profileActivity.M2;
                    if (s8Var != null) {
                        s8Var.getImageView().d();
                        break;
                    }
                } else {
                    profileActivity.V.N(0, false, false);
                    profileActivity.W.N(0, false, false);
                    break;
                }
                break;
            case 15:
                ((z61) obj).w(0.0f);
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
