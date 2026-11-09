package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class z70 implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ z70(LaunchActivity launchActivity, int i7) {
        this.a = i7;
        this.b = launchActivity;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        org.telegram.ui.ActionBar.f2 lastFragment;
        int i7 = this.a;
        LaunchActivity launchActivity = this.b;
        switch (i7) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.o0 != null && booleanValue && org.telegram.messenger.sc.c() < 100 && (lastFragment = launchActivity.o0.getLastFragment()) != null && !(lastFragment instanceof y90)) {
                    int b10 = org.telegram.messenger.sc.b();
                    org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(lastFragment);
                    org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(b10 / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.l6.Y5));
                    String M0 = org.telegram.messenger.id.M0(2131748715, null);
                    String a03 = org.telegram.messenger.id.a0("LowPowerEnabledSubtitle", null, 2131748716, String.format("%d%%", Integer.valueOf(b10)));
                    String M02 = org.telegram.messenger.id.M0(2131751435, null);
                    u60 u60Var = new u60(launchActivity, 11);
                    a02.getClass();
                    Context W = a02.W();
                    org.telegram.ui.ActionBar.g6 g6Var = a02.c;
                    org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(W, g6Var);
                    zbVar.a.setImageDrawable(n9Var);
                    zbVar.b.setText(M0);
                    zbVar.c.setText(a03);
                    org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(a02.W(), g6Var, true);
                    acVar.e(M02);
                    acVar.b = u60Var;
                    zbVar.setButton(acVar);
                    org.telegram.ui.Components.cc b11 = a02.b(zbVar, 2750);
                    b11.j = 5000;
                    b11.j();
                    break;
                }
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                String str = LaunchActivity.B1;
                org.telegram.messenger.qp.s1(launchActivity.O).x3(null, user, null, 0, null, false, false);
                break;
        }
    }
}
