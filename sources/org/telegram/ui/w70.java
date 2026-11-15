package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class w70 implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ w70(LaunchActivity launchActivity, int i7) {
        this.a = i7;
        this.b = launchActivity;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        org.telegram.ui.ActionBar.e2 lastFragment;
        int i7 = this.a;
        LaunchActivity launchActivity = this.b;
        switch (i7) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.p0 != null && booleanValue && org.telegram.messenger.qc.c() < 100 && (lastFragment = launchActivity.p0.getLastFragment()) != null && !(lastFragment instanceof x90)) {
                    int b10 = org.telegram.messenger.qc.b();
                    org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(lastFragment);
                    org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(b10 / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.j6.Y5));
                    String M0 = org.telegram.messenger.hd.M0(2131748715, null);
                    String a03 = org.telegram.messenger.hd.a0("LowPowerEnabledSubtitle", null, 2131748716, String.format("%d%%", Integer.valueOf(b10)));
                    String M02 = org.telegram.messenger.hd.M0(2131751435, null);
                    q60 q60Var = new q60(launchActivity, 11);
                    a02.getClass();
                    Context W = a02.W();
                    org.telegram.ui.ActionBar.e6 e6Var = a02.c;
                    org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(W, e6Var);
                    ubVar.a.setImageDrawable(k9Var);
                    ubVar.b.setText(M0);
                    ubVar.c.setText(a03);
                    org.telegram.ui.Components.vb vbVar = new org.telegram.ui.Components.vb(a02.W(), e6Var, true);
                    vbVar.e(M02);
                    vbVar.b = q60Var;
                    ubVar.setButton(vbVar);
                    org.telegram.ui.Components.xb b11 = a02.b(ubVar, 2750);
                    b11.j = 5000;
                    b11.j();
                    break;
                }
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                String str = LaunchActivity.C1;
                org.telegram.messenger.np.s1(launchActivity.P).x3(null, user, null, 0, null, false, false);
                break;
        }
    }
}
