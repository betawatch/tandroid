package org.telegram.ui;

import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                AndroidUtilities.runOnUIThread(new n(15, (ec) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new n(21, (le) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 2:
                Pattern pattern = LaunchActivity.B1;
                ((aa0) obj2).run();
                break;
            case 3:
                up0 up0Var = (up0) obj2;
                View view = (View) obj;
                bq0 bq0Var = up0Var.p0;
                if (!(view instanceof xp0)) {
                    if (!(view instanceof org.telegram.ui.Cells.s8)) {
                        if (!(view instanceof tp0)) {
                            if (!(view instanceof org.telegram.ui.Cells.m4)) {
                                if (!(view instanceof ip0)) {
                                    if (!(view instanceof aq0)) {
                                        if (view instanceof sp0) {
                                            ((sp0) view).a();
                                            break;
                                        }
                                    } else {
                                        up0Var.l((aq0) view);
                                        break;
                                    }
                                } else {
                                    ((ip0) view).d.invalidate();
                                    break;
                                }
                            } else {
                                view.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                                break;
                            }
                        } else {
                            int i11 = org.telegram.ui.ActionBar.j6.d6;
                            view.setBackgroundColor(bq0Var.getThemedColor(i11));
                            tp0 tp0Var = (tp0) view;
                            bq0 bq0Var2 = tp0Var.d.p0;
                            tp0Var.setBackgroundColor(bq0Var2.getThemedColor(i11));
                            tp0Var.a.setTextColor(bq0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                            break;
                        }
                    } else {
                        view.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                        ((org.telegram.ui.Cells.s8) view).v();
                        break;
                    }
                } else {
                    view.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                    ((xp0) view).b();
                    break;
                }
                break;
            case 4:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj2;
                Long l4 = (Long) obj;
                if (!p2Var.isFinished) {
                    if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                        p2Var.presentFragment(ProfileActivity.m4(l4.longValue()), true);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c30(23));
                        break;
                    }
                }
                break;
            default:
                ((ig1) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                break;
        }
    }
}
