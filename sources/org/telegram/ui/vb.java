package org.telegram.ui;

import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vb implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vb(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        int i10 = this.a;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.h(29, (ac) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new fc(5, (ke) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 2:
                Pattern pattern = LaunchActivity.y1;
                ((s90) obj2).run();
                break;
            case 3:
                View view = (View) obj;
                ip0 ip0Var = ((dp0) obj2).g0;
                if (!(view instanceof gp0)) {
                    if (!(view instanceof org.telegram.ui.Cells.o8)) {
                        if (!(view instanceof cp0)) {
                            if (!(view instanceof org.telegram.ui.Cells.m4)) {
                                if (!(view instanceof to0)) {
                                    if (!(view instanceof lh.f2)) {
                                        if (view instanceof bp0) {
                                            ((bp0) view).a();
                                            break;
                                        }
                                    } else {
                                        view.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                                        ((lh.f2) view).b();
                                        break;
                                    }
                                } else {
                                    ((to0) view).d.invalidate();
                                    break;
                                }
                            } else {
                                view.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                                break;
                            }
                        } else {
                            int i11 = org.telegram.ui.ActionBar.k6.d6;
                            view.setBackgroundColor(ip0Var.getThemedColor(i11));
                            cp0 cp0Var = (cp0) view;
                            ip0 ip0Var2 = cp0Var.d.g0;
                            cp0Var.setBackgroundColor(ip0Var2.getThemedColor(i11));
                            cp0Var.a.setTextColor(ip0Var2.getThemedColor(org.telegram.ui.ActionBar.k6.G6));
                            break;
                        }
                    } else {
                        view.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                        ((org.telegram.ui.Cells.o8) view).v();
                        break;
                    }
                } else {
                    view.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                    ((gp0) view).b();
                    break;
                }
                break;
            case 4:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj2;
                Long l10 = (Long) obj;
                if (!p2Var.isFinished) {
                    if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
                        p2Var.presentFragment(ProfileActivity.m4(l10.longValue()), true);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new sj0(3));
                        break;
                    }
                }
                break;
            default:
                ((mf1) obj2).U = (TL_stories.TL_premium_boostsStatus) obj;
                break;
        }
    }
}
