package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        org.telegram.ui.Components.hj0 hj0Var;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((s5) obj).a.w0(false);
                break;
            case 1:
                ((r9) obj).b.onFragmentDestroy();
                break;
            case 2:
                md mdVar = (md) obj;
                if (!mdVar.v.h()) {
                    mdVar.J.P(86);
                    mdVar.h.d();
                    break;
                } else {
                    mdVar.J.N(0, false, false);
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
                org.telegram.ui.Components.pc pcVar = ((org.telegram.ui.Components.pc[]) obj)[0];
                if (pcVar != null) {
                    pcVar.b();
                    break;
                }
                break;
            case 5:
                uo uoVar = (uo) obj;
                if (!uoVar.s.h()) {
                    uoVar.R0.P(86);
                    uoVar.b0.e.d();
                    break;
                } else {
                    uoVar.R0.N(0, false, false);
                    break;
                }
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                break;
            case 7:
                l70 l70Var = (l70) obj;
                if (!l70Var.N.h()) {
                    l70Var.R.P(86);
                    l70Var.f.d();
                    break;
                } else {
                    l70Var.R.N(0, false, false);
                    break;
                }
            case 8:
                jf0 jf0Var = (jf0) obj;
                org.telegram.ui.Components.hj0 hj0Var2 = jf0Var.I;
                jd jdVar = jf0Var.n;
                if (!jf0Var.L.h()) {
                    jdVar.setAnimation(hj0Var2);
                    hj0Var2.P(86);
                    jdVar.setOnAnimationEndListener(new wd0(jf0Var, 2));
                    jdVar.d();
                    break;
                } else {
                    jdVar.setAnimation(hj0Var2);
                    hj0Var2.N(0, false, false);
                    jf0Var.K = true;
                    break;
                }
            case 9:
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                ll0.a = null;
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
                    org.telegram.ui.Components.nh0 nh0Var = profileActivity.a0;
                    if (nh0Var != null) {
                        org.telegram.ui.Components.kh0 j3 = org.telegram.ui.Components.nh0.j(14, nh0Var.a);
                        if (j3 != null && (hj0Var = j3.k) != null) {
                            hj0Var.start();
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
                ((j71) obj).w(0.0f);
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
                ((ti1) obj).u0.b();
                break;
        }
    }
}
