// default package

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class v16 implements jc7 {
    public final /* synthetic */ tg5 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ TLRPC.ChatInvite d;
    public final /* synthetic */ LaunchActivity e;

    public v16(LaunchActivity launchActivity, tg5 tg5Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.e = launchActivity;
        this.a = tg5Var;
        this.b = zArr;
        this.c = bundle;
        this.d = chatInvite;
    }

    @Override // jc7
    public final void a() {
        LaunchActivity launchActivity = this.e;
        if (!launchActivity.isFinishing()) {
            jj.r0((e) c00.g(1, launchActivity.e0), null, ob6.M0(2131748829, null), null);
        }
        try {
            this.a.run();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // jc7
    public final void l(boolean z) {
        try {
            this.a.run();
        } catch (Exception e) {
            cc4.g(e, true);
        }
        if (this.b[0]) {
            return;
        }
        zu1 zu1Var = new zu1(this.c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            zu1Var.c6 = chatInvite;
        }
        ((ActionBarLayout) this.e.N()).S(zu1Var);
    }
}
