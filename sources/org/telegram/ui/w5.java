package org.telegram.ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class w5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.Components.uj0 uj0Var;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((x5) obj).a.x0(false);
                break;
            case 1:
                ((s9) obj).b.onFragmentDestroy();
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
                org.telegram.ui.Components.qc qcVar = ((org.telegram.ui.Components.qc[]) obj)[0];
                if (qcVar != null) {
                    qcVar.b();
                    break;
                }
                break;
            case 5:
                io ioVar = (io) obj;
                if (!ioVar.s.g()) {
                    ioVar.R0.P(86);
                    ioVar.b0.e.d();
                    break;
                } else {
                    ioVar.R0.N(0, false, false);
                    break;
                }
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.x;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                break;
            case 7:
                s60 s60Var = (s60) obj;
                if (!s60Var.N.g()) {
                    s60Var.R.P(86);
                    s60Var.f.d();
                    break;
                } else {
                    s60Var.R.N(0, false, false);
                    break;
                }
            case 8:
                ne0 ne0Var = (ne0) obj;
                org.telegram.ui.Components.uj0 uj0Var2 = ne0Var.I;
                jd jdVar = ne0Var.n;
                if (!ne0Var.L.g()) {
                    jdVar.setAnimation(uj0Var2);
                    uj0Var2.P(86);
                    jdVar.setOnAnimationEndListener(new zc0(ne0Var, 2));
                    jdVar.d();
                    break;
                } else {
                    jdVar.setAnimation(uj0Var2);
                    uj0Var2.N(0, false, false);
                    ne0Var.K = true;
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
                if (!profileActivity.r0.g()) {
                    profileActivity.V.P(86);
                    profileActivity.W.P(86);
                    org.telegram.ui.Components.yh0 yh0Var = profileActivity.a0;
                    if (yh0Var != null) {
                        org.telegram.ui.Components.vh0 j10 = org.telegram.ui.Components.yh0.j(14, yh0Var.a);
                        if (j10 != null && (uj0Var = j10.k) != null) {
                            uj0Var.start();
                        }
                    } else {
                        profileActivity.v.d();
                    }
                    org.telegram.ui.Cells.q8 q8Var = profileActivity.N2;
                    if (q8Var != null) {
                        q8Var.getImageView().d();
                        break;
                    }
                } else {
                    profileActivity.V.N(0, false, false);
                    profileActivity.W.N(0, false, false);
                    break;
                }
                break;
            case 14:
                ((x51) obj).w(0.0f);
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
                ((hh1) obj).u0.b();
                break;
        }
    }
}
