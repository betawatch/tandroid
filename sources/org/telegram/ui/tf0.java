package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class tf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 b;

    public /* synthetic */ tf0(int i7, org.telegram.ui.ActionBar.e2 e2Var) {
        this.a = i7;
        this.b = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2();
                c2Var.a = true;
                this.b.showAsSheet(new PremiumPreviewFragment(0, "effect"), c2Var);
                break;
            case 1:
                org.telegram.ui.ActionBar.e2 e2Var = this.b;
                if (e2Var instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) e2Var;
                    premiumPreviewFragment.q0 = true;
                    premiumPreviewFragment.getMediaDataController().R0(false);
                    premiumPreviewFragment.a.y0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.q0 = true;
                    if (e2Var != null) {
                        e2Var.presentFragment(premiumPreviewFragment2);
                    } else {
                        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                        if (T != null) {
                            T.presentFragment(premiumPreviewFragment2);
                        }
                    }
                }
                if (e2Var != null && (e2Var.getParentActivity() instanceof LaunchActivity)) {
                    try {
                        e2Var.getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    ((LaunchActivity) e2Var.getParentActivity()).w0.c(false);
                    break;
                }
                break;
            case 2:
                this.b.presentFragment(new DataSettingsActivity());
                break;
            case 3:
                org.telegram.messenger.i20.l(0, this.b);
                break;
            case 4:
                org.telegram.messenger.i20.l(0, this.b);
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
                org.telegram.messenger.i20.l(0, this.b);
                break;
            case 10:
                org.telegram.messenger.i20.l(3, this.b);
                break;
            case 11:
                org.telegram.messenger.i20.l(3, this.b);
                break;
            case 12:
                org.telegram.ui.ActionBar.e2 e2Var2 = this.b;
                ug.x0 x0Var = new ug.x0(e2Var2, 5, false);
                x0Var.K0();
                e2Var2.showDialog(x0Var);
                break;
            case 13:
                org.telegram.messenger.i20.l(0, this.b);
                break;
            case 14:
                org.telegram.messenger.i20.l(0, this.b);
                break;
            case 15:
                org.telegram.messenger.i20.l(0, this.b);
                break;
            case 16:
                org.telegram.messenger.i20.l(0, this.b);
                break;
            case 17:
                org.telegram.messenger.i20.l(1, this.b);
                break;
            case 18:
                org.telegram.messenger.i20.l(0, this.b);
                break;
            case 19:
                this.b.presentFragment(new NotificationsSettingsActivity());
                break;
            case 20:
                org.telegram.messenger.i20.l(0, this.b);
                break;
            case 21:
                org.telegram.messenger.i20.l(0, this.b);
                break;
            case 22:
                org.telegram.messenger.i20.l(0, this.b);
                break;
            case 23:
                this.b.presentFragment(new NotificationsSettingsActivity());
                break;
            case 24:
                org.telegram.messenger.i20.l(0, this.b);
                break;
            case 25:
                org.telegram.messenger.i20.l(0, this.b);
                break;
            case 26:
                org.telegram.messenger.i20.l(0, this.b);
                break;
            case 27:
                org.telegram.messenger.i20.l(0, this.b);
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
