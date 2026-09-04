package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        org.telegram.ui.Components.xi0 xi0Var;
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
                md mdVar = (md) obj;
                if (!mdVar.v.h()) {
                    mdVar.J.N(86);
                    mdVar.h.d();
                    break;
                } else {
                    mdVar.J.L(0, false, false);
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
                xo xoVar = (xo) obj;
                if (!xoVar.s.h()) {
                    xoVar.R0.N(86);
                    xoVar.b0.e.d();
                    break;
                } else {
                    xoVar.R0.L(0, false, false);
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
                    l70Var.R.N(86);
                    l70Var.f.d();
                    break;
                } else {
                    l70Var.R.L(0, false, false);
                    break;
                }
            case 8:
                hf0 hf0Var = (hf0) obj;
                org.telegram.ui.Components.xi0 xi0Var2 = hf0Var.I;
                jd jdVar = hf0Var.n;
                if (!hf0Var.L.h()) {
                    jdVar.setAnimation(xi0Var2);
                    xi0Var2.N(86);
                    jdVar.setOnAnimationEndListener(new ud0(hf0Var, 2));
                    jdVar.d();
                    break;
                } else {
                    jdVar.setAnimation(xi0Var2);
                    xi0Var2.L(0, false, false);
                    hf0Var.K = true;
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
                Drawable[] drawableArr = PhotoViewer.T8;
                ((Runnable) obj).run();
                break;
            case 13:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (!privacyControlActivity.s0.h()) {
                    privacyControlActivity.t0.N(86);
                    privacyControlActivity.u0.e.d();
                    break;
                } else {
                    privacyControlActivity.t0.L(0, false, false);
                    break;
                }
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.q0.h()) {
                    profileActivity.V.N(86);
                    profileActivity.W.N(86);
                    org.telegram.ui.Components.dh0 dh0Var = profileActivity.a0;
                    if (dh0Var != null) {
                        org.telegram.ui.Components.ah0 j3 = org.telegram.ui.Components.dh0.j(14, dh0Var.a);
                        if (j3 != null && (xi0Var = j3.k) != null) {
                            xi0Var.start();
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
                    profileActivity.V.L(0, false, false);
                    profileActivity.W.L(0, false, false);
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
                ((ui1) obj).u0.b();
                break;
        }
    }
}
