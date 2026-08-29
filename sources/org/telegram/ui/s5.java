package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        org.telegram.ui.Components.xi0 xi0Var;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((t5) obj).a.w0(false);
                break;
            case 1:
                ((n9) obj).b.onFragmentDestroy();
                break;
            case 2:
                hd hdVar = (hd) obj;
                if (!hdVar.v.h()) {
                    hdVar.F.N(86);
                    hdVar.h.d();
                    break;
                } else {
                    hdVar.F.L(0, false, false);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj;
                if (s1Var != null) {
                    s1Var.F3(-1);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.mc mcVar = ((org.telegram.ui.Components.mc[]) obj)[0];
                if (mcVar != null) {
                    mcVar.b();
                    break;
                }
                break;
            case 5:
                ko koVar = (ko) obj;
                if (!koVar.s.h()) {
                    koVar.N0.N(86);
                    koVar.X.e.d();
                    break;
                } else {
                    koVar.N0.L(0, false, false);
                    break;
                }
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                break;
            case 7:
                t60 t60Var = (t60) obj;
                if (!t60Var.J.h()) {
                    t60Var.N.N(86);
                    t60Var.f.d();
                    break;
                } else {
                    t60Var.N.L(0, false, false);
                    break;
                }
            case 8:
                pe0 pe0Var = (pe0) obj;
                org.telegram.ui.Components.xi0 xi0Var2 = pe0Var.E;
                ed edVar = pe0Var.n;
                if (!pe0Var.H.h()) {
                    edVar.setAnimation(xi0Var2);
                    xi0Var2.N(86);
                    edVar.setOnAnimationEndListener(new dd0(pe0Var, 2));
                    edVar.d();
                    break;
                } else {
                    edVar.setAnimation(xi0Var2);
                    xi0Var2.L(0, false, false);
                    pe0Var.G = true;
                    break;
                }
            case 9:
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                pk0.a = null;
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
                    org.telegram.ui.Components.zg0 zg0Var = profileActivity.W;
                    if (zg0Var != null) {
                        org.telegram.ui.Components.wg0 j10 = org.telegram.ui.Components.zg0.j(14, zg0Var.a);
                        if (j10 != null && (xi0Var = j10.k) != null) {
                            xi0Var.start();
                        }
                    } else {
                        profileActivity.v.d();
                    }
                    org.telegram.ui.Cells.m8 m8Var = profileActivity.I2;
                    if (m8Var != null) {
                        m8Var.getImageView().d();
                        break;
                    }
                } else {
                    profileActivity.R.L(0, false, false);
                    profileActivity.S.L(0, false, false);
                    break;
                }
                break;
            case 15:
                ((d61) obj).w(0.0f);
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
                ((oh1) obj).q0.b();
                break;
        }
    }
}
