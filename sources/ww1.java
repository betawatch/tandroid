// default package

import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ww1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d b;

    public /* synthetic */ ww1(d dVar, byte b) {
        this.a = b;
        this.b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        d dVar = this.b;
        switch (b) {
            case 0:
                int i = ChatActivityEnterView.z7;
                if (dVar == null) {
                    if (dVar.getContext() instanceof LaunchActivity) {
                        ((LaunchActivity) dVar.getContext()).t0(new PremiumPreviewFragment(0, null));
                        break;
                    }
                } else {
                    new kj8(dVar, 11, false).show();
                    break;
                }
                break;
            case 1:
                dVar.presentFragment(new StickersActivity(0, null));
                break;
            case 2:
                dVar.presentFragment(new goc());
                break;
            case 3:
                bh0 bh0Var = new bh0();
                bh0Var.a = true;
                dVar.showAsSheet(new PremiumPreviewFragment(0, "effect"), bh0Var);
                break;
            case 4:
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.V0 = true;
                dVar.presentFragment(themeActivity);
                break;
            case 5:
                if (dVar instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) dVar;
                    premiumPreviewFragment.q0 = true;
                    premiumPreviewFragment.getMediaDataController().T0(false);
                    premiumPreviewFragment.a.z0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.q0 = true;
                    if (dVar != null) {
                        dVar.presentFragment(premiumPreviewFragment2);
                    } else {
                        d S = LaunchActivity.S();
                        if (S != null) {
                            S.presentFragment(premiumPreviewFragment2);
                        }
                    }
                }
                if (dVar != null && (dVar.getParentActivity() instanceof LaunchActivity)) {
                    try {
                        dVar.getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    ((LaunchActivity) dVar.getParentActivity()).w0.c(false);
                    break;
                }
                break;
            case 6:
                dVar.presentFragment(new DataSettingsActivity());
                break;
            case 7:
            case 8:
            case 13:
            case 17:
            case 18:
            case 19:
            case 20:
            case 22:
            case 24:
            case 25:
            case 26:
            case 28:
            default:
                hg9.n(0, dVar);
                break;
            case 9:
                dVar.presentFragment(new WallpapersListActivity(0));
                break;
            case 10:
                dVar.presentFragment(new WallpapersListActivity(1));
                break;
            case 11:
                dVar.presentFragment(new NotificationsCustomSettingsActivity(2, new ArrayList(), null, true));
                break;
            case 12:
                dVar.presentFragment(new WallpapersListActivity(0));
                break;
            case 14:
            case 15:
                hg9.n(3, dVar);
                break;
            case 16:
                kj8 kj8Var = new kj8(dVar, 5, false);
                kj8Var.F0();
                dVar.showDialog(kj8Var);
                break;
            case 21:
                hg9.n(1, dVar);
                break;
            case 23:
                dVar.presentFragment(new NotificationsSettingsActivity());
                break;
            case 27:
                dVar.presentFragment(new NotificationsSettingsActivity());
                break;
        }
    }
}
