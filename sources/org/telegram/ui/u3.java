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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class u3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ((w3) obj2).K.o0 = ((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f);
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new h0(14, (cc) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new h0(20, (ie) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 3:
                ((cq) obj2).e.T = (String) obj;
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
                ((p10) obj2).e.b0(true);
                break;
            case 7:
                ((h50) obj2).c();
                break;
            case 8:
                Pattern pattern = LaunchActivity.E1;
                ((p90) obj2).run();
                break;
            case 9:
                ((wb0) obj2).Y();
                break;
            case 10:
                rf0 rf0Var = (rf0) obj2;
                String str = (String) obj;
                rf0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    rf0Var.b.setLoading(false);
                    break;
                }
                break;
            case 11:
                qi0 qi0Var = (qi0) obj2;
                Integer num = (Integer) obj;
                qi0Var.getClass();
                boolean z10 = num.intValue() - qi0Var.d.d > AndroidUtilities.dp(20.0f);
                qi0Var.a0 = z10;
                qi0Var.c0.animate().translationY((z10 ? Math.min(qi0Var.b0, (qi0Var.E.getHeight() - num.intValue()) - qi0Var.c0.getMeasuredHeight()) : qi0Var.b0) - qi0Var.c0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.o1.w).start();
                break;
            case 12:
                fj0 fj0Var = (fj0) obj2;
                fj0Var.j0 = (String) obj;
                z5 z5Var = fj0Var.t0;
                AndroidUtilities.cancelRunOnUIThread(z5Var);
                AndroidUtilities.runOnUIThread(z5Var, 100L);
                break;
            case 13:
                rj0 rj0Var = (rj0) obj2;
                rj0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    rj0Var.t();
                    break;
                }
                break;
            case 14:
                fp0 fp0Var = (fp0) obj2;
                View view = (View) obj;
                lp0 lp0Var = fp0Var.p0;
                if (!(view instanceof ip0)) {
                    if (!(view instanceof org.telegram.ui.Cells.r8)) {
                        if (!(view instanceof ep0)) {
                            if (!(view instanceof org.telegram.ui.Cells.l4)) {
                                if (!(view instanceof to0)) {
                                    if (!(view instanceof kp0)) {
                                        if (view instanceof dp0) {
                                            ((dp0) view).updateColors();
                                            break;
                                        }
                                    } else {
                                        fp0Var.l((kp0) view);
                                        break;
                                    }
                                } else {
                                    ((to0) view).d.invalidate();
                                    break;
                                }
                            } else {
                                view.setBackgroundColor(lp0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                                break;
                            }
                        } else {
                            view.setBackgroundColor(lp0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                            ((ep0) view).updateColors();
                            break;
                        }
                    } else {
                        view.setBackgroundColor(lp0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                        ((org.telegram.ui.Cells.r8) view).updateColors();
                        break;
                    }
                } else {
                    view.setBackgroundColor(lp0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                    ((ip0) view).updateColors();
                    break;
                }
                break;
            case 15:
                super/*android.widget.LinearLayout*/.draw((Canvas) obj);
                break;
            case 16:
                ((dp0) obj2).c.e();
                break;
            case 17:
                ((ei.h1) obj2).D(((Integer) obj).intValue());
                break;
            case 18:
                bw0 bw0Var = (bw0) obj2;
                bw0Var.v = ((Integer) obj).intValue();
                View E1 = bw0Var.d.E1(4);
                if (E1 instanceof org.telegram.ui.Cells.e9) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) E1;
                    if (e9Var.getFixedSize() <= 0 && bw0Var.v > 0) {
                        e9Var.setText(bw0Var.W());
                        bw0Var.V(true);
                        break;
                    }
                }
                bw0Var.d.Z2.N(true);
                bw0Var.V(true);
                break;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                break;
            case 20:
                org.telegram.ui.Components.y90[] y90VarArr = (org.telegram.ui.Components.y90[]) obj2;
                Boolean bool = (Boolean) obj;
                ViewPropertyAnimator scaleY = y90VarArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
                org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
                org.telegram.messenger.sl.t(scaleY, bsVar, 600L);
                y90VarArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(bsVar).setDuration(600L).start();
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
                ((ye1) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                break;
            default:
                ((oh1) obj2).D(true);
                break;
        }
    }
}
