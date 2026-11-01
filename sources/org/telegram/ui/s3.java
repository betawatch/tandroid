package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s3 implements org.telegram.messenger.r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.r20
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
                ns.Z((ns) obj2, (TL_account.TL_birthday) obj);
                break;
            case 6:
                py pyVar = (py) obj2;
                int intValue = ((Integer) obj).intValue();
                if (intValue != (pyVar.e ? 2 : pyVar.d ? 0 : 1)) {
                    pyVar.d = intValue == 0;
                    pyVar.e = intValue == 2;
                    jo joVar = pyVar.h;
                    if (joVar != null) {
                        joVar.a(Boolean.valueOf(pyVar.c), Boolean.valueOf(pyVar.d), Boolean.valueOf(pyVar.e));
                    }
                    if (pyVar.d && pyVar.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.k2 k2Var : pyVar.getParentLayout().getFragmentStack()) {
                            if (k2Var instanceof zx) {
                                ww wwVar = ((zx) k2Var).F3;
                                if (wwVar.c()) {
                                    wwVar.a();
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 7:
                ((e10) obj2).e.g0(true);
                break;
            case 8:
                ((n40) obj2).c();
                break;
            case 9:
                Pattern pattern = LaunchActivity.D1;
                ((t80) obj2).run();
                break;
            case 10:
                ((ab0) obj2).d0();
                break;
            case 11:
                re0 re0Var = (re0) obj2;
                String str = (String) obj;
                org.telegram.messenger.f8.b("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    re0Var.b.setLoading(false);
                    break;
                }
                break;
            case 12:
                ih0 ih0Var = (ih0) obj2;
                Integer num = (Integer) obj;
                ih0Var.getClass();
                boolean z10 = num.intValue() - ih0Var.d.d > org.telegram.messenger.i0.L(20.0f);
                ih0Var.a0 = z10;
                ih0Var.c0.animate().translationY((z10 ? Math.min(ih0Var.b0, (ih0Var.E.getHeight() - num.intValue()) - ih0Var.c0.getMeasuredHeight()) : ih0Var.b0) - ih0Var.c0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.m1.w).start();
                break;
            case 13:
                uh0 uh0Var = (uh0) obj2;
                uh0Var.b2 = (String) obj;
                m4 m4Var = uh0Var.l2;
                org.telegram.messenger.i0.r(m4Var);
                org.telegram.messenger.i0.h3(m4Var, 100L);
                break;
            case 14:
                ei0 ei0Var = (ei0) obj2;
                ei0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ei0Var.J0();
                    break;
                }
                break;
            case 15:
                ln0 ln0Var = (ln0) obj2;
                View view = (View) obj;
                rn0 rn0Var = ln0Var.p0;
                if (view instanceof on0) {
                    view.setBackgroundColor(rn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.d6));
                    ((on0) view).updateColors();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.p8) {
                    view.setBackgroundColor(rn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.d6));
                    ((org.telegram.ui.Cells.p8) view).updateColors();
                    break;
                } else if (view instanceof kn0) {
                    view.setBackgroundColor(rn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.d6));
                    ((kn0) view).updateColors();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.p4) {
                    view.setBackgroundColor(rn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.d6));
                    break;
                } else if (view instanceof an0) {
                    ((an0) view).d.invalidate();
                    break;
                } else if (view instanceof qn0) {
                    ln0Var.l((qn0) view);
                    break;
                } else if (view instanceof jn0) {
                    ((jn0) view).updateColors();
                    break;
                }
                break;
            case 16:
                super/*android.widget.LinearLayout*/.draw((Canvas) obj);
                break;
            case 17:
                ((jn0) obj2).c.e();
                break;
            case 18:
                ((hk) obj2).E(((Integer) obj).intValue());
                break;
            case 19:
                qt0 qt0Var = (qt0) obj2;
                qt0Var.r = ((Integer) obj).intValue();
                View B1 = qt0Var.d.B1(4);
                if (B1 instanceof org.telegram.ui.Cells.b9) {
                    org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) B1;
                    if (b9Var.getFixedSize() <= 0 && qt0Var.r > 0) {
                        b9Var.setText(qt0Var.b0());
                        qt0Var.a0(true);
                        break;
                    }
                }
                qt0Var.d.f3.O(true);
                qt0Var.a0(true);
                break;
            case 20:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.F0(true);
                break;
            case 21:
                org.telegram.ui.Components.p80[] p80VarArr = (org.telegram.ui.Components.p80[]) obj2;
                Boolean bool = (Boolean) obj;
                RectF rectF = ProfileActivity.S6;
                ViewPropertyAnimator scaleY = p80VarArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
                org.telegram.messenger.a30.m(scaleY, grVar, 600L);
                p80VarArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(grVar).setDuration(600L).start();
                break;
            case 22:
                StickersActivity.g0((StickersActivity) obj2, (View) obj);
                break;
            case 23:
                ThemeActivity.Z((ThemeActivity) obj2, (TL_account.contentSettings) obj);
                break;
            case 24:
                ((hk) obj2).E(((Integer) obj).intValue());
                break;
            case 25:
                ((nb1) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                break;
            default:
                ((zd1) obj2).D(true);
                break;
        }
    }
}
