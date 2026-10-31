package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class s3 implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        int i10 = this.a;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ((u3) obj2).K.o0 = ((Integer) obj).intValue() - org.telegram.messenger.i0.n > org.telegram.messenger.i0.L(20.0f);
                break;
            case 1:
                org.telegram.messenger.i0.g3(new h0(15, (zb) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 2:
                org.telegram.messenger.i0.g3(new h0(21, (le) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 3:
                ((hq) obj2).e.S = (String) obj;
                break;
            case 4:
                pr prVar = ((lr) obj2).d;
                prVar.z1 = ((Integer) obj).intValue();
                org.telegram.messenger.i0.Z3(prVar.q0, prVar.c);
                break;
            case 5:
                ns.Y((ns) obj2, (TL_account.TL_birthday) obj);
                break;
            case 6:
                qy qyVar = (qy) obj2;
                int intValue = ((Integer) obj).intValue();
                if (intValue != (qyVar.e ? 2 : qyVar.d ? 0 : 1)) {
                    qyVar.d = intValue == 0;
                    qyVar.e = intValue == 2;
                    jo joVar = qyVar.h;
                    if (joVar != null) {
                        joVar.a(Boolean.valueOf(qyVar.c), Boolean.valueOf(qyVar.d), Boolean.valueOf(qyVar.e));
                    }
                    if (qyVar.d && qyVar.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.k2 k2Var : qyVar.getParentLayout().getFragmentStack()) {
                            if (k2Var instanceof ay) {
                                xw xwVar = ((ay) k2Var).F3;
                                if (xwVar.c()) {
                                    xwVar.a();
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 7:
                ((f10) obj2).e.f0(true);
                break;
            case 8:
                ((o40) obj2).c();
                break;
            case 9:
                Pattern pattern = LaunchActivity.D1;
                ((u80) obj2).run();
                break;
            case 10:
                ((bb0) obj2).c0();
                break;
            case 11:
                se0 se0Var = (se0) obj2;
                String str = (String) obj;
                org.telegram.messenger.f8.b("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    se0Var.b.setLoading(false);
                    break;
                }
                break;
            case 12:
                kh0 kh0Var = (kh0) obj2;
                Integer num = (Integer) obj;
                kh0Var.getClass();
                boolean z10 = num.intValue() - kh0Var.d.d > org.telegram.messenger.i0.L(20.0f);
                kh0Var.a0 = z10;
                kh0Var.c0.animate().translationY((z10 ? Math.min(kh0Var.b0, (kh0Var.E.getHeight() - num.intValue()) - kh0Var.c0.getMeasuredHeight()) : kh0Var.b0) - kh0Var.c0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.m1.w).start();
                break;
            case 13:
                wh0 wh0Var = (wh0) obj2;
                wh0Var.b2 = (String) obj;
                m4 m4Var = wh0Var.l2;
                org.telegram.messenger.i0.r(m4Var);
                org.telegram.messenger.i0.h3(m4Var, 100L);
                break;
            case 14:
                gi0 gi0Var = (gi0) obj2;
                gi0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    gi0Var.J0();
                    break;
                }
                break;
            case 15:
                nn0 nn0Var = (nn0) obj2;
                View view = (View) obj;
                tn0 tn0Var = nn0Var.p0;
                if (view instanceof qn0) {
                    view.setBackgroundColor(tn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.d6));
                    ((qn0) view).updateColors();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.p8) {
                    view.setBackgroundColor(tn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.d6));
                    ((org.telegram.ui.Cells.p8) view).updateColors();
                    break;
                } else if (view instanceof mn0) {
                    view.setBackgroundColor(tn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.d6));
                    ((mn0) view).updateColors();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.p4) {
                    view.setBackgroundColor(tn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.d6));
                    break;
                } else if (view instanceof cn0) {
                    ((cn0) view).d.invalidate();
                    break;
                } else if (view instanceof sn0) {
                    nn0Var.l((sn0) view);
                    break;
                } else if (view instanceof ln0) {
                    ((ln0) view).updateColors();
                    break;
                }
                break;
            case 16:
                super/*android.widget.LinearLayout*/.draw((Canvas) obj);
                break;
            case 17:
                ((ln0) obj2).c.e();
                break;
            case 18:
                ((hk) obj2).E(((Integer) obj).intValue());
                break;
            case 19:
                rt0 rt0Var = (rt0) obj2;
                rt0Var.r = ((Integer) obj).intValue();
                View B1 = rt0Var.d.B1(4);
                if (B1 instanceof org.telegram.ui.Cells.b9) {
                    org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) B1;
                    if (b9Var.getFixedSize() <= 0 && rt0Var.r > 0) {
                        b9Var.setText(rt0Var.a0());
                        rt0Var.Z(true);
                        break;
                    }
                }
                rt0Var.d.f3.O(true);
                rt0Var.Z(true);
                break;
            case 20:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.E0(true);
                break;
            case 21:
                org.telegram.ui.Components.p80[] p80VarArr = (org.telegram.ui.Components.p80[]) obj2;
                Boolean bool = (Boolean) obj;
                RectF rectF = ProfileActivity.R6;
                ViewPropertyAnimator scaleY = p80VarArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
                org.telegram.messenger.z20.m(scaleY, grVar, 600L);
                p80VarArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(grVar).setDuration(600L).start();
                break;
            case 22:
                StickersActivity.f0((StickersActivity) obj2, (View) obj);
                break;
            case 23:
                ThemeActivity.Y((ThemeActivity) obj2, (TL_account.contentSettings) obj);
                break;
            case 24:
                ((hk) obj2).E(((Integer) obj).intValue());
                break;
            case 25:
                ((pb1) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                break;
            default:
                ((be1) obj2).D(true);
                break;
        }
    }
}
