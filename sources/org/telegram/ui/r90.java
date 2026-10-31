package org.telegram.ui;

import android.os.Bundle;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r90 implements org.telegram.messenger.jp {
    public final /* synthetic */ f70 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Integer e;
    public final /* synthetic */ Bundle f;
    public final /* synthetic */ LaunchActivity h;

    public r90(LaunchActivity launchActivity, f70 f70Var, String str, org.telegram.ui.ActionBar.k2 k2Var, long j10, Integer num, Bundle bundle) {
        this.h = launchActivity;
        this.a = f70Var;
        this.b = str;
        this.c = k2Var;
        this.d = j10;
        this.e = num;
        this.f = bundle;
    }

    @Override // org.telegram.messenger.jp
    public final void a() {
        LaunchActivity launchActivity = this.h;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.s4.t0((org.telegram.ui.ActionBar.k2) i0.a.g(1, launchActivity.d0), null, org.telegram.messenger.cd.L0(2131749085, null), null);
        }
        try {
            this.a.run();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.messenger.jp
    public final void g(boolean z10) {
        try {
            this.a.run();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        LaunchActivity launchActivity = this.h;
        if (launchActivity.isFinishing()) {
            return;
        }
        String str = this.b;
        long j10 = this.d;
        org.telegram.ui.ActionBar.k2 k2Var = this.c;
        if (str == null || !(k2Var instanceof un) || ((un) k2Var).a() != j10) {
            if (k2Var instanceof un) {
                un unVar = (un) k2Var;
                if (unVar.a() == j10 && this.e == null) {
                    org.telegram.messenger.i0.F3(5.0f, unVar.z0, null);
                    org.telegram.messenger.t2.D.a();
                    mk mkVar = unVar.Z;
                    for (int i10 = 0; i10 < mkVar.getChildCount(); i10++) {
                        org.telegram.messenger.i0.F3(5.0f, mkVar.getChildAt(i10), null);
                    }
                    org.telegram.ui.ActionBar.l actionBar = unVar.getActionBar();
                    for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                        org.telegram.messenger.i0.F3(5.0f, actionBar.getChildAt(i11), null);
                    }
                }
            }
            k2Var = new un(this.f);
            ((ActionBarLayout) launchActivity.M()).R(k2Var);
        }
        org.telegram.messenger.i0.h3(new ag.a3(this, this.b, this.d, k2Var, 10), 150L);
    }
}
