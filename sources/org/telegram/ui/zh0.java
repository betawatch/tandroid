package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 b;

    public /* synthetic */ zh0(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.a = i10;
        this.b = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                m2Var.a = true;
                this.b.showAsSheet(new PremiumPreviewFragment(0, "effect"), m2Var);
                break;
            case 1:
                org.telegram.ui.ActionBar.o2 o2Var = this.b;
                if (o2Var instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) o2Var;
                    premiumPreviewFragment.l0 = true;
                    premiumPreviewFragment.getMediaDataController().loadPremiumPromo(false);
                    premiumPreviewFragment.a.x0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.l0 = true;
                    if (o2Var != null) {
                        o2Var.presentFragment(premiumPreviewFragment2);
                    } else {
                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(premiumPreviewFragment2);
                        }
                    }
                }
                if (o2Var != null && (o2Var.getParentActivity() instanceof LaunchActivity)) {
                    try {
                        o2Var.getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    ((LaunchActivity) o2Var.getParentActivity()).t0.c(false);
                    break;
                }
                break;
            case 2:
                this.b.presentFragment(new DataSettingsActivity());
                break;
            case 3:
                this.b.presentFragment(new DataSettingsActivity());
                break;
            case 4:
                this.b.presentFragment(new DataSettingsActivity());
                break;
            case 5:
                b.l(0, this.b);
                break;
            case 6:
                b.l(0, this.b);
                break;
            case 7:
                this.b.presentFragment(new WallpapersListActivity(0));
                break;
            case 8:
                this.b.presentFragment(new NotificationsCustomSettingsActivity(2, new ArrayList(), null, true));
                break;
            case 9:
                this.b.presentFragment(new WallpapersListActivity(1));
                break;
            case 10:
                this.b.presentFragment(new WallpapersListActivity(0));
                break;
            case 11:
                b.l(0, this.b);
                break;
            case 12:
                org.telegram.ui.ActionBar.o2 o2Var2 = this.b;
                cg.p1 p1Var = new cg.p1(o2Var2, 4, false);
                p1Var.C();
                o2Var2.showDialog(p1Var);
                break;
            case 13:
                b.l(3, this.b);
                break;
            case 14:
                b.l(3, this.b);
                break;
            case 15:
                b.l(0, this.b);
                break;
            case 16:
                b.l(0, this.b);
                break;
            case 17:
                b.l(0, this.b);
                break;
            case 18:
                b.l(0, this.b);
                break;
            case 19:
                b.l(1, this.b);
                break;
            case 20:
                this.b.presentFragment(new NotificationsSettingsActivity());
                break;
            case 21:
                b.l(0, this.b);
                break;
            case 22:
                b.l(0, this.b);
                break;
            case 23:
                this.b.presentFragment(new NotificationsSettingsActivity());
                break;
            case 24:
                b.l(0, this.b);
                break;
            case 25:
                b.l(0, this.b);
                break;
            case 26:
                b.l(0, this.b);
                break;
            case 27:
                b.l(0, this.b);
                break;
            case 28:
                b.l(0, this.b);
                break;
            default:
                b.l(0, this.b);
                break;
        }
    }
}
