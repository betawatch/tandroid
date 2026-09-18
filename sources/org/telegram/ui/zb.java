package org.telegram.ui;

import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zb implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zb(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        int i10 = this.a;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new l4(12, (ec) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new l4(18, (le) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 2:
                Pattern pattern = LaunchActivity.B1;
                ((ca0) obj2).run();
                break;
            case 3:
                wp0 wp0Var = (wp0) obj2;
                View view = (View) obj;
                cq0 cq0Var = wp0Var.p0;
                if (!(view instanceof zp0)) {
                    if (!(view instanceof org.telegram.ui.Cells.r8)) {
                        if (!(view instanceof vp0)) {
                            if (!(view instanceof org.telegram.ui.Cells.l4)) {
                                if (!(view instanceof kp0)) {
                                    if (!(view instanceof bq0)) {
                                        if (view instanceof up0) {
                                            ((up0) view).a();
                                            break;
                                        }
                                    } else {
                                        wp0Var.l((bq0) view);
                                        break;
                                    }
                                } else {
                                    ((kp0) view).d.invalidate();
                                    break;
                                }
                            } else {
                                view.setBackgroundColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                                break;
                            }
                        } else {
                            int i11 = org.telegram.ui.ActionBar.j6.d6;
                            view.setBackgroundColor(cq0Var.getThemedColor(i11));
                            vp0 vp0Var = (vp0) view;
                            cq0 cq0Var2 = vp0Var.d.p0;
                            vp0Var.setBackgroundColor(cq0Var2.getThemedColor(i11));
                            vp0Var.a.setTextColor(cq0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                            break;
                        }
                    } else {
                        view.setBackgroundColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                        ((org.telegram.ui.Cells.r8) view).v();
                        break;
                    }
                } else {
                    view.setBackgroundColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                    ((zp0) view).b();
                    break;
                }
                break;
            case 4:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj2;
                Long l4 = (Long) obj;
                if (!o2Var.isFinished) {
                    if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                        o2Var.presentFragment(ProfileActivity.m4(l4.longValue()), true);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sh(28));
                        break;
                    }
                }
                break;
            default:
                ((fg1) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                break;
        }
    }
}
