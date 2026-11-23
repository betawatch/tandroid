package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class vf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 b;

    public /* synthetic */ vf0(int i7, org.telegram.ui.ActionBar.g2 g2Var) {
        this.a = i7;
        this.b = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2();
                e2Var.a = true;
                this.b.showAsSheet(new PremiumPreviewFragment(0, "effect"), e2Var);
                break;
            case 1:
                org.telegram.ui.ActionBar.g2 g2Var = this.b;
                if (g2Var instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) g2Var;
                    premiumPreviewFragment.q0 = true;
                    premiumPreviewFragment.getMediaDataController().U0(false);
                    premiumPreviewFragment.a.y0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.q0 = true;
                    if (g2Var != null) {
                        g2Var.presentFragment(premiumPreviewFragment2);
                    } else {
                        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                        if (T != null) {
                            T.presentFragment(premiumPreviewFragment2);
                        }
                    }
                }
                if (g2Var != null && (g2Var.getParentActivity() instanceof LaunchActivity)) {
                    try {
                        g2Var.getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    ((LaunchActivity) g2Var.getParentActivity()).w0.c(false);
                    break;
                }
                break;
            case 2:
                this.b.presentFragment(new DataSettingsActivity());
                break;
            case 3:
                org.telegram.messenger.m10.m(0, this.b);
                break;
            case 4:
                org.telegram.messenger.m10.m(0, this.b);
                break;
            case 5:
                this.b.presentFragment(new WallpapersListActivity(0));
                break;
            case 6:
                this.b.presentFragment(new WallpapersListActivity(1));
                break;
            case 7:
                this.b.presentFragment(new NotificationsCustomSettingsActivity(2, new ArrayList(), null, true));
                break;
            case 8:
                this.b.presentFragment(new WallpapersListActivity(0));
                break;
            case 9:
                org.telegram.messenger.m10.m(0, this.b);
                break;
            case 10:
                org.telegram.messenger.m10.m(3, this.b);
                break;
            case 11:
                org.telegram.messenger.m10.m(3, this.b);
                break;
            case 12:
                org.telegram.ui.ActionBar.g2 g2Var2 = this.b;
                ug.y0 y0Var = new ug.y0(g2Var2, 5, false);
                y0Var.L0();
                g2Var2.showDialog(y0Var);
                break;
            case 13:
                org.telegram.messenger.m10.m(0, this.b);
                break;
            case 14:
                org.telegram.messenger.m10.m(0, this.b);
                break;
            case 15:
                org.telegram.messenger.m10.m(0, this.b);
                break;
            case 16:
                org.telegram.messenger.m10.m(0, this.b);
                break;
            case 17:
                org.telegram.messenger.m10.m(1, this.b);
                break;
            case 18:
                org.telegram.messenger.m10.m(0, this.b);
                break;
            case 19:
                this.b.presentFragment(new NotificationsSettingsActivity());
                break;
            case 20:
                org.telegram.messenger.m10.m(0, this.b);
                break;
            case 21:
                org.telegram.messenger.m10.m(0, this.b);
                break;
            case 22:
                org.telegram.messenger.m10.m(0, this.b);
                break;
            case 23:
                this.b.presentFragment(new NotificationsSettingsActivity());
                break;
            case 24:
                org.telegram.messenger.m10.m(0, this.b);
                break;
            case 25:
                org.telegram.messenger.m10.m(0, this.b);
                break;
            case 26:
                org.telegram.messenger.m10.m(0, this.b);
                break;
            case 27:
                org.telegram.messenger.m10.m(0, this.b);
                break;
            case 28:
                this.b.presentFragment(new StickersActivity(0, null));
                break;
            default:
                this.b.presentFragment(new StickersActivity(0, null));
                break;
        }
    }
}
