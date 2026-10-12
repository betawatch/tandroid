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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class v3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        int i11 = 1;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ((x3) obj2).K.o0 = ((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f);
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new fc(r2 ? 1 : 0, (ic) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new fc(6, (qe) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 3:
                ((sq) obj2).e.S = (String) obj;
                break;
            case 4:
                yr yrVar = ((ur) obj2).d;
                yrVar.A1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(yrVar.c, yrVar.r0);
                break;
            case 5:
                ws.U((ws) obj2, (TL_account.TL_birthday) obj);
                break;
            case 6:
                ((i20) obj2).e.Z(true);
                break;
            case 7:
                ((a60) obj2).c();
                break;
            case 8:
                Pattern pattern = LaunchActivity.B1;
                ((fa0) obj2).run();
                break;
            case 9:
                ((rc0) obj2).Y();
                break;
            case 10:
                kg0 kg0Var = (kg0) obj2;
                String str = (String) obj;
                kg0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    kg0Var.b.setLoading(false);
                    break;
                }
                break;
            case 11:
                hj0 hj0Var = (hj0) obj2;
                Integer num = (Integer) obj;
                hj0Var.getClass();
                boolean z10 = num.intValue() - hj0Var.e.d > AndroidUtilities.dp(20.0f);
                hj0Var.b0 = z10;
                hj0Var.d0.animate().translationY((z10 ? Math.min(hj0Var.c0, (hj0Var.F.getHeight() - num.intValue()) - hj0Var.d0.getMeasuredHeight()) : hj0Var.c0) - hj0Var.d0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.o1.w).start();
                break;
            case 12:
                xj0 xj0Var = (xj0) obj2;
                xj0Var.j0 = (String) obj;
                a6 a6Var = xj0Var.t0;
                AndroidUtilities.cancelRunOnUIThread(a6Var);
                AndroidUtilities.runOnUIThread(a6Var, 100L);
                break;
            case 13:
                ik0 ik0Var = (ik0) obj2;
                ik0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ik0Var.t();
                    break;
                }
                break;
            case 14:
                aq0 aq0Var = (aq0) obj2;
                View view = (View) obj;
                gq0 gq0Var = aq0Var.p0;
                if (!(view instanceof dq0)) {
                    if (!(view instanceof org.telegram.ui.Cells.r8)) {
                        if (!(view instanceof zp0)) {
                            if (!(view instanceof org.telegram.ui.Cells.m4)) {
                                if (!(view instanceof op0)) {
                                    if (!(view instanceof fq0)) {
                                        if (view instanceof yp0) {
                                            ((yp0) view).a();
                                            break;
                                        }
                                    } else {
                                        aq0Var.l((fq0) view);
                                        break;
                                    }
                                } else {
                                    ((op0) view).d.invalidate();
                                    break;
                                }
                            } else {
                                view.setBackgroundColor(gq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                                break;
                            }
                        } else {
                            int i12 = org.telegram.ui.ActionBar.g6.d6;
                            view.setBackgroundColor(gq0Var.getThemedColor(i12));
                            zp0 zp0Var = (zp0) view;
                            gq0 gq0Var2 = zp0Var.d.p0;
                            zp0Var.setBackgroundColor(gq0Var2.getThemedColor(i12));
                            zp0Var.a.setTextColor(gq0Var2.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                            break;
                        }
                    } else {
                        view.setBackgroundColor(gq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                        ((org.telegram.ui.Cells.r8) view).v();
                        break;
                    }
                } else {
                    view.setBackgroundColor(gq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                    ((dq0) view).b();
                    break;
                }
                break;
            case 15:
                super/*android.widget.LinearLayout*/.draw((Canvas) obj);
                break;
            case 16:
                ((yp0) obj2).c.e();
                break;
            case 17:
                ((di.h1) obj2).D(((Integer) obj).intValue());
                break;
            case 18:
                zw0 zw0Var = (zw0) obj2;
                zw0Var.s = ((Integer) obj).intValue();
                View z12 = zw0Var.d.z1(4);
                if (z12 instanceof org.telegram.ui.Cells.e9) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) z12;
                    if (e9Var.getFixedSize() <= 0 && zw0Var.s > 0) {
                        e9Var.setText(zw0Var.W());
                        zw0Var.V(true);
                        break;
                    }
                }
                zw0Var.d.W2.N(true);
                zw0Var.V(true);
                break;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                break;
            case 20:
                org.telegram.ui.Components.da0[] da0VarArr = (org.telegram.ui.Components.da0[]) obj2;
                Boolean bool = (Boolean) obj;
                ViewPropertyAnimator scaleY = da0VarArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
                org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.h;
                org.telegram.messenger.yh.s(scaleY, esVar, 600L);
                da0VarArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(esVar).setDuration(600L).start();
                break;
            case 21:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                Long l4 = (Long) obj;
                if (!m2Var.isFinished) {
                    if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                        m2Var.presentFragment(ProfileActivity.m4(l4.longValue()), true);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new b31(i11));
                        break;
                    }
                }
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new hz0(10, (g31) obj2, (TLRPC.TL_exportedContactToken) obj));
                break;
            case 23:
                StickersActivity.b0((StickersActivity) obj2, (View) obj);
                break;
            case 24:
                ThemeActivity.U((ThemeActivity) obj2, (TL_account.contentSettings) obj);
                break;
            case 25:
                ((di.h1) obj2).D(((Integer) obj).intValue());
                break;
            case 26:
                ((lg1) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                break;
            default:
                ((dj1) obj2).D(true);
                break;
        }
    }
}
