package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ((v3) obj2).K.o0 = ((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f);
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.a6(18, (bc) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.a6(24, (je) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 3:
                ((jq) obj2).e.S = (String) obj;
                break;
            case 4:
                pr prVar = ((lr) obj2).d;
                prVar.A1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(prVar.c, prVar.r0);
                break;
            case 5:
                ms.U((ms) obj2, (TL_account.TL_birthday) obj);
                break;
            case 6:
                ((z10) obj2).e.Z(true);
                break;
            case 7:
                ((q50) obj2).c();
                break;
            case 8:
                Pattern pattern = LaunchActivity.B1;
                ((w90) obj2).run();
                break;
            case 9:
                ((hc0) obj2).Y();
                break;
            case 10:
                zf0 zf0Var = (zf0) obj2;
                String str = (String) obj;
                zf0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    zf0Var.b.setLoading(false);
                    break;
                }
                break;
            case 11:
                vi0 vi0Var = (vi0) obj2;
                Integer num = (Integer) obj;
                vi0Var.getClass();
                boolean z10 = num.intValue() - vi0Var.e.d > AndroidUtilities.dp(20.0f);
                vi0Var.b0 = z10;
                vi0Var.d0.animate().translationY((z10 ? Math.min(vi0Var.c0, (vi0Var.F.getHeight() - num.intValue()) - vi0Var.d0.getMeasuredHeight()) : vi0Var.c0) - vi0Var.d0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.o1.w).start();
                break;
            case 12:
                lj0 lj0Var = (lj0) obj2;
                lj0Var.j0 = (String) obj;
                w5 w5Var = lj0Var.t0;
                AndroidUtilities.cancelRunOnUIThread(w5Var);
                AndroidUtilities.runOnUIThread(w5Var, 100L);
                break;
            case 13:
                wj0 wj0Var = (wj0) obj2;
                wj0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    wj0Var.r();
                    break;
                }
                break;
            case 14:
                np0 np0Var = (np0) obj2;
                View view = (View) obj;
                tp0 tp0Var = np0Var.p0;
                if (!(view instanceof qp0)) {
                    if (!(view instanceof org.telegram.ui.Cells.r8)) {
                        if (!(view instanceof mp0)) {
                            if (!(view instanceof org.telegram.ui.Cells.m4)) {
                                if (!(view instanceof bp0)) {
                                    if (!(view instanceof sp0)) {
                                        if (view instanceof lp0) {
                                            ((lp0) view).a();
                                            break;
                                        }
                                    } else {
                                        np0Var.l((sp0) view);
                                        break;
                                    }
                                } else {
                                    ((bp0) view).d.invalidate();
                                    break;
                                }
                            } else {
                                view.setBackgroundColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                                break;
                            }
                        } else {
                            int i11 = org.telegram.ui.ActionBar.h6.d6;
                            view.setBackgroundColor(tp0Var.getThemedColor(i11));
                            mp0 mp0Var = (mp0) view;
                            tp0 tp0Var2 = mp0Var.d.p0;
                            mp0Var.setBackgroundColor(tp0Var2.getThemedColor(i11));
                            mp0Var.a.setTextColor(tp0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                            break;
                        }
                    } else {
                        view.setBackgroundColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                        ((org.telegram.ui.Cells.r8) view).v();
                        break;
                    }
                } else {
                    view.setBackgroundColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                    ((qp0) view).b();
                    break;
                }
                break;
            case 15:
                super/*android.widget.LinearLayout*/.draw((Canvas) obj);
                break;
            case 16:
                ((lp0) obj2).c.e();
                break;
            case 17:
                ((ci.i1) obj2).D(((Integer) obj).intValue());
                break;
            case 18:
                kw0 kw0Var = (kw0) obj2;
                kw0Var.s = ((Integer) obj).intValue();
                View y12 = kw0Var.d.y1(4);
                if (y12 instanceof org.telegram.ui.Cells.e9) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) y12;
                    if (e9Var.getFixedSize() <= 0 && kw0Var.s > 0) {
                        e9Var.setText(kw0Var.W());
                        kw0Var.V(true);
                        break;
                    }
                }
                kw0Var.d.Y2.N(true);
                kw0Var.V(true);
                break;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                break;
            case 20:
                org.telegram.ui.Components.n90[] n90VarArr = (org.telegram.ui.Components.n90[]) obj2;
                Boolean bool = (Boolean) obj;
                ViewPropertyAnimator scaleY = n90VarArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
                org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.h;
                org.telegram.messenger.ok.s(scaleY, rrVar, 600L);
                n90VarArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(rrVar).setDuration(600L).start();
                break;
            case 21:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                Long l4 = (Long) obj;
                if (!m2Var.isFinished) {
                    if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                        m2Var.presentFragment(ProfileActivity.m4(l4.longValue()), true);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new l21(r2 ? 1 : 0));
                        break;
                    }
                }
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new ix0(21, (q21) obj2, (TLRPC.TL_exportedContactToken) obj));
                break;
            case 23:
                StickersActivity.b0((StickersActivity) obj2, (View) obj);
                break;
            case 24:
                ThemeActivity.U((ThemeActivity) obj2, (TL_account.contentSettings) obj);
                break;
            case 25:
                ((ci.i1) obj2).D(((Integer) obj).intValue());
                break;
            case 26:
                ((wf1) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                break;
            default:
                ((mi1) obj2).E(true);
                break;
        }
    }
}
