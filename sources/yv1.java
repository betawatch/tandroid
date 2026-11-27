// default package

import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yv1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e b;

    public /* synthetic */ yv1(e eVar, byte b) {
        this.a = b;
        this.b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        e eVar = this.b;
        switch (b) {
            case 0:
                int i = ChatActivityEnterView.X7;
                if (eVar == null) {
                    if (eVar.getContext() instanceof LaunchActivity) {
                        ((LaunchActivity) eVar.getContext()).t0(new PremiumPreviewFragment(0, null));
                        break;
                    }
                } else {
                    new xk8(eVar, 11, false).show();
                    break;
                }
                break;
            case 1:
                eVar.presentFragment(new StickersActivity(0, null));
                break;
            case 2:
                eVar.presentFragment(new uqc());
                break;
            case 3:
                bg0 bg0Var = new bg0();
                bg0Var.a = true;
                eVar.showAsSheet(new PremiumPreviewFragment(0, "effect"), bg0Var);
                break;
            case 4:
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.V0 = true;
                eVar.presentFragment(themeActivity);
                break;
            case 5:
                if (eVar instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) eVar;
                    premiumPreviewFragment.q0 = true;
                    premiumPreviewFragment.getMediaDataController().T0(false);
                    premiumPreviewFragment.a.A0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.q0 = true;
                    if (eVar != null) {
                        eVar.presentFragment(premiumPreviewFragment2);
                    } else {
                        e S = LaunchActivity.S();
                        if (S != null) {
                            S.presentFragment(premiumPreviewFragment2);
                        }
                    }
                }
                if (eVar != null && (eVar.getParentActivity() instanceof LaunchActivity)) {
                    try {
                        eVar.getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    ((LaunchActivity) eVar.getParentActivity()).w0.c(false);
                    break;
                }
                break;
            case 6:
                eVar.presentFragment(new DataSettingsActivity());
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
                uh9.o(0, eVar);
                break;
            case 9:
                eVar.presentFragment(new WallpapersListActivity(0));
                break;
            case 10:
                eVar.presentFragment(new WallpapersListActivity(1));
                break;
            case 11:
                eVar.presentFragment(new NotificationsCustomSettingsActivity(2, new ArrayList(), null, true));
                break;
            case 12:
                eVar.presentFragment(new WallpapersListActivity(0));
                break;
            case 14:
            case 15:
                uh9.o(3, eVar);
                break;
            case 16:
                xk8 xk8Var = new xk8(eVar, 5, false);
                xk8Var.G0();
                eVar.showDialog(xk8Var);
                break;
            case 21:
                uh9.o(1, eVar);
                break;
            case 23:
                eVar.presentFragment(new NotificationsSettingsActivity());
                break;
            case 27:
                eVar.presentFragment(new NotificationsSettingsActivity());
                break;
        }
    }
}
