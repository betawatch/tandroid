package org.telegram.ui;

import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tb implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tb(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        int i10 = this.a;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(24, (yb) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new rd(0, (fe) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 2:
                Pattern pattern = LaunchActivity.x1;
                ((j90) obj2).run();
                break;
            case 3:
                View view = (View) obj;
                ap0 ap0Var = ((vo0) obj2).f0;
                if (!(view instanceof yo0)) {
                    if (!(view instanceof org.telegram.ui.Cells.l8)) {
                        if (!(view instanceof uo0)) {
                            if (!(view instanceof org.telegram.ui.Cells.j4)) {
                                if (!(view instanceof lo0)) {
                                    if (!(view instanceof gh.j2)) {
                                        if (view instanceof to0) {
                                            ((to0) view).a();
                                            break;
                                        }
                                    } else {
                                        view.setBackgroundColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                                        ((gh.j2) view).b();
                                        break;
                                    }
                                } else {
                                    ((lo0) view).d.invalidate();
                                    break;
                                }
                            } else {
                                view.setBackgroundColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                                break;
                            }
                        } else {
                            int i11 = org.telegram.ui.ActionBar.g6.d6;
                            view.setBackgroundColor(ap0Var.getThemedColor(i11));
                            uo0 uo0Var = (uo0) view;
                            ap0 ap0Var2 = uo0Var.d.f0;
                            uo0Var.setBackgroundColor(ap0Var2.getThemedColor(i11));
                            uo0Var.a.setTextColor(ap0Var2.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                            break;
                        }
                    } else {
                        view.setBackgroundColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                        ((org.telegram.ui.Cells.l8) view).v();
                        break;
                    }
                } else {
                    view.setBackgroundColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                    ((yo0) view).b();
                    break;
                }
                break;
            case 4:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                Long l10 = (Long) obj;
                if (!n2Var.isFinished) {
                    if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
                        n2Var.presentFragment(ProfileActivity.m4(l10.longValue()), true);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new tq0(2));
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
