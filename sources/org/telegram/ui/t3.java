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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(19, (cc) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(25, (ke) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 3:
                ((mq) obj2).e.S = (String) obj;
                break;
            case 4:
                tr trVar = ((pr) obj2).d;
                trVar.A1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(trVar.c, trVar.r0);
                break;
            case 5:
                qs.U((qs) obj2, (TL_account.TL_birthday) obj);
                break;
            case 6:
                ((c20) obj2).e.Z(true);
                break;
            case 7:
                ((t50) obj2).c();
                break;
            case 8:
                Pattern pattern = LaunchActivity.B1;
                ((aa0) obj2).run();
                break;
            case 9:
                ((mc0) obj2).Y();
                break;
            case 10:
                fg0 fg0Var = (fg0) obj2;
                String str = (String) obj;
                fg0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    fg0Var.b.setLoading(false);
                    break;
                }
                break;
            case 11:
                dj0 dj0Var = (dj0) obj2;
                Integer num = (Integer) obj;
                dj0Var.getClass();
                boolean z10 = num.intValue() - dj0Var.e.d > AndroidUtilities.dp(20.0f);
                dj0Var.b0 = z10;
                dj0Var.d0.animate().translationY((z10 ? Math.min(dj0Var.c0, (dj0Var.F.getHeight() - num.intValue()) - dj0Var.d0.getMeasuredHeight()) : dj0Var.c0) - dj0Var.d0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.w).start();
                break;
            case 12:
                sj0 sj0Var = (sj0) obj2;
                sj0Var.j0 = (String) obj;
                w5 w5Var = sj0Var.t0;
                AndroidUtilities.cancelRunOnUIThread(w5Var);
                AndroidUtilities.runOnUIThread(w5Var, 100L);
                break;
            case 13:
                dk0 dk0Var = (dk0) obj2;
                dk0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    dk0Var.t();
                    break;
                }
                break;
            case 14:
                up0 up0Var = (up0) obj2;
                View view = (View) obj;
                aq0 aq0Var = up0Var.p0;
                if (!(view instanceof xp0)) {
                    if (!(view instanceof org.telegram.ui.Cells.r8)) {
                        if (!(view instanceof tp0)) {
                            if (!(view instanceof org.telegram.ui.Cells.m4)) {
                                if (!(view instanceof ip0)) {
                                    if (!(view instanceof zp0)) {
                                        if (view instanceof sp0) {
                                            ((sp0) view).a();
                                            break;
                                        }
                                    } else {
                                        up0Var.l((zp0) view);
                                        break;
                                    }
                                } else {
                                    ((ip0) view).d.invalidate();
                                    break;
                                }
                            } else {
                                view.setBackgroundColor(aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                                break;
                            }
                        } else {
                            int i11 = org.telegram.ui.ActionBar.i6.d6;
                            view.setBackgroundColor(aq0Var.getThemedColor(i11));
                            tp0 tp0Var = (tp0) view;
                            aq0 aq0Var2 = tp0Var.d.p0;
                            tp0Var.setBackgroundColor(aq0Var2.getThemedColor(i11));
                            tp0Var.a.setTextColor(aq0Var2.getThemedColor(org.telegram.ui.ActionBar.i6.G6));
                            break;
                        }
                    } else {
                        view.setBackgroundColor(aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                        ((org.telegram.ui.Cells.r8) view).v();
                        break;
                    }
                } else {
                    view.setBackgroundColor(aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                    ((xp0) view).b();
                    break;
                }
                break;
            case 15:
                super/*android.widget.LinearLayout*/.draw((Canvas) obj);
                break;
            case 16:
                ((sp0) obj2).c.e();
                break;
            case 17:
                ((ci.h1) obj2).D(((Integer) obj).intValue());
                break;
            case 18:
                tw0 tw0Var = (tw0) obj2;
                tw0Var.s = ((Integer) obj).intValue();
                View z12 = tw0Var.d.z1(4);
                if (z12 instanceof org.telegram.ui.Cells.e9) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) z12;
                    if (e9Var.getFixedSize() <= 0 && tw0Var.s > 0) {
                        e9Var.setText(tw0Var.W());
                        tw0Var.V(true);
                        break;
                    }
                }
                tw0Var.d.W2.N(true);
                tw0Var.V(true);
                break;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                break;
            case 20:
                org.telegram.ui.Components.ea0[] ea0VarArr = (org.telegram.ui.Components.ea0[]) obj2;
                Boolean bool = (Boolean) obj;
                ViewPropertyAnimator scaleY = ea0VarArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
                org.telegram.ui.Components.hs hsVar = org.telegram.ui.Components.hs.h;
                org.telegram.messenger.bi.t(scaleY, hsVar, 600L);
                ea0VarArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(hsVar).setDuration(600L).start();
                break;
            case 21:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                Long l4 = (Long) obj;
                if (!n2Var.isFinished) {
                    if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                        n2Var.presentFragment(ProfileActivity.m4(l4.longValue()), true);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new t21(r2 ? 1 : 0));
                        break;
                    }
                }
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new rt0(29, (y21) obj2, (TLRPC.TL_exportedContactToken) obj));
                break;
            case 23:
                StickersActivity.b0((StickersActivity) obj2, (View) obj);
                break;
            case 24:
                ThemeActivity.U((ThemeActivity) obj2, (TL_account.contentSettings) obj);
                break;
            case 25:
                ((ci.h1) obj2).D(((Integer) obj).intValue());
                break;
            case 26:
                ((fg1) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                break;
            default:
                ((wi1) obj2).D(true);
                break;
        }
    }
}
