// default package

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.DataAutoDownloadActivity;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProxyListActivity;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class sq8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d b;

    public /* synthetic */ sq8(d dVar, byte b) {
        this.a = b;
        this.b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        d dVar = this.b;
        switch (b) {
            case 0:
                dVar.presentFragment(new y71());
                break;
            case 1:
                dVar.presentFragment(new y71());
                break;
            case 2:
                dVar.presentFragment(new t93());
                break;
            case 3:
                dVar.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                break;
            case 4:
                dVar.presentFragment(new DataSettingsActivity());
                break;
            case 5:
                dVar.presentFragment(new DataAutoDownloadActivity(0));
                break;
            case 6:
                dVar.presentFragment(new DataAutoDownloadActivity(1));
                break;
            case 7:
                dVar.presentFragment(new DataAutoDownloadActivity(2));
                break;
            case 8:
                dVar.presentFragment(new DataSettingsActivity());
                break;
            case 9:
                dVar.presentFragment(new DataSettingsActivity());
                break;
            case 10:
                kj8 kj8Var = new kj8(dVar, 3, false);
                kj8Var.F0();
                dVar.showDialog(kj8Var);
                break;
            case 11:
                dVar.presentFragment(new DataSettingsActivity());
                break;
            case 12:
                dVar.presentFragment(new DataSettingsActivity());
                break;
            case 13:
                dVar.presentFragment(new DataSettingsActivity());
                break;
            case 14:
                dVar.presentFragment(new DataSettingsActivity());
                break;
            case 15:
                dVar.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                break;
            case 16:
                dVar.presentFragment(new ProxyListActivity());
                break;
            case 17:
                dVar.presentFragment(new DataSettingsActivity());
                break;
            case 18:
                dVar.presentFragment(new DataSettingsActivity());
                break;
            case 19:
                dVar.presentFragment(new DataSettingsActivity());
                break;
            case 20:
                dVar.presentFragment(new DataSettingsActivity());
                break;
            case 21:
                kj8 kj8Var2 = new kj8(dVar, 4, false);
                kj8Var2.F0();
                dVar.showDialog(kj8Var2);
                break;
            case 22:
                dVar.presentFragment(new goc());
                break;
            case 23:
                goc.L0(dVar.getContext(), dVar.getResourceProvider());
                break;
            case 24:
                ik.q0(7, null, dVar);
                break;
            case 25:
                ik.q0(8, null, dVar);
                break;
            case 26:
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.V0 = true;
                dVar.presentFragment(themeActivity);
                break;
            case 27:
                hg9.n(1, dVar);
                break;
            case 28:
                dVar.presentFragment(new PremiumPreviewFragment(0, "summarize_limit"));
                break;
            default:
                if (c41.a(dVar)) {
                    c41.b0(dVar).I(R.raw.contact_check, jb6.M0(2131742833, null), jb6.M0(2131742832, null)).j();
                    break;
                }
                break;
        }
    }
}
