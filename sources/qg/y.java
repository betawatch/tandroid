package qg;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class y extends xn {
    public final /* synthetic */ p0 Pc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(p0 p0Var) {
        super(null);
        this.Pc = p0Var;
    }

    @Override // org.telegram.ui.xn, org.telegram.ui.Components.bh, org.telegram.ui.Components.p50
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.Pc.getContext());
    }

    @Override // org.telegram.ui.xn, org.telegram.ui.ActionBar.n2
    public final d6 getResourceProvider() {
        return this.Pc.Q1;
    }

    @Override // org.telegram.ui.xn, org.telegram.ui.Components.bh
    public final TLRPC.User i() {
        return UserConfig.getInstance(this.currentAccount).getCurrentUser();
    }

    @Override // org.telegram.ui.xn, org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.xn
    public final boolean x9() {
        return false;
    }
}
