package org.telegram.ui;

import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xb implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xb(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        int i10 = this.a;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.h(29, (cc) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new hc(5, (me) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 2:
                Pattern pattern = LaunchActivity.y1;
                ((t90) obj2).run();
                break;
            case 3:
                hp0 hp0Var = (hp0) obj2;
                View view = (View) obj;
                np0 np0Var = hp0Var.m0;
                if (!(view instanceof kp0)) {
                    if (!(view instanceof org.telegram.ui.Cells.n8)) {
                        if (!(view instanceof gp0)) {
                            if (!(view instanceof org.telegram.ui.Cells.l4)) {
                                if (!(view instanceof vo0)) {
                                    if (!(view instanceof mp0)) {
                                        if (view instanceof fp0) {
                                            ((fp0) view).a();
                                            break;
                                        }
                                    } else {
                                        hp0Var.l((mp0) view);
                                        break;
                                    }
                                } else {
                                    ((vo0) view).d.invalidate();
                                    break;
                                }
                            } else {
                                view.setBackgroundColor(np0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                                break;
                            }
                        } else {
                            int i11 = org.telegram.ui.ActionBar.j6.d6;
                            view.setBackgroundColor(np0Var.getThemedColor(i11));
                            gp0 gp0Var = (gp0) view;
                            np0 np0Var2 = gp0Var.d.m0;
                            gp0Var.setBackgroundColor(np0Var2.getThemedColor(i11));
                            gp0Var.a.setTextColor(np0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                            break;
                        }
                    } else {
                        view.setBackgroundColor(np0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                        ((org.telegram.ui.Cells.n8) view).v();
                        break;
                    }
                } else {
                    view.setBackgroundColor(np0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                    ((kp0) view).b();
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
                        AndroidUtilities.runOnUIThread(new j21(1));
                        break;
                    }
                }
                break;
            default:
                ((sf1) obj2).U = (TL_stories.TL_premium_boostsStatus) obj;
                break;
        }
    }
}
