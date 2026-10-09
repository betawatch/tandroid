package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        org.telegram.ui.Components.ck0 ck0Var;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((s5) obj).a.x0(false);
                break;
            case 1:
                ((q9) obj).b.onFragmentDestroy();
                break;
            case 2:
                md mdVar = (md) obj;
                if (!mdVar.v.g()) {
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
                org.telegram.ui.Components.tc tcVar = ((org.telegram.ui.Components.tc[]) obj)[0];
                if (tcVar != null) {
                    tcVar.b();
                    break;
                }
                break;
            case 5:
                uo uoVar = (uo) obj;
                if (!uoVar.s.g()) {
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
                j70 j70Var = (j70) obj;
                if (!j70Var.N.g()) {
                    j70Var.R.P(86);
                    j70Var.f.d();
                    break;
                } else {
                    j70Var.R.N(0, false, false);
                    break;
                }
            case 8:
                gf0 gf0Var = (gf0) obj;
                org.telegram.ui.Components.ck0 ck0Var2 = gf0Var.I;
                jd jdVar = gf0Var.n;
                if (!gf0Var.L.g()) {
                    jdVar.setAnimation(ck0Var2);
                    ck0Var2.P(86);
                    jdVar.setOnAnimationEndListener(new td0(gf0Var, 2));
                    jdVar.d();
                    break;
                } else {
                    jdVar.setAnimation(ck0Var2);
                    ck0Var2.N(0, false, false);
                    gf0Var.K = true;
                    break;
                }
            case 9:
                ((org.telegram.ui.ActionBar.f3) obj).dismiss();
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
                    org.telegram.ui.Components.ii0 ii0Var = profileActivity.a0;
                    if (ii0Var != null) {
                        org.telegram.ui.Components.fi0 j3 = org.telegram.ui.Components.ii0.j(14, ii0Var.a);
                        if (j3 != null && (ck0Var = j3.k) != null) {
                            ck0Var.start();
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
                ((k71) obj).w(0.0f);
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
                ((wi1) obj).u0.b();
                break;
        }
    }
}
