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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                AndroidUtilities.runOnUIThread(new m4(12, (bc) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new m4(18, (je) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 3:
                ((kq) obj2).e.S = (String) obj;
                break;
            case 4:
                qr qrVar = ((mr) obj2).d;
                qrVar.A1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(qrVar.c, qrVar.r0);
                break;
            case 5:
                ns.U((ns) obj2, (TL_account.TL_birthday) obj);
                break;
            case 6:
                ((b20) obj2).e.Z(true);
                break;
            case 7:
                ((s50) obj2).c();
                break;
            case 8:
                Pattern pattern = LaunchActivity.B1;
                ((x90) obj2).run();
                break;
            case 9:
                ((ic0) obj2).Y();
                break;
            case 10:
                ag0 ag0Var = (ag0) obj2;
                String str = (String) obj;
                ag0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    ag0Var.b.setLoading(false);
                    break;
                }
                break;
            case 11:
                wi0 wi0Var = (wi0) obj2;
                Integer num = (Integer) obj;
                wi0Var.getClass();
                boolean z10 = num.intValue() - wi0Var.e.d > AndroidUtilities.dp(20.0f);
                wi0Var.b0 = z10;
                wi0Var.d0.animate().translationY((z10 ? Math.min(wi0Var.c0, (wi0Var.F.getHeight() - num.intValue()) - wi0Var.d0.getMeasuredHeight()) : wi0Var.c0) - wi0Var.d0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.w).start();
                break;
            case 12:
                lj0 lj0Var = (lj0) obj2;
                lj0Var.j0 = (String) obj;
                x5 x5Var = lj0Var.t0;
                AndroidUtilities.cancelRunOnUIThread(x5Var);
                AndroidUtilities.runOnUIThread(x5Var, 100L);
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
                op0 op0Var = (op0) obj2;
                View view = (View) obj;
                up0 up0Var = op0Var.p0;
                if (!(view instanceof rp0)) {
                    if (!(view instanceof org.telegram.ui.Cells.s8)) {
                        if (!(view instanceof np0)) {
                            if (!(view instanceof org.telegram.ui.Cells.m4)) {
                                if (!(view instanceof cp0)) {
                                    if (!(view instanceof tp0)) {
                                        if (view instanceof mp0) {
                                            ((mp0) view).a();
                                            break;
                                        }
                                    } else {
                                        op0Var.l((tp0) view);
                                        break;
                                    }
                                } else {
                                    ((cp0) view).d.invalidate();
                                    break;
                                }
                            } else {
                                view.setBackgroundColor(up0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                                break;
                            }
                        } else {
                            int i11 = org.telegram.ui.ActionBar.h6.d6;
                            view.setBackgroundColor(up0Var.getThemedColor(i11));
                            np0 np0Var = (np0) view;
                            up0 up0Var2 = np0Var.d.p0;
                            np0Var.setBackgroundColor(up0Var2.getThemedColor(i11));
                            np0Var.a.setTextColor(up0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                            break;
                        }
                    } else {
                        view.setBackgroundColor(up0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                        ((org.telegram.ui.Cells.s8) view).v();
                        break;
                    }
                } else {
                    view.setBackgroundColor(up0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                    ((rp0) view).b();
                    break;
                }
                break;
            case 15:
                super/*android.widget.LinearLayout*/.draw((Canvas) obj);
                break;
            case 16:
                ((mp0) obj2).c.e();
                break;
            case 17:
                ((ci.i1) obj2).D(((Integer) obj).intValue());
                break;
            case 18:
                mw0 mw0Var = (mw0) obj2;
                mw0Var.s = ((Integer) obj).intValue();
                View y12 = mw0Var.d.y1(4);
                if (y12 instanceof org.telegram.ui.Cells.f9) {
                    org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) y12;
                    if (f9Var.getFixedSize() <= 0 && mw0Var.s > 0) {
                        f9Var.setText(mw0Var.W());
                        mw0Var.V(true);
                        break;
                    }
                }
                mw0Var.d.Y2.N(true);
                mw0Var.V(true);
                break;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                break;
            case 20:
                org.telegram.ui.Components.d90[] d90VarArr = (org.telegram.ui.Components.d90[]) obj2;
                Boolean bool = (Boolean) obj;
                ViewPropertyAnimator scaleY = d90VarArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
                org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.h;
                org.telegram.messenger.ul.r(scaleY, rrVar, 600L);
                d90VarArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(rrVar).setDuration(600L).start();
                break;
            case 21:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                Long l4 = (Long) obj;
                if (!n2Var.isFinished) {
                    if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                        n2Var.presentFragment(ProfileActivity.m4(l4.longValue()), true);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.th(28));
                        break;
                    }
                }
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new by0(15, (r21) obj2, (TLRPC.TL_exportedContactToken) obj));
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
