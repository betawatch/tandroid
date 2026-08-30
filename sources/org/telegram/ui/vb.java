package org.telegram.ui;

import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                AndroidUtilities.runOnUIThread(new yb(0, (bc) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new yb(6, (ke) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 2:
                Pattern pattern = LaunchActivity.y1;
                ((r90) obj2).run();
                break;
            case 3:
                View view = (View) obj;
                gp0 gp0Var = ((bp0) obj2).g0;
                if (!(view instanceof ep0)) {
                    if (!(view instanceof org.telegram.ui.Cells.o8)) {
                        if (!(view instanceof ap0)) {
                            if (!(view instanceof org.telegram.ui.Cells.m4)) {
                                if (!(view instanceof ro0)) {
                                    if (!(view instanceof kh.g2)) {
                                        if (view instanceof zo0) {
                                            ((zo0) view).a();
                                            break;
                                        }
                                    } else {
                                        view.setBackgroundColor(gp0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                                        ((kh.g2) view).b();
                                        break;
                                    }
                                } else {
                                    ((ro0) view).d.invalidate();
                                    break;
                                }
                            } else {
                                view.setBackgroundColor(gp0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                                break;
                            }
                        } else {
                            int i11 = org.telegram.ui.ActionBar.j6.d6;
                            view.setBackgroundColor(gp0Var.getThemedColor(i11));
                            ap0 ap0Var = (ap0) view;
                            gp0 gp0Var2 = ap0Var.d.g0;
                            ap0Var.setBackgroundColor(gp0Var2.getThemedColor(i11));
                            ap0Var.a.setTextColor(gp0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                            break;
                        }
                    } else {
                        view.setBackgroundColor(gp0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                        ((org.telegram.ui.Cells.o8) view).v();
                        break;
                    }
                } else {
                    view.setBackgroundColor(gp0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                    ((ep0) view).b();
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
                        AndroidUtilities.runOnUIThread(new c21(1));
                        break;
                    }
                }
                break;
            default:
                ((kf1) obj2).U = (TL_stories.TL_premium_boostsStatus) obj;
                break;
        }
    }
}
