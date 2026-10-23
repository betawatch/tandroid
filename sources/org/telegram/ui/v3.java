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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
                AndroidUtilities.runOnUIThread(new i0(14, (cc) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new i0(20, (ie) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 3:
                ((aq) obj2).e.S = (String) obj;
                break;
            case 4:
                hr hrVar = ((dr) obj2).d;
                hrVar.A1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(hrVar.c, hrVar.r0);
                break;
            case 5:
                fs.U((fs) obj2, (TL_account.TL_birthday) obj);
                break;
            case 6:
                ((l10) obj2).e.Z(true);
                break;
            case 7:
                ((d50) obj2).c();
                break;
            case 8:
                Pattern pattern = LaunchActivity.C1;
                ((j90) obj2).run();
                break;
            case 9:
                ((qb0) obj2).Y();
                break;
            case 10:
                mf0 mf0Var = (mf0) obj2;
                String str = (String) obj;
                mf0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    mf0Var.b.setLoading(false);
                    break;
                }
                break;
            case 11:
                mi0 mi0Var = (mi0) obj2;
                Integer num = (Integer) obj;
                mi0Var.getClass();
                boolean z10 = num.intValue() - mi0Var.d.d > AndroidUtilities.dp(20.0f);
                mi0Var.a0 = z10;
                mi0Var.c0.animate().translationY((z10 ? Math.min(mi0Var.b0, (mi0Var.E.getHeight() - num.intValue()) - mi0Var.c0.getMeasuredHeight()) : mi0Var.b0) - mi0Var.c0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.o1.w).start();
                break;
            case 12:
                bj0 bj0Var = (bj0) obj2;
                bj0Var.j0 = (String) obj;
                a6 a6Var = bj0Var.t0;
                AndroidUtilities.cancelRunOnUIThread(a6Var);
                AndroidUtilities.runOnUIThread(a6Var, 100L);
                break;
            case 13:
                mj0 mj0Var = (mj0) obj2;
                mj0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    mj0Var.t();
                    break;
                }
                break;
            case 14:
                cp0 cp0Var = (cp0) obj2;
                View view = (View) obj;
                ip0 ip0Var = cp0Var.p0;
                if (!(view instanceof fp0)) {
                    if (!(view instanceof org.telegram.ui.Cells.q8)) {
                        if (!(view instanceof bp0)) {
                            if (!(view instanceof org.telegram.ui.Cells.l4)) {
                                if (!(view instanceof qo0)) {
                                    if (!(view instanceof hp0)) {
                                        if (view instanceof ap0) {
                                            ((ap0) view).a();
                                            break;
                                        }
                                    } else {
                                        cp0Var.l((hp0) view);
                                        break;
                                    }
                                } else {
                                    ((qo0) view).d.invalidate();
                                    break;
                                }
                            } else {
                                view.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                                break;
                            }
                        } else {
                            int i11 = org.telegram.ui.ActionBar.h6.d6;
                            view.setBackgroundColor(ip0Var.getThemedColor(i11));
                            bp0 bp0Var = (bp0) view;
                            ip0 ip0Var2 = bp0Var.d.p0;
                            bp0Var.setBackgroundColor(ip0Var2.getThemedColor(i11));
                            bp0Var.a.setTextColor(ip0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                            break;
                        }
                    } else {
                        view.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                        ((org.telegram.ui.Cells.q8) view).v();
                        break;
                    }
                } else {
                    view.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                    ((fp0) view).b();
                    break;
                }
                break;
            case 15:
                super/*android.widget.LinearLayout*/.draw((Canvas) obj);
                break;
            case 16:
                ((ap0) obj2).c.e();
                break;
            case 17:
                ((ei.h1) obj2).D(((Integer) obj).intValue());
                break;
            case 18:
                xv0 xv0Var = (xv0) obj2;
                xv0Var.s = ((Integer) obj).intValue();
                View z12 = xv0Var.d.z1(4);
                if (z12 instanceof org.telegram.ui.Cells.d9) {
                    org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) z12;
                    if (d9Var.getFixedSize() <= 0 && xv0Var.s > 0) {
                        d9Var.setText(xv0Var.W());
                        xv0Var.V(true);
                        break;
                    }
                }
                xv0Var.d.W2.N(true);
                xv0Var.V(true);
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
                org.telegram.messenger.nk.t(scaleY, bsVar, 600L);
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
                ((re1) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                break;
            default:
                ((hh1) obj2).D(true);
                break;
        }
    }
}
