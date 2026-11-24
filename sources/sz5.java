// default package

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class sz5 implements ca7 {
    public final /* synthetic */ kz5 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ TLRPC.ChatInvite d;
    public final /* synthetic */ LaunchActivity e;

    public sz5(LaunchActivity launchActivity, kz5 kz5Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.e = launchActivity;
        this.a = kz5Var;
        this.b = zArr;
        this.c = bundle;
        this.d = chatInvite;
    }

    @Override // ca7
    public final void a() {
        LaunchActivity launchActivity = this.e;
        if (!launchActivity.isFinishing()) {
            ij.r0((d) b00.f(1, launchActivity.e0), null, k96.M0(2131748883, null), null);
        }
        try {
            this.a.run();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // ca7
    public final void m(boolean z) {
        try {
            this.a.run();
        } catch (Exception e) {
            fa4.g(e, true);
        }
        if (this.b[0]) {
            return;
        }
        mu1 mu1Var = new mu1(this.c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            mu1Var.c6 = chatInvite;
        }
        ((ActionBarLayout) this.e.N()).S(mu1Var);
    }
}
