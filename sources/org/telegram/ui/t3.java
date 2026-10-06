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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.g6(16, (dc) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.g6(22, (me) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 3:
                ((lq) obj2).e.S = (String) obj;
                break;
            case 4:
                rr rrVar = ((nr) obj2).d;
                rrVar.A1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(rrVar.c, rrVar.r0);
                break;
            case 5:
                qs.S((qs) obj2, (TL_account.TL_birthday) obj);
                break;
            case 6:
                ((d20) obj2).e.Y(true);
                break;
            case 7:
                ((u50) obj2).c();
                break;
            case 8:
                Pattern pattern = LaunchActivity.B1;
                ((aa0) obj2).run();
                break;
            case 9:
                ((lc0) obj2).X();
                break;
            case 10:
                dg0 dg0Var = (dg0) obj2;
                String str = (String) obj;
                dg0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    dg0Var.b.setLoading(false);
                    break;
                }
                break;
            case 11:
                zi0 zi0Var = (zi0) obj2;
                Integer num = (Integer) obj;
                zi0Var.getClass();
                boolean z10 = num.intValue() - zi0Var.e.d > AndroidUtilities.dp(20.0f);
                zi0Var.b0 = z10;
                zi0Var.d0.animate().translationY((z10 ? Math.min(zi0Var.c0, (zi0Var.F.getHeight() - num.intValue()) - zi0Var.d0.getMeasuredHeight()) : zi0Var.c0) - zi0Var.d0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.w).start();
                break;
            case 12:
                oj0 oj0Var = (oj0) obj2;
                oj0Var.j0 = (String) obj;
                x5 x5Var = oj0Var.t0;
                AndroidUtilities.cancelRunOnUIThread(x5Var);
                AndroidUtilities.runOnUIThread(x5Var, 100L);
                break;
            case 13:
                ak0 ak0Var = (ak0) obj2;
                ak0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ak0Var.r();
                    break;
                }
                break;
            case 14:
                qp0 qp0Var = (qp0) obj2;
                View view = (View) obj;
                wp0 wp0Var = qp0Var.p0;
                if (!(view instanceof tp0)) {
                    if (!(view instanceof org.telegram.ui.Cells.r8)) {
                        if (!(view instanceof pp0)) {
                            if (!(view instanceof org.telegram.ui.Cells.m4)) {
                                if (!(view instanceof ep0)) {
                                    if (!(view instanceof vp0)) {
                                        if (view instanceof op0) {
                                            ((op0) view).a();
                                            break;
                                        }
                                    } else {
                                        qp0Var.l((vp0) view);
                                        break;
                                    }
                                } else {
                                    ((ep0) view).d.invalidate();
                                    break;
                                }
                            } else {
                                view.setBackgroundColor(wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                                break;
                            }
                        } else {
                            int i11 = org.telegram.ui.ActionBar.i6.d6;
                            view.setBackgroundColor(wp0Var.getThemedColor(i11));
                            pp0 pp0Var = (pp0) view;
                            wp0 wp0Var2 = pp0Var.d.p0;
                            pp0Var.setBackgroundColor(wp0Var2.getThemedColor(i11));
                            pp0Var.a.setTextColor(wp0Var2.getThemedColor(org.telegram.ui.ActionBar.i6.G6));
                            break;
                        }
                    } else {
                        view.setBackgroundColor(wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                        ((org.telegram.ui.Cells.r8) view).v();
                        break;
                    }
                } else {
                    view.setBackgroundColor(wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                    ((tp0) view).b();
                    break;
                }
                break;
            case 15:
                super/*android.widget.LinearLayout*/.draw((Canvas) obj);
                break;
            case 16:
                ((op0) obj2).c.e();
                break;
            case 17:
                ((ci.i1) obj2).E(((Integer) obj).intValue());
                break;
            case 18:
                nw0 nw0Var = (nw0) obj2;
                nw0Var.s = ((Integer) obj).intValue();
                View z12 = nw0Var.d.z1(4);
                if (z12 instanceof org.telegram.ui.Cells.e9) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) z12;
                    if (e9Var.getFixedSize() <= 0 && nw0Var.s > 0) {
                        e9Var.setText(nw0Var.U());
                        nw0Var.T(true);
                        break;
                    }
                }
                nw0Var.d.f3.N(true);
                nw0Var.T(true);
                break;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                break;
            case 20:
                org.telegram.ui.Components.q90[] q90VarArr = (org.telegram.ui.Components.q90[]) obj2;
                Boolean bool = (Boolean) obj;
                ViewPropertyAnimator scaleY = q90VarArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
                org.telegram.ui.Components.tr trVar = org.telegram.ui.Components.tr.h;
                org.telegram.messenger.bi.r(scaleY, trVar, 600L);
                q90VarArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(trVar).setDuration(600L).start();
                break;
            case 21:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                Long l4 = (Long) obj;
                if (!n2Var.isFinished) {
                    if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                        n2Var.presentFragment(ProfileActivity.m4(l4.longValue()), true);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new n21(r2 ? 1 : 0));
                        break;
                    }
                }
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new wx0(18, (s21) obj2, (TLRPC.TL_exportedContactToken) obj));
                break;
            case 23:
                StickersActivity.b0((StickersActivity) obj2, (View) obj);
                break;
            case 24:
                ThemeActivity.S((ThemeActivity) obj2, (TL_account.contentSettings) obj);
                break;
            case 25:
                ((ci.i1) obj2).E(((Integer) obj).intValue());
                break;
            case 26:
                ((wf1) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                break;
            default:
                ((ki1) obj2).E(true);
                break;
        }
    }
}
