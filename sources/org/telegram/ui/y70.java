package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y70 implements org.telegram.messenger.x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ y70(LaunchActivity launchActivity, int i7) {
        this.a = i7;
        this.b = launchActivity;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        org.telegram.ui.ActionBar.g2 lastFragment;
        int i7 = this.a;
        LaunchActivity launchActivity = this.b;
        switch (i7) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.p0 != null && booleanValue && org.telegram.messenger.pc.c() < 100 && (lastFragment = launchActivity.p0.getLastFragment()) != null && !(lastFragment instanceof z90)) {
                    int b10 = org.telegram.messenger.pc.b();
                    org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(lastFragment);
                    org.telegram.ui.Components.s9 s9Var = new org.telegram.ui.Components.s9(b10 / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.m6.Y5));
                    String N0 = org.telegram.messenger.gd.N0(2131748522, null);
                    String a02 = org.telegram.messenger.gd.a0("LowPowerEnabledSubtitle", null, 2131748523, String.format("%d%%", Integer.valueOf(b10)));
                    String N02 = org.telegram.messenger.gd.N0(2131751423, null);
                    t60 t60Var = new t60(launchActivity, 11);
                    b02.getClass();
                    Context X = b02.X();
                    org.telegram.ui.ActionBar.h6 h6Var = b02.c;
                    org.telegram.ui.Components.dc dcVar = new org.telegram.ui.Components.dc(X, h6Var);
                    dcVar.a.setImageDrawable(s9Var);
                    dcVar.b.setText(N0);
                    dcVar.c.setText(a02);
                    org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(b02.X(), h6Var, true);
                    ecVar.e(N02);
                    ecVar.b = t60Var;
                    dcVar.setButton(ecVar);
                    org.telegram.ui.Components.gc b11 = b02.b(dcVar, 2750);
                    b11.j = 5000;
                    b11.j();
                    break;
                }
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                String str = LaunchActivity.C1;
                org.telegram.messenger.mp.u1(launchActivity.P).E3(null, user, null, 0, null, false, false);
                break;
        }
    }
}
