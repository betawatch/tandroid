package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        org.telegram.ui.Components.gj0 gj0Var;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((w5) obj).a.w0(false);
                break;
            case 1:
                ((r9) obj).b.onFragmentDestroy();
                break;
            case 2:
                nd ndVar = (nd) obj;
                if (!ndVar.v.h()) {
                    ndVar.G.N(86);
                    ndVar.h.d();
                    break;
                } else {
                    ndVar.G.L(0, false, false);
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
                org.telegram.ui.Components.ic icVar = ((org.telegram.ui.Components.ic[]) obj)[0];
                if (icVar != null) {
                    icVar.b();
                    break;
                }
                break;
            case 5:
                po poVar = (po) obj;
                if (!poVar.s.h()) {
                    poVar.O0.N(86);
                    poVar.Y.e.d();
                    break;
                } else {
                    poVar.O0.L(0, false, false);
                    break;
                }
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                break;
            case 7:
                e70 e70Var = (e70) obj;
                if (!e70Var.K.h()) {
                    e70Var.O.N(86);
                    e70Var.f.d();
                    break;
                } else {
                    e70Var.O.L(0, false, false);
                    break;
                }
            case 8:
                ze0 ze0Var = (ze0) obj;
                org.telegram.ui.Components.gj0 gj0Var2 = ze0Var.F;
                kd kdVar = ze0Var.n;
                if (!ze0Var.I.h()) {
                    kdVar.setAnimation(gj0Var2);
                    gj0Var2.N(86);
                    kdVar.setOnAnimationEndListener(new md0(ze0Var, 2));
                    kdVar.d();
                    break;
                } else {
                    kdVar.setAnimation(gj0Var2);
                    gj0Var2.L(0, false, false);
                    ze0Var.H = true;
                    break;
                }
            case 9:
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) obj;
                xk0.a = null;
                org.telegram.ui.ActionBar.g3 g3Var = g3VarArr[0];
                if (g3Var != null) {
                    g3Var.dismiss();
                    g3VarArr[0] = null;
                    break;
                }
                break;
            case 10:
                ((org.telegram.ui.ActionBar.g3) obj).dismiss();
                break;
            case 11:
                ((PhotoViewer) obj).M1 = null;
                break;
            case 12:
                Drawable[] drawableArr = PhotoViewer.Q8;
                ((Runnable) obj).run();
                break;
            case 13:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (!privacyControlActivity.p0.h()) {
                    privacyControlActivity.q0.N(86);
                    privacyControlActivity.r0.e.d();
                    break;
                } else {
                    privacyControlActivity.q0.L(0, false, false);
                    break;
                }
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.n0.h()) {
                    profileActivity.S.N(86);
                    profileActivity.T.N(86);
                    org.telegram.ui.Components.jh0 jh0Var = profileActivity.X;
                    if (jh0Var != null) {
                        org.telegram.ui.Components.gh0 j10 = org.telegram.ui.Components.jh0.j(14, jh0Var.a);
                        if (j10 != null && (gj0Var = j10.k) != null) {
                            gj0Var.start();
                        }
                    } else {
                        profileActivity.v.d();
                    }
                    org.telegram.ui.Cells.o8 o8Var = profileActivity.J2;
                    if (o8Var != null) {
                        o8Var.getImageView().d();
                        break;
                    }
                } else {
                    profileActivity.S.L(0, false, false);
                    profileActivity.T.L(0, false, false);
                    break;
                }
                break;
            case 15:
                ((q61) obj).w(0.0f);
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
                ((ai1) obj).r0.b();
                break;
        }
    }
}
