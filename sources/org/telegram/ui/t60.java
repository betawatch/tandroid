package org.telegram.ui;

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ t60(LaunchActivity launchActivity, int i7) {
        this.a = i7;
        this.b = launchActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        int i7 = this.a;
        org.telegram.ui.ActionBar.g2 g2Var = null;
        int i10 = 0;
        LaunchActivity launchActivity = this.b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(launchActivity, null);
                obVar.d(R.raw.email_check_inbox, new String[0]);
                obVar.b.setText(org.telegram.messenger.gd.N0(2131742547, null));
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (Q != null) {
                    org.telegram.ui.Components.gc.g(Q, obVar, 1500).j();
                    try {
                        Q.fragmentView.performHapticFeedback(3, 2);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 1:
                if (launchActivity.W0) {
                    launchActivity.W0 = false;
                    launchActivity.F(false, false, true);
                    break;
                }
                break;
            case 2:
                if (!launchActivity.w1) {
                    try {
                        org.telegram.ui.ActionBar.t1 z10 = org.telegram.ui.Components.c5.z(launchActivity);
                        z10.setOnDismissListener(new l70(launchActivity, i10));
                        launchActivity.w1 = true;
                        z10.show();
                        break;
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                break;
            case 3:
                String str2 = LaunchActivity.C1;
                launchActivity.F(false, true, false);
                if (LaunchActivity.Q() != null && LaunchActivity.Q().getLastStoryViewer() != null) {
                    LaunchActivity.Q().getLastStoryViewer().V();
                    break;
                }
                break;
            case 4:
                if (!launchActivity.p0.getFragmentStack().isEmpty()) {
                    launchActivity.p0.getFragmentStack().get(0).showDialog(new org.telegram.ui.Components.kw0(launchActivity, launchActivity.k0, launchActivity.i0, launchActivity.j0));
                    break;
                }
                break;
            case 5:
                String str3 = LaunchActivity.C1;
                launchActivity.getClass();
                org.telegram.ui.Components.c20.g0 = false;
                org.telegram.ui.Components.c20.k(launchActivity);
                break;
            case 6:
                String str4 = LaunchActivity.C1;
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
                launchActivity.u1 = null;
                break;
            case 8:
                if (launchActivity.T0 != null) {
                    File file = new File(org.telegram.messenger.t0.h(), a8.p0.r(new StringBuilder("remote"), launchActivity.T0.id, ".attheme"));
                    TLRPC.TL_theme tL_theme = launchActivity.T0;
                    org.telegram.ui.ActionBar.l6 v = org.telegram.ui.ActionBar.m6.v(file, tL_theme.title, tL_theme, true);
                    if (v != null) {
                        launchActivity.t0(new x71(v, true, 0, false, false));
                    }
                    launchActivity.i0();
                    break;
                }
                break;
            case 9:
                ArrayList arrayList = launchActivity.e0;
                ArrayList arrayList2 = launchActivity.f0;
                if (org.telegram.messenger.g0.Q1()) {
                    if (!arrayList2.isEmpty()) {
                        g2Var = (org.telegram.ui.ActionBar.g2) i5.c.h(1, arrayList2);
                    }
                } else if (!arrayList.isEmpty()) {
                    g2Var = (org.telegram.ui.ActionBar.g2) i5.c.h(1, arrayList);
                }
                if (!(g2Var instanceof ProxyListActivity) && !(g2Var instanceof yx0)) {
                    launchActivity.t0(new ProxyListActivity());
                    break;
                }
                break;
            case 10:
                launchActivity.v1 = null;
                break;
            default:
                String str5 = LaunchActivity.C1;
                launchActivity.getClass();
                launchActivity.t0(new z90());
                break;
        }
    }
}
