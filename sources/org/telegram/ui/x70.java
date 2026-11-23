package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class x70 implements org.telegram.messenger.w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ x70(LaunchActivity launchActivity, int i7) {
        this.a = i7;
        this.b = launchActivity;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        org.telegram.ui.ActionBar.g2 lastFragment;
        int i7 = this.a;
        LaunchActivity launchActivity = this.b;
        switch (i7) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.p0 != null && booleanValue && org.telegram.messenger.pc.c() < 100 && (lastFragment = launchActivity.p0.getLastFragment()) != null && !(lastFragment instanceof y90)) {
                    int b10 = org.telegram.messenger.pc.b();
                    org.telegram.ui.Components.kc b02 = org.telegram.ui.Components.kc.b0(lastFragment);
                    org.telegram.ui.Components.r9 r9Var = new org.telegram.ui.Components.r9(b10 / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.n6.Y5));
                    String N0 = org.telegram.messenger.gd.N0(2131748522, null);
                    String a02 = org.telegram.messenger.gd.a0("LowPowerEnabledSubtitle", null, 2131748523, String.format("%d%%", Integer.valueOf(b10)));
                    String N02 = org.telegram.messenger.gd.N0(2131751423, null);
                    s60 s60Var = new s60(launchActivity, 11);
                    b02.getClass();
                    Context X = b02.X();
                    org.telegram.ui.ActionBar.i6 i6Var = b02.c;
                    org.telegram.ui.Components.cc ccVar = new org.telegram.ui.Components.cc(X, i6Var);
                    ccVar.a.setImageDrawable(r9Var);
                    ccVar.b.setText(N0);
                    ccVar.c.setText(a02);
                    org.telegram.ui.Components.dc dcVar = new org.telegram.ui.Components.dc(b02.X(), i6Var, true);
                    dcVar.e(N02);
                    dcVar.b = s60Var;
                    ccVar.setButton(dcVar);
                    org.telegram.ui.Components.fc b11 = b02.b(ccVar, 2750);
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
