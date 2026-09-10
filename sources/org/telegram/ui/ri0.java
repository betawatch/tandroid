package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ri0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 b;

    public /* synthetic */ ri0(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.a = i10;
        this.b = p2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                n2Var.a = true;
                this.b.showAsSheet(new PremiumPreviewFragment(0, "effect"), n2Var);
                break;
            case 1:
                org.telegram.ui.ActionBar.p2 p2Var = this.b;
                if (p2Var instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) p2Var;
                    premiumPreviewFragment.p0 = true;
                    premiumPreviewFragment.getMediaDataController().loadPremiumPromo(false);
                    premiumPreviewFragment.a.x0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.p0 = true;
                    if (p2Var != null) {
                        p2Var.presentFragment(premiumPreviewFragment2);
                    } else {
                        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(premiumPreviewFragment2);
                        }
                    }
                }
                if (p2Var != null && (p2Var.getParentActivity() instanceof LaunchActivity)) {
                    try {
                        p2Var.getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    ((LaunchActivity) p2Var.getParentActivity()).x0.c(false);
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
                org.telegram.messenger.em.m(0, this.b);
                break;
            case 6:
                org.telegram.messenger.em.m(0, this.b);
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
                org.telegram.messenger.em.m(0, this.b);
                break;
            case 12:
                org.telegram.ui.ActionBar.p2 p2Var2 = this.b;
                qg.a1 a1Var = new qg.a1(p2Var2, 4, false);
                a1Var.C();
                p2Var2.showDialog(a1Var);
                break;
            case 13:
                org.telegram.messenger.em.m(3, this.b);
                break;
            case 14:
                org.telegram.messenger.em.m(3, this.b);
                break;
            case 15:
                org.telegram.messenger.em.m(0, this.b);
                break;
            case 16:
                org.telegram.messenger.em.m(0, this.b);
                break;
            case 17:
                org.telegram.messenger.em.m(0, this.b);
                break;
            case 18:
                org.telegram.messenger.em.m(0, this.b);
                break;
            case 19:
                org.telegram.messenger.em.m(1, this.b);
                break;
            case 20:
                this.b.presentFragment(new NotificationsSettingsActivity());
                break;
            case 21:
                org.telegram.messenger.em.m(0, this.b);
                break;
            case 22:
                org.telegram.messenger.em.m(0, this.b);
                break;
            case 23:
                this.b.presentFragment(new NotificationsSettingsActivity());
                break;
            case 24:
                org.telegram.messenger.em.m(0, this.b);
                break;
            case 25:
                org.telegram.messenger.em.m(0, this.b);
                break;
            case 26:
                org.telegram.messenger.em.m(0, this.b);
                break;
            case 27:
                org.telegram.messenger.em.m(0, this.b);
                break;
            case 28:
                org.telegram.messenger.em.m(0, this.b);
                break;
            default:
                org.telegram.messenger.em.m(0, this.b);
                break;
        }
    }
}
