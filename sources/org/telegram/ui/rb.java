package org.telegram.ui;

import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rb implements f5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rb(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // f5.d
    public final void accept(Object obj) {
        int i10 = this.a;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c(21, (wb) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c(27, (de) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 2:
                Pattern pattern = LaunchActivity.x1;
                ((j90) obj2).run();
                break;
            case 3:
                View view = (View) obj;
                yo0 yo0Var = ((to0) obj2).f0;
                if (!(view instanceof wo0)) {
                    if (!(view instanceof org.telegram.ui.Cells.m8)) {
                        if (!(view instanceof so0)) {
                            if (!(view instanceof org.telegram.ui.Cells.k4)) {
                                if (!(view instanceof jo0)) {
                                    if (!(view instanceof ih.g2)) {
                                        if (view instanceof ro0) {
                                            ((ro0) view).a();
                                            break;
                                        }
                                    } else {
                                        view.setBackgroundColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                                        ((ih.g2) view).b();
                                        break;
                                    }
                                } else {
                                    ((jo0) view).d.invalidate();
                                    break;
                                }
                            } else {
                                view.setBackgroundColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                                break;
                            }
                        } else {
                            int i11 = org.telegram.ui.ActionBar.g6.d6;
                            view.setBackgroundColor(yo0Var.getThemedColor(i11));
                            so0 so0Var = (so0) view;
                            yo0 yo0Var2 = so0Var.d.f0;
                            so0Var.setBackgroundColor(yo0Var2.getThemedColor(i11));
                            so0Var.a.setTextColor(yo0Var2.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                            break;
                        }
                    } else {
                        view.setBackgroundColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                        ((org.telegram.ui.Cells.m8) view).v();
                        break;
                    }
                } else {
                    view.setBackgroundColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                    ((wo0) view).b();
                    break;
                }
                break;
            case 4:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj2;
                Long l10 = (Long) obj;
                if (!o2Var.isFinished) {
                    if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
                        o2Var.presentFragment(ProfileActivity.m4(l10.longValue()), true);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new ef0(5));
                        break;
                    }
                }
                break;
            default:
                ((ze1) obj2).T = (TL_stories.TL_premium_boostsStatus) obj;
                break;
        }
    }
}
