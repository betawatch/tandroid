package org.telegram.ui;

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ s60(LaunchActivity launchActivity, int i7) {
        this.a = i7;
        this.b = launchActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        int i7 = this.a;
        org.telegram.ui.ActionBar.f2 f2Var = null;
        int i10 = 0;
        LaunchActivity launchActivity = this.b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.B1;
                org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.kb(launchActivity, null);
                kbVar.d(R.raw.email_check_inbox, new String[0]);
                kbVar.b.setText(org.telegram.messenger.id.M0(2131742814, null));
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != null) {
                    org.telegram.ui.Components.cc.g(Q, kbVar, 1500).j();
                    try {
                        Q.fragmentView.performHapticFeedback(3, 2);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 1:
                if (launchActivity.V0) {
                    launchActivity.V0 = false;
                    launchActivity.F(false, false, true);
                    break;
                }
                break;
            case 2:
                if (!launchActivity.v1) {
                    try {
                        org.telegram.ui.ActionBar.u1 z9 = org.telegram.ui.Components.v4.z(launchActivity);
                        z9.setOnDismissListener(new k70(launchActivity, i10));
                        launchActivity.v1 = true;
                        z9.show();
                        break;
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                break;
            case 3:
                String str2 = LaunchActivity.B1;
                launchActivity.F(false, true, false);
                if (LaunchActivity.Q() != null && LaunchActivity.Q().getLastStoryViewer() != null) {
                    LaunchActivity.Q().getLastStoryViewer().V();
                    break;
                }
                break;
            case 4:
                if (!launchActivity.o0.getFragmentStack().isEmpty()) {
                    launchActivity.o0.getFragmentStack().get(0).showDialog(new org.telegram.ui.Components.yv0(launchActivity, launchActivity.j0, launchActivity.h0, launchActivity.i0));
                    break;
                }
                break;
            case 5:
                String str3 = LaunchActivity.B1;
                launchActivity.getClass();
                org.telegram.ui.Components.p10.f0 = false;
                org.telegram.ui.Components.p10.k(launchActivity);
                break;
            case 6:
                String str4 = LaunchActivity.B1;
                if (org.telegram.messenger.g0.g != -10 && org.telegram.messenger.g0.f == -10 && launchActivity.getResources().getConfiguration().smallestScreenWidthDp < 600 && (weakReference = org.telegram.messenger.g0.i) != null && weakReference.get() == launchActivity) {
                    int i11 = org.telegram.messenger.g0.h;
                    int i12 = org.telegram.messenger.g0.g;
                    org.telegram.messenger.g0.g = -10;
                    org.telegram.messenger.g0.h = -10;
                    org.telegram.messenger.g0.i = null;
                    try {
                        launchActivity.setRequestedOrientation(i11);
                        launchActivity.setRequestedOrientation(i12);
                        break;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                break;
            case 7:
                launchActivity.t1 = null;
                break;
            case 8:
                if (launchActivity.S0 != null) {
                    File file = new File(org.telegram.messenger.t0.h(), a8.p0.r(new StringBuilder("remote"), launchActivity.S0.id, ".attheme"));
                    TLRPC.TL_theme tL_theme = launchActivity.S0;
                    org.telegram.ui.ActionBar.j6 v = org.telegram.ui.ActionBar.k6.v(file, tL_theme.title, tL_theme, true);
                    if (v != null) {
                        launchActivity.t0(new v71(v, true, 0, false, false));
                    }
                    launchActivity.i0();
                    break;
                }
                break;
            case 9:
                ArrayList arrayList = launchActivity.d0;
                ArrayList arrayList2 = launchActivity.e0;
                if (org.telegram.messenger.g0.Q1()) {
                    if (!arrayList2.isEmpty()) {
                        f2Var = (org.telegram.ui.ActionBar.f2) jg.g.i(1, arrayList2);
                    }
                } else if (!arrayList.isEmpty()) {
                    f2Var = (org.telegram.ui.ActionBar.f2) jg.g.i(1, arrayList);
                }
                if (!(f2Var instanceof ProxyListActivity) && !(f2Var instanceof ux0)) {
                    launchActivity.t0(new ProxyListActivity());
                    break;
                }
                break;
            case 10:
                launchActivity.u1 = null;
                break;
            default:
                String str5 = LaunchActivity.B1;
                launchActivity.getClass();
                launchActivity.t0(new w90());
                break;
        }
    }
}
