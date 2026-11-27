// default package

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class pd implements fd, dz7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ pd(LaunchActivity launchActivity, byte b) {
        this.a = b;
        this.b = launchActivity;
    }

    @Override // dz7
    public final void a(fz7 fz7Var) {
        String str = LaunchActivity.C1;
        xea.B = false;
        LaunchActivity launchActivity = this.b;
        Intent intent = launchActivity.K0;
        if (intent != null) {
            launchActivity.V(intent, launchActivity.L0, launchActivity.M0, true, null, false, true);
            launchActivity.K0 = null;
        }
        launchActivity.p0.getView().setVisibility(0);
        launchActivity.p0.W(true, true);
        ActionBarLayout actionBarLayout = launchActivity.p0;
        e lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment != null) {
            lastFragment.setTitleOverlayText(actionBarLayout.N0, actionBarLayout.O0, actionBarLayout.P0);
        }
        if (hl.O1()) {
            ActionBarLayout actionBarLayout2 = launchActivity.q0;
            if (actionBarLayout2 != null) {
                actionBarLayout2.W(true, true);
                if (launchActivity.q0.getView().getVisibility() == 4) {
                    launchActivity.q0.getView().setVisibility(0);
                }
            }
            ActionBarLayout actionBarLayout3 = launchActivity.r0;
            if (actionBarLayout3 != null) {
                actionBarLayout3.W(true, true);
                launchActivity.r0.getView().setVisibility(0);
            }
        }
        jn7.e().k(jn7.o0, fz7Var);
        try {
            ip7.n(yac.t0).Y();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        LaunchActivity launchActivity = this.b;
        switch (b) {
            case 0:
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                    launchActivity.startActivity(intent);
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 1:
                launchActivity.t0(new LanguageSelectActivity());
                break;
            case 2:
                launchActivity.t0(new z61());
                break;
            default:
                String str = LaunchActivity.C1;
                uc7.s1(launchActivity.P).J3(2);
                break;
        }
    }
}
