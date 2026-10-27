package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u5(Object obj, int i10) {
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
                ((v5) obj).a.u0(false);
                break;
            case 1:
                ((u9) obj).b.onFragmentDestroy();
                break;
            case 2:
                nd ndVar = (nd) obj;
                if (!ndVar.w.g()) {
                    ndVar.K.P(86);
                    ndVar.n.d();
                    break;
                } else {
                    ndVar.K.N(0, false, false);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj;
                if (s1Var != null) {
                    s1Var.H3(-1);
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
                oo ooVar = (oo) obj;
                if (!ooVar.s.g()) {
                    ooVar.Q0.P(86);
                    ooVar.b0.e.d();
                    break;
                } else {
                    ooVar.Q0.N(0, false, false);
                    break;
                }
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                break;
            case 7:
                z60 z60Var = (z60) obj;
                if (!z60Var.N.g()) {
                    z60Var.R.P(86);
                    z60Var.f.d();
                    break;
                } else {
                    z60Var.R.N(0, false, false);
                    break;
                }
            case 8:
                te0 te0Var = (te0) obj;
                org.telegram.ui.Components.yj0 yj0Var2 = te0Var.I;
                kd kdVar = te0Var.n;
                if (!te0Var.L.g()) {
                    kdVar.setAnimation(yj0Var2);
                    yj0Var2.P(86);
                    kdVar.setOnAnimationEndListener(new dd0(te0Var, 2));
                    kdVar.d();
                    break;
                } else {
                    kdVar.setAnimation(yj0Var2);
                    yj0Var2.N(0, false, false);
                    te0Var.K = true;
                    break;
                }
            case 9:
                ((org.telegram.ui.ActionBar.k3) obj).dismiss();
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
                if (!privacyControlActivity.r0.g()) {
                    privacyControlActivity.s0.P(86);
                    privacyControlActivity.t0.e.d();
                    break;
                } else {
                    privacyControlActivity.s0.N(0, false, false);
                    break;
                }
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.q0.g()) {
                    profileActivity.U.P(86);
                    profileActivity.V.P(86);
                    org.telegram.ui.Components.ci0 ci0Var = profileActivity.Z;
                    if (ci0Var != null) {
                        org.telegram.ui.Components.zh0 j10 = org.telegram.ui.Components.ci0.j(14, ci0Var.a);
                        if (j10 != null && (yj0Var = j10.k) != null) {
                            yj0Var.start();
                        }
                    } else {
                        profileActivity.s.d();
                    }
                    org.telegram.ui.Cells.v8 v8Var = profileActivity.M2;
                    if (v8Var != null) {
                        v8Var.getImageView().d();
                        break;
                    }
                } else {
                    profileActivity.U.N(0, false, false);
                    profileActivity.V.N(0, false, false);
                    break;
                }
                break;
            case 14:
                ((f61) obj).w(0.0f);
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
                ((rh1) obj).u0.b();
                break;
        }
    }
}
