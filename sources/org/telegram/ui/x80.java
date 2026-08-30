package org.telegram.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ x80(LaunchActivity launchActivity, int i10) {
        this.a = i10;
        this.b = launchActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        org.telegram.ui.ActionBar.p2 p2Var = null;
        int i11 = 0;
        LaunchActivity launchActivity = this.b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.y1;
                org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(launchActivity, null);
                qbVar.d(R.raw.email_check_inbox, new String[0]);
                qbVar.b.setText(launchActivity.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    org.telegram.ui.Components.ic.g(R, qbVar, 1500).j();
                    try {
                        R.fragmentView.performHapticFeedback(3, 2);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 1:
                if (launchActivity.T0) {
                    launchActivity.T0 = false;
                    launchActivity.H(false, false, true);
                    break;
                }
                break;
            case 2:
                Pattern pattern2 = LaunchActivity.y1;
                launchActivity.H(false, true, false);
                if (LaunchActivity.R() != null && LaunchActivity.R().getLastStoryViewer() != null) {
                    LaunchActivity.R().getLastStoryViewer().P();
                    break;
                }
                break;
            case 3:
                if (!launchActivity.n0.getFragmentStack().isEmpty()) {
                    launchActivity.n0.getFragmentStack().get(0).showDialog(new org.telegram.ui.Components.xx0(launchActivity, launchActivity.g0, launchActivity.e0, launchActivity.f0));
                    break;
                }
                break;
            case 4:
                Pattern pattern3 = LaunchActivity.y1;
                launchActivity.getClass();
                org.telegram.ui.Components.a30.b0 = false;
                org.telegram.ui.Components.a30.j(launchActivity);
                break;
            case 5:
                ArrayList arrayList = launchActivity.a0;
                ArrayList arrayList2 = launchActivity.b0;
                if (AndroidUtilities.isTablet()) {
                    if (!arrayList2.isEmpty()) {
                        p2Var = (org.telegram.ui.ActionBar.p2) kh.a2.i(1, arrayList2);
                    }
                } else if (!arrayList.isEmpty()) {
                    p2Var = (org.telegram.ui.ActionBar.p2) kh.a2.i(1, arrayList);
                }
                if (!(p2Var instanceof ProxyListActivity) && !(p2Var instanceof w11)) {
                    launchActivity.p0(new ProxyListActivity());
                    break;
                }
                break;
            case 6:
                if (!launchActivity.s1) {
                    try {
                        org.telegram.ui.ActionBar.d2 C = org.telegram.ui.Components.z4.C(launchActivity);
                        C.setOnDismissListener(new y80(launchActivity, i11));
                        launchActivity.s1 = true;
                        C.show();
                        break;
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                break;
            case 7:
                if (launchActivity.Q0 != null) {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), android.support.v4.media.a.q(new StringBuilder("remote"), launchActivity.Q0.id, ".attheme"));
                    TLRPC.TL_theme tL_theme = launchActivity.Q0;
                    org.telegram.ui.ActionBar.i6 u10 = org.telegram.ui.ActionBar.j6.u(file, tL_theme.title, tL_theme, true);
                    if (u10 != null) {
                        launchActivity.p0(new cd1(u10, true, 0, false, false));
                    }
                    launchActivity.h0();
                    break;
                }
                break;
            case 8:
                Pattern pattern4 = LaunchActivity.y1;
                launchActivity.getClass();
                launchActivity.p0(new ec0());
                break;
            case 9:
                launchActivity.q1 = null;
                break;
            default:
                launchActivity.r1 = null;
                break;
        }
    }
}
