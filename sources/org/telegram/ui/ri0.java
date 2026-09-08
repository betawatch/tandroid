package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class ri0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 b;

    public /* synthetic */ ri0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = i10;
        this.b = n2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.a = true;
                this.b.showAsSheet(new PremiumPreviewFragment(0, "effect"), l2Var);
                break;
            case 1:
                org.telegram.ui.ActionBar.n2 n2Var = this.b;
                if (n2Var instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) n2Var;
                    premiumPreviewFragment.p0 = true;
                    premiumPreviewFragment.getMediaDataController().loadPremiumPromo(false);
                    premiumPreviewFragment.a.x0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.p0 = true;
                    if (n2Var != null) {
                        n2Var.presentFragment(premiumPreviewFragment2);
                    } else {
                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(premiumPreviewFragment2);
                        }
                    }
                }
                if (n2Var != null && (n2Var.getParentActivity() instanceof LaunchActivity)) {
                    try {
                        n2Var.getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    ((LaunchActivity) n2Var.getParentActivity()).x0.c(false);
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
                org.telegram.messenger.wl.m(0, this.b);
                break;
            case 6:
                org.telegram.messenger.wl.m(0, this.b);
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
                org.telegram.messenger.wl.m(0, this.b);
                break;
            case 12:
                org.telegram.ui.ActionBar.n2 n2Var2 = this.b;
                sg.a1 a1Var = new sg.a1(n2Var2, 4, false);
                a1Var.C();
                n2Var2.showDialog(a1Var);
                break;
            case 13:
                org.telegram.messenger.wl.m(3, this.b);
                break;
            case 14:
                org.telegram.messenger.wl.m(3, this.b);
                break;
            case 15:
                org.telegram.messenger.wl.m(0, this.b);
                break;
            case 16:
                org.telegram.messenger.wl.m(0, this.b);
                break;
            case 17:
                org.telegram.messenger.wl.m(0, this.b);
                break;
            case 18:
                org.telegram.messenger.wl.m(0, this.b);
                break;
            case 19:
                org.telegram.messenger.wl.m(1, this.b);
                break;
            case 20:
                this.b.presentFragment(new NotificationsSettingsActivity());
                break;
            case 21:
                org.telegram.messenger.wl.m(0, this.b);
                break;
            case 22:
                org.telegram.messenger.wl.m(0, this.b);
                break;
            case 23:
                this.b.presentFragment(new NotificationsSettingsActivity());
                break;
            case 24:
                org.telegram.messenger.wl.m(0, this.b);
                break;
            case 25:
                org.telegram.messenger.wl.m(0, this.b);
                break;
            case 26:
                org.telegram.messenger.wl.m(0, this.b);
                break;
            case 27:
                org.telegram.messenger.wl.m(0, this.b);
                break;
            case 28:
                org.telegram.messenger.wl.m(0, this.b);
                break;
            default:
                org.telegram.messenger.wl.m(0, this.b);
                break;
        }
    }
}
