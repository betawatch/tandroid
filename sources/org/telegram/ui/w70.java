package org.telegram.ui;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w70 implements org.telegram.messenger.lr {
    public final /* synthetic */ LaunchActivity a;
    public final /* synthetic */ int b;
    public final /* synthetic */ uw c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ Uri f;
    public final /* synthetic */ org.telegram.ui.ActionBar.s1 h;

    public /* synthetic */ w70(LaunchActivity launchActivity, int i3, uw uwVar, boolean z10, ArrayList arrayList, Uri uri, org.telegram.ui.ActionBar.s1 s1Var) {
        this.a = launchActivity;
        this.b = i3;
        this.c = uwVar;
        this.d = z10;
        this.e = arrayList;
        this.f = uri;
        this.h = s1Var;
    }

    @Override // org.telegram.messenger.lr
    public final void run(long j10) {
        org.telegram.ui.ActionBar.s1 s1Var = this.h;
        LaunchActivity launchActivity = this.a;
        if (j10 != 0) {
            String str = LaunchActivity.E1;
            Bundle k10 = a1.g.k("scrollToTopOnResume", true);
            if (!org.telegram.messenger.g0.Q1()) {
                org.telegram.messenger.hs.f(this.b).k(org.telegram.messenger.hs.t, new Object[0]);
            }
            if (org.telegram.messenger.m5.E(j10)) {
                k10.putLong("user_id", j10);
            } else {
                k10.putLong("chat_id", -j10);
            }
            wm wmVar = new wm(k10);
            wmVar.L9 = true;
            org.telegram.ui.ActionBar.q4 M = launchActivity.M();
            uw uwVar = this.c;
            ((ActionBarLayout) M).V(wmVar, uwVar != null || this.d, uwVar == null);
        } else {
            ArrayList arrayList = this.e;
            launchActivity.X = arrayList;
            if (arrayList == null) {
                launchActivity.X = new ArrayList();
            }
            launchActivity.X.add(0, this.f);
            launchActivity.j0(true);
        }
        try {
            s1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
