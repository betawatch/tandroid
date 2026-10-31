package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s90 implements org.telegram.messenger.jp {
    public final /* synthetic */ f70 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ TLRPC.ChatInvite d;
    public final /* synthetic */ LaunchActivity e;

    public s90(LaunchActivity launchActivity, f70 f70Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.e = launchActivity;
        this.a = f70Var;
        this.b = zArr;
        this.c = bundle;
        this.d = chatInvite;
    }

    @Override // org.telegram.messenger.jp
    public final void a() {
        LaunchActivity launchActivity = this.e;
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
        if (this.b[0]) {
            return;
        }
        un unVar = new un(this.c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            unVar.a6 = chatInvite;
        }
        ((ActionBarLayout) this.e.M()).R(unVar);
    }
}
