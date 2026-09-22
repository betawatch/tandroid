package org.telegram.ui;

import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                AndroidUtilities.runOnUIThread(new l4(12, (cc) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new l4(18, (je) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 2:
                Pattern pattern = LaunchActivity.B1;
                ((aa0) obj2).run();
                break;
            case 3:
                up0 up0Var = (up0) obj2;
                View view = (View) obj;
                aq0 aq0Var = up0Var.p0;
                if (!(view instanceof xp0)) {
                    if (!(view instanceof org.telegram.ui.Cells.r8)) {
                        if (!(view instanceof tp0)) {
                            if (!(view instanceof org.telegram.ui.Cells.m4)) {
                                if (!(view instanceof ip0)) {
                                    if (!(view instanceof zp0)) {
                                        if (view instanceof sp0) {
                                            ((sp0) view).a();
                                            break;
                                        }
                                    } else {
                                        up0Var.l((zp0) view);
                                        break;
                                    }
                                } else {
                                    ((ip0) view).d.invalidate();
                                    break;
                                }
                            } else {
                                view.setBackgroundColor(aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                                break;
                            }
                        } else {
                            int i11 = org.telegram.ui.ActionBar.i6.d6;
                            view.setBackgroundColor(aq0Var.getThemedColor(i11));
                            tp0 tp0Var = (tp0) view;
                            aq0 aq0Var2 = tp0Var.d.p0;
                            tp0Var.setBackgroundColor(aq0Var2.getThemedColor(i11));
                            tp0Var.a.setTextColor(aq0Var2.getThemedColor(org.telegram.ui.ActionBar.i6.G6));
                            break;
                        }
                    } else {
                        view.setBackgroundColor(aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                        ((org.telegram.ui.Cells.r8) view).v();
                        break;
                    }
                } else {
                    view.setBackgroundColor(aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                    ((xp0) view).b();
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
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sh(28));
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
