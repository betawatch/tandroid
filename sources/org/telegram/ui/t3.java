package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        int i11 = 1;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ((v3) obj2).K.o0 = ((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f);
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.m0(25, (dc) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ed(i11, (ke) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 3:
                ((hq) obj2).e.S = (String) obj;
                break;
            case 4:
                mr mrVar = ((ir) obj2).d;
                mrVar.z1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(mrVar.c, mrVar.q0);
                break;
            case 5:
                ls.V((ls) obj2, (TL_account.TL_birthday) obj);
                break;
            case 6:
                ((r10) obj2).e.c0(true);
                break;
            case 7:
                ((j50) obj2).c();
                break;
            case 8:
                Pattern pattern = LaunchActivity.D1;
                ((q90) obj2).run();
                break;
            case 9:
                ((wb0) obj2).Z();
                break;
            case 10:
                qf0 qf0Var = (qf0) obj2;
                String str = (String) obj;
                qf0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    qf0Var.b.setLoading(false);
                    break;
                }
                break;
            case 11:
                pi0 pi0Var = (pi0) obj2;
                Integer num = (Integer) obj;
                pi0Var.getClass();
                boolean z10 = num.intValue() - pi0Var.d.d > AndroidUtilities.dp(20.0f);
                pi0Var.a0 = z10;
                pi0Var.c0.animate().translationY((z10 ? Math.min(pi0Var.b0, (pi0Var.E.getHeight() - num.intValue()) - pi0Var.c0.getMeasuredHeight()) : pi0Var.b0) - pi0Var.c0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.w).start();
                break;
            case 12:
                ej0 ej0Var = (ej0) obj2;
                ej0Var.j0 = (String) obj;
                y5 y5Var = ej0Var.t0;
                AndroidUtilities.cancelRunOnUIThread(y5Var);
                AndroidUtilities.runOnUIThread(y5Var, 100L);
                break;
            case 13:
                qj0 qj0Var = (qj0) obj2;
                qj0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    qj0Var.s();
                    break;
                }
                break;
            case 14:
                zj0 zj0Var = (zj0) obj2;
                Integer num2 = (Integer) obj;
                num2.getClass();
                HashSet hashSet = zj0Var.d;
                if (!hashSet.remove(num2)) {
                    hashSet.add(num2);
                }
                zj0.o0(zj0Var.b[0]);
                zj0Var.p0(true);
                break;
            case 15:
                np0 np0Var = (np0) obj2;
                View view = (View) obj;
                tp0 tp0Var = np0Var.p0;
                if (!(view instanceof qp0)) {
                    if (!(view instanceof org.telegram.ui.Cells.v8)) {
                        if (!(view instanceof mp0)) {
                            if (!(view instanceof org.telegram.ui.Cells.q4)) {
                                if (!(view instanceof bp0)) {
                                    if (!(view instanceof sp0)) {
                                        if (view instanceof lp0) {
                                            ((lp0) view).updateColors();
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
                                view.setBackgroundColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.d6));
                                break;
                            }
                        } else {
                            view.setBackgroundColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.d6));
                            ((mp0) view).updateColors();
                            break;
                        }
                    } else {
                        view.setBackgroundColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.d6));
                        ((org.telegram.ui.Cells.v8) view).updateColors();
                        break;
                    }
                } else {
                    view.setBackgroundColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.d6));
                    ((qp0) view).updateColors();
                    break;
                }
                break;
            case 16:
                super/*android.widget.LinearLayout*/.draw((Canvas) obj);
                break;
            case 17:
                ((lp0) obj2).c.e();
                break;
            case 18:
                ((fi.h1) obj2).E(((Integer) obj).intValue());
                break;
            case 19:
                hw0 hw0Var = (hw0) obj2;
                hw0Var.r = ((Integer) obj).intValue();
                View E1 = hw0Var.d.E1(4);
                if (E1 instanceof org.telegram.ui.Cells.i9) {
                    org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) E1;
                    if (i9Var.getFixedSize() <= 0 && hw0Var.r > 0) {
                        i9Var.setText(hw0Var.X());
                        hw0Var.W(true);
                        break;
                    }
                }
                hw0Var.d.g3.O(true);
                hw0Var.W(true);
                break;
            case 20:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.B0(true);
                break;
            case 21:
                org.telegram.ui.Components.aa0[] aa0VarArr = (org.telegram.ui.Components.aa0[]) obj2;
                Boolean bool = (Boolean) obj;
                int i12 = ProfileActivity.R6;
                ViewPropertyAnimator scaleY = aa0VarArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
                org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
                org.telegram.messenger.wh.q(scaleY, dsVar, 600L);
                aa0VarArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(dsVar).setDuration(600L).start();
                break;
            case 22:
                StickersActivity.c0((StickersActivity) obj2, (View) obj);
                break;
            case 23:
                ThemeActivity.V((ThemeActivity) obj2, (TL_account.contentSettings) obj);
                break;
            case 24:
                ((fi.h1) obj2).E(((Integer) obj).intValue());
                break;
            case 25:
                ((cf1) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                break;
            default:
                ((rh1) obj2).D(true);
                break;
        }
    }
}
