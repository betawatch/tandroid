package org.telegram.ui;

import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sb implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sb(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        int i9 = this.a;
        Object obj2 = this.b;
        switch (i9) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(24, (xb) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new rd(0, (fe) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 2:
                Pattern pattern = LaunchActivity.x1;
                ((f90) obj2).run();
                break;
            case 3:
                View view = (View) obj;
                zo0 zo0Var = ((uo0) obj2).f0;
                if (!(view instanceof xo0)) {
                    if (!(view instanceof org.telegram.ui.Cells.p8)) {
                        if (!(view instanceof to0)) {
                            if (!(view instanceof org.telegram.ui.Cells.m4)) {
                                if (!(view instanceof ko0)) {
                                    if (!(view instanceof fh.o2)) {
                                        if (view instanceof so0) {
                                            ((so0) view).a();
                                            break;
                                        }
                                    } else {
                                        view.setBackgroundColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                                        ((fh.o2) view).b();
                                        break;
                                    }
                                } else {
                                    ((ko0) view).d.invalidate();
                                    break;
                                }
                            } else {
                                view.setBackgroundColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                                break;
                            }
                        } else {
                            int i10 = org.telegram.ui.ActionBar.f6.d6;
                            view.setBackgroundColor(zo0Var.getThemedColor(i10));
                            to0 to0Var = (to0) view;
                            zo0 zo0Var2 = to0Var.d.f0;
                            to0Var.setBackgroundColor(zo0Var2.getThemedColor(i10));
                            to0Var.a.setTextColor(zo0Var2.getThemedColor(org.telegram.ui.ActionBar.f6.G6));
                            break;
                        }
                    } else {
                        view.setBackgroundColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                        ((org.telegram.ui.Cells.p8) view).v();
                        break;
                    }
                } else {
                    view.setBackgroundColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                    ((xo0) view).b();
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
                        AndroidUtilities.runOnUIThread(new lj0(3));
                        break;
                    }
                }
                break;
            default:
                ((we1) obj2).T = (TL_stories.TL_premium_boostsStatus) obj;
                break;
        }
    }
}
