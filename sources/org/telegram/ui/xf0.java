package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class xf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.h2 b;

    public /* synthetic */ xf0(int i7, org.telegram.ui.ActionBar.h2 h2Var) {
        this.a = i7;
        this.b = h2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2();
                f2Var.a = true;
                this.b.showAsSheet(new PremiumPreviewFragment(0, "effect"), f2Var);
                break;
            case 1:
                org.telegram.ui.ActionBar.h2 h2Var = this.b;
                if (h2Var instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) h2Var;
                    premiumPreviewFragment.q0 = true;
                    premiumPreviewFragment.getMediaDataController().U0(false);
                    premiumPreviewFragment.a.y0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.q0 = true;
                    if (h2Var != null) {
                        h2Var.presentFragment(premiumPreviewFragment2);
                    } else {
                        org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                        if (T != null) {
                            T.presentFragment(premiumPreviewFragment2);
                        }
                    }
                }
                if (h2Var != null && (h2Var.getParentActivity() instanceof LaunchActivity)) {
                    try {
                        h2Var.getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    ((LaunchActivity) h2Var.getParentActivity()).w0.c(false);
                    break;
                }
                break;
            case 2:
                this.b.presentFragment(new DataSettingsActivity());
                break;
            case 3:
                org.telegram.messenger.n10.m(0, this.b);
                break;
            case 4:
                org.telegram.messenger.n10.m(0, this.b);
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
                org.telegram.messenger.n10.m(0, this.b);
                break;
            case 10:
                org.telegram.messenger.n10.m(3, this.b);
                break;
            case 11:
                org.telegram.messenger.n10.m(3, this.b);
                break;
            case 12:
                org.telegram.ui.ActionBar.h2 h2Var2 = this.b;
                ug.z0 z0Var = new ug.z0(h2Var2, 5, false);
                z0Var.L0();
                h2Var2.showDialog(z0Var);
                break;
            case 13:
                org.telegram.messenger.n10.m(0, this.b);
                break;
            case 14:
                org.telegram.messenger.n10.m(0, this.b);
                break;
            case 15:
                org.telegram.messenger.n10.m(0, this.b);
                break;
            case 16:
                org.telegram.messenger.n10.m(0, this.b);
                break;
            case 17:
                org.telegram.messenger.n10.m(1, this.b);
                break;
            case 18:
                org.telegram.messenger.n10.m(0, this.b);
                break;
            case 19:
                this.b.presentFragment(new NotificationsSettingsActivity());
                break;
            case 20:
                org.telegram.messenger.n10.m(0, this.b);
                break;
            case 21:
                org.telegram.messenger.n10.m(0, this.b);
                break;
            case 22:
                org.telegram.messenger.n10.m(0, this.b);
                break;
            case 23:
                this.b.presentFragment(new NotificationsSettingsActivity());
                break;
            case 24:
                org.telegram.messenger.n10.m(0, this.b);
                break;
            case 25:
                org.telegram.messenger.n10.m(0, this.b);
                break;
            case 26:
                org.telegram.messenger.n10.m(0, this.b);
                break;
            case 27:
                org.telegram.messenger.n10.m(0, this.b);
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
