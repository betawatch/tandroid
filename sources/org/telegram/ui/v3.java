package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ((x3) obj2).K.o0 = ((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f);
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new i0(14, (ec) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new i0(20, (ke) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 3:
                ((cq) obj2).e.S = (String) obj;
                break;
            case 4:
                jr jrVar = ((fr) obj2).d;
                jrVar.A1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(jrVar.c, jrVar.r0);
                break;
            case 5:
                hs.U((hs) obj2, (TL_account.TL_birthday) obj);
                break;
            case 6:
                ((n10) obj2).e.Z(true);
                break;
            case 7:
                ((f50) obj2).c();
                break;
            case 8:
                Pattern pattern = LaunchActivity.C1;
                ((l90) obj2).run();
                break;
            case 9:
                ((sb0) obj2).Y();
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
                oi0 oi0Var = (oi0) obj2;
                Integer num = (Integer) obj;
                oi0Var.getClass();
                boolean z10 = num.intValue() - oi0Var.e.d > AndroidUtilities.dp(20.0f);
                oi0Var.b0 = z10;
                oi0Var.d0.animate().translationY((z10 ? Math.min(oi0Var.c0, (oi0Var.F.getHeight() - num.intValue()) - oi0Var.d0.getMeasuredHeight()) : oi0Var.c0) - oi0Var.d0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.o1.w).start();
                break;
            case 12:
                dj0 dj0Var = (dj0) obj2;
                dj0Var.j0 = (String) obj;
                a6 a6Var = dj0Var.t0;
                AndroidUtilities.cancelRunOnUIThread(a6Var);
                AndroidUtilities.runOnUIThread(a6Var, 100L);
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
                dp0 dp0Var = (dp0) obj2;
                View view = (View) obj;
                jp0 jp0Var = dp0Var.p0;
                if (!(view instanceof gp0)) {
                    if (!(view instanceof org.telegram.ui.Cells.q8)) {
                        if (!(view instanceof cp0)) {
                            if (!(view instanceof org.telegram.ui.Cells.l4)) {
                                if (!(view instanceof ro0)) {
                                    if (!(view instanceof ip0)) {
                                        if (view instanceof bp0) {
                                            ((bp0) view).a();
                                            break;
                                        }
                                    } else {
                                        dp0Var.l((ip0) view);
                                        break;
                                    }
                                } else {
                                    ((ro0) view).d.invalidate();
                                    break;
                                }
                            } else {
                                view.setBackgroundColor(jp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                                break;
                            }
                        } else {
                            int i11 = org.telegram.ui.ActionBar.h6.d6;
                            view.setBackgroundColor(jp0Var.getThemedColor(i11));
                            cp0 cp0Var = (cp0) view;
                            jp0 jp0Var2 = cp0Var.d.p0;
                            cp0Var.setBackgroundColor(jp0Var2.getThemedColor(i11));
                            cp0Var.a.setTextColor(jp0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                            break;
                        }
                    } else {
                        view.setBackgroundColor(jp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                        ((org.telegram.ui.Cells.q8) view).v();
                        break;
                    }
                } else {
                    view.setBackgroundColor(jp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                    ((gp0) view).b();
                    break;
                }
                break;
            case 15:
                super/*android.widget.LinearLayout*/.draw((Canvas) obj);
                break;
            case 16:
                ((bp0) obj2).c.e();
                break;
            case 17:
                ((ei.h1) obj2).D(((Integer) obj).intValue());
                break;
            case 18:
                zv0 zv0Var = (zv0) obj2;
                zv0Var.s = ((Integer) obj).intValue();
                View z12 = zv0Var.d.z1(4);
                if (z12 instanceof org.telegram.ui.Cells.d9) {
                    org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) z12;
                    if (d9Var.getFixedSize() <= 0 && zv0Var.s > 0) {
                        d9Var.setText(zv0Var.W());
                        zv0Var.V(true);
                        break;
                    }
                }
                zv0Var.d.W2.N(true);
                zv0Var.V(true);
                break;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                break;
            case 20:
                org.telegram.ui.Components.x90[] x90VarArr = (org.telegram.ui.Components.x90[]) obj2;
                Boolean bool = (Boolean) obj;
                ViewPropertyAnimator scaleY = x90VarArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
                org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
                org.telegram.messenger.wh.t(scaleY, bsVar, 600L);
                x90VarArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(bsVar).setDuration(600L).start();
                break;
            case 21:
                StickersActivity.b0((StickersActivity) obj2, (View) obj);
                break;
            case 22:
                ThemeActivity.U((ThemeActivity) obj2, (TL_account.contentSettings) obj);
                break;
            case 23:
                ((ei.h1) obj2).D(((Integer) obj).intValue());
                break;
            case 24:
                ((te1) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                break;
            default:
                ((jh1) obj2).D(true);
                break;
        }
    }
}
