package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r5(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.mi0 mi0Var;
        int i9 = this.a;
        Object obj = this.b;
        switch (i9) {
            case 0:
                ((s5) obj).a.v0(false);
                break;
            case 1:
                ((o9) obj).b.onFragmentDestroy();
                break;
            case 2:
                id idVar = (id) obj;
                if (!idVar.v.h()) {
                    idVar.F.N(86);
                    idVar.h.d();
                    break;
                } else {
                    idVar.F.L(0, false, false);
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
                org.telegram.ui.Components.gc gcVar = ((org.telegram.ui.Components.gc[]) obj)[0];
                if (gcVar != null) {
                    gcVar.b();
                    break;
                }
                break;
            case 5:
                ho hoVar = (ho) obj;
                if (!hoVar.s.h()) {
                    hoVar.N0.N(86);
                    hoVar.X.e.d();
                    break;
                } else {
                    hoVar.N0.L(0, false, false);
                    break;
                }
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                break;
            case 7:
                r60 r60Var = (r60) obj;
                if (!r60Var.J.h()) {
                    r60Var.N.N(86);
                    r60Var.f.d();
                    break;
                } else {
                    r60Var.N.L(0, false, false);
                    break;
                }
            case 8:
                qe0 qe0Var = (qe0) obj;
                org.telegram.ui.Components.mi0 mi0Var2 = qe0Var.E;
                fd fdVar = qe0Var.n;
                if (!qe0Var.H.h()) {
                    fdVar.setAnimation(mi0Var2);
                    mi0Var2.N(86);
                    fdVar.setOnAnimationEndListener(new bd0(qe0Var, 2));
                    fdVar.d();
                    break;
                } else {
                    fdVar.setAnimation(mi0Var2);
                    mi0Var2.L(0, false, false);
                    qe0Var.G = true;
                    break;
                }
            case 9:
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                tk0.a = null;
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
                ((PhotoViewer) obj).L1 = null;
                break;
            case 12:
                Drawable[] drawableArr = PhotoViewer.P8;
                ((Runnable) obj).run();
                break;
            case 13:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (!privacyControlActivity.o0.h()) {
                    privacyControlActivity.p0.N(86);
                    privacyControlActivity.q0.e.d();
                    break;
                } else {
                    privacyControlActivity.p0.L(0, false, false);
                    break;
                }
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (!profileActivity.m0.h()) {
                    profileActivity.R.N(86);
                    profileActivity.S.N(86);
                    org.telegram.ui.Components.pg0 pg0Var = profileActivity.W;
                    if (pg0Var != null) {
                        org.telegram.ui.Components.mg0 j10 = org.telegram.ui.Components.pg0.j(14, pg0Var.a);
                        if (j10 != null && (mi0Var = j10.k) != null) {
                            mi0Var.start();
                        }
                    } else {
                        profileActivity.v.d();
                    }
                    org.telegram.ui.Cells.p8 p8Var = profileActivity.I2;
                    if (p8Var != null) {
                        p8Var.getImageView().d();
                        break;
                    }
                } else {
                    profileActivity.R.L(0, false, false);
                    profileActivity.S.L(0, false, false);
                    break;
                }
                break;
            case 15:
                ((b61) obj).w(0.0f);
                break;
            case 16:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i10 = ShareActivity.b;
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
                ((mh1) obj).q0.b();
                break;
        }
    }
}
