package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x5(Object obj, int i10) {
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
                ((y5) obj).a.w0(false);
                break;
            case 1:
                ((t9) obj).b.onFragmentDestroy();
                break;
            case 2:
                pd pdVar = (pd) obj;
                if (!pdVar.v.h()) {
                    pdVar.G.N(86);
                    pdVar.h.d();
                    break;
                } else {
                    pdVar.G.L(0, false, false);
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
                org.telegram.ui.Components.ic icVar = ((org.telegram.ui.Components.ic[]) obj)[0];
                if (icVar != null) {
                    icVar.b();
                    break;
                }
                break;
            case 5:
                ro roVar = (ro) obj;
                if (!roVar.s.h()) {
                    roVar.O0.N(86);
                    roVar.Y.e.d();
                    break;
                } else {
                    roVar.O0.L(0, false, false);
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
                if (!g70Var.K.h()) {
                    g70Var.O.N(86);
                    g70Var.f.d();
                    break;
                } else {
                    g70Var.O.L(0, false, false);
                    break;
                }
            case 8:
                bf0 bf0Var = (bf0) obj;
                org.telegram.ui.Components.gj0 gj0Var2 = bf0Var.F;
                md mdVar = bf0Var.n;
                if (!bf0Var.I.h()) {
                    mdVar.setAnimation(gj0Var2);
                    gj0Var2.N(86);
                    mdVar.setOnAnimationEndListener(new od0(bf0Var, 2));
                    mdVar.d();
                    break;
                } else {
                    mdVar.setAnimation(gj0Var2);
                    gj0Var2.L(0, false, false);
                    bf0Var.H = true;
                    break;
                }
            case 9:
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) obj;
                zk0.a = null;
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
                    org.telegram.ui.Components.kh0 kh0Var = profileActivity.X;
                    if (kh0Var != null) {
                        org.telegram.ui.Components.hh0 j10 = org.telegram.ui.Components.kh0.j(14, kh0Var.a);
                        if (j10 != null && (gj0Var = j10.k) != null) {
                            gj0Var.start();
                        }
                    } else {
                        profileActivity.v.d();
                    }
                    org.telegram.ui.Cells.n8 n8Var = profileActivity.J2;
                    if (n8Var != null) {
                        n8Var.getImageView().d();
                        break;
                    }
                } else {
                    profileActivity.S.L(0, false, false);
                    profileActivity.T.L(0, false, false);
                    break;
                }
                break;
            case 15:
                ((x61) obj).w(0.0f);
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
                ((ii1) obj).r0.b();
                break;
        }
    }
}
