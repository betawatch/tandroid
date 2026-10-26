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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                ((fq) obj2).e.S = (String) obj;
                break;
            case 4:
                kr krVar = ((gr) obj2).d;
                krVar.z1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(krVar.c, krVar.q0);
                break;
            case 5:
                js.V((js) obj2, (TL_account.TL_birthday) obj);
                break;
            case 6:
                ((p10) obj2).e.c0(true);
                break;
            case 7:
                ((h50) obj2).c();
                break;
            case 8:
                Pattern pattern = LaunchActivity.D1;
                ((o90) obj2).run();
                break;
            case 9:
                ((tb0) obj2).Z();
                break;
            case 10:
                of0 of0Var = (of0) obj2;
                String str = (String) obj;
                of0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    of0Var.b.setLoading(false);
                    break;
                }
                break;
            case 11:
                ni0 ni0Var = (ni0) obj2;
                Integer num = (Integer) obj;
                ni0Var.getClass();
                boolean z10 = num.intValue() - ni0Var.d.d > AndroidUtilities.dp(20.0f);
                ni0Var.a0 = z10;
                ni0Var.c0.animate().translationY((z10 ? Math.min(ni0Var.b0, (ni0Var.E.getHeight() - num.intValue()) - ni0Var.c0.getMeasuredHeight()) : ni0Var.b0) - ni0Var.c0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.w).start();
                break;
            case 12:
                cj0 cj0Var = (cj0) obj2;
                cj0Var.j0 = (String) obj;
                y5 y5Var = cj0Var.t0;
                AndroidUtilities.cancelRunOnUIThread(y5Var);
                AndroidUtilities.runOnUIThread(y5Var, 100L);
                break;
            case 13:
                oj0 oj0Var = (oj0) obj2;
                oj0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    oj0Var.s();
                    break;
                }
                break;
            case 14:
                xj0 xj0Var = (xj0) obj2;
                Integer num2 = (Integer) obj;
                num2.getClass();
                HashSet hashSet = xj0Var.d;
                if (!hashSet.remove(num2)) {
                    hashSet.add(num2);
                }
                xj0.o0(xj0Var.b[0]);
                xj0Var.p0(true);
                break;
            case 15:
                lp0 lp0Var = (lp0) obj2;
                View view = (View) obj;
                rp0 rp0Var = lp0Var.p0;
                if (!(view instanceof op0)) {
                    if (!(view instanceof org.telegram.ui.Cells.v8)) {
                        if (!(view instanceof kp0)) {
                            if (!(view instanceof org.telegram.ui.Cells.q4)) {
                                if (!(view instanceof zo0)) {
                                    if (!(view instanceof qp0)) {
                                        if (view instanceof jp0) {
                                            ((jp0) view).updateColors();
                                            break;
                                        }
                                    } else {
                                        lp0Var.l((qp0) view);
                                        break;
                                    }
                                } else {
                                    ((zo0) view).d.invalidate();
                                    break;
                                }
                            } else {
                                view.setBackgroundColor(rp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.d6));
                                break;
                            }
                        } else {
                            view.setBackgroundColor(rp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.d6));
                            ((kp0) view).updateColors();
                            break;
                        }
                    } else {
                        view.setBackgroundColor(rp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.d6));
                        ((org.telegram.ui.Cells.v8) view).updateColors();
                        break;
                    }
                } else {
                    view.setBackgroundColor(rp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.d6));
                    ((op0) view).updateColors();
                    break;
                }
                break;
            case 16:
                super/*android.widget.LinearLayout*/.draw((Canvas) obj);
                break;
            case 17:
                ((jp0) obj2).c.e();
                break;
            case 18:
                ((fi.h1) obj2).E(((Integer) obj).intValue());
                break;
            case 19:
                fw0 fw0Var = (fw0) obj2;
                fw0Var.r = ((Integer) obj).intValue();
                View E1 = fw0Var.d.E1(4);
                if (E1 instanceof org.telegram.ui.Cells.i9) {
                    org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) E1;
                    if (i9Var.getFixedSize() <= 0 && fw0Var.r > 0) {
                        i9Var.setText(fw0Var.X());
                        fw0Var.W(true);
                        break;
                    }
                }
                fw0Var.d.g3.O(true);
                fw0Var.W(true);
                break;
            case 20:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.B0(true);
                break;
            case 21:
                org.telegram.ui.Components.z90[] z90VarArr = (org.telegram.ui.Components.z90[]) obj2;
                Boolean bool = (Boolean) obj;
                int i12 = ProfileActivity.R6;
                ViewPropertyAnimator scaleY = z90VarArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
                org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
                org.telegram.messenger.vh.q(scaleY, dsVar, 600L);
                z90VarArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(dsVar).setDuration(600L).start();
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
                ((af1) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                break;
            default:
                ((ph1) obj2).D(true);
                break;
        }
    }
}
