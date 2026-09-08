package org.telegram.ui;

import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class xb implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xb(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        int i10 = this.a;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c6(18, (cc) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c6(24, (ke) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 2:
                Pattern pattern = LaunchActivity.B1;
                ((ba0) obj2).run();
                break;
            case 3:
                vp0 vp0Var = (vp0) obj2;
                View view = (View) obj;
                bq0 bq0Var = vp0Var.p0;
                if (!(view instanceof yp0)) {
                    if (!(view instanceof org.telegram.ui.Cells.r8)) {
                        if (!(view instanceof up0)) {
                            if (!(view instanceof org.telegram.ui.Cells.l4)) {
                                if (!(view instanceof jp0)) {
                                    if (!(view instanceof aq0)) {
                                        if (view instanceof tp0) {
                                            ((tp0) view).a();
                                            break;
                                        }
                                    } else {
                                        vp0Var.l((aq0) view);
                                        break;
                                    }
                                } else {
                                    ((jp0) view).d.invalidate();
                                    break;
                                }
                            } else {
                                view.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                                break;
                            }
                        } else {
                            int i11 = org.telegram.ui.ActionBar.j6.d6;
                            view.setBackgroundColor(bq0Var.getThemedColor(i11));
                            up0 up0Var = (up0) view;
                            bq0 bq0Var2 = up0Var.d.p0;
                            up0Var.setBackgroundColor(bq0Var2.getThemedColor(i11));
                            up0Var.a.setTextColor(bq0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                            break;
                        }
                    } else {
                        view.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                        ((org.telegram.ui.Cells.r8) view).v();
                        break;
                    }
                } else {
                    view.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                    ((yp0) view).b();
                    break;
                }
                break;
            case 4:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                Long l4 = (Long) obj;
                if (!n2Var.isFinished) {
                    if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                        n2Var.presentFragment(ProfileActivity.m4(l4.longValue()), true);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ue(29));
                        break;
                    }
                }
                break;
            default:
                ((eg1) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                break;
        }
    }
}
