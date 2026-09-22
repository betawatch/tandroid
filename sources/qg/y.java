package qg;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.bo;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class y extends bo {
    public final /* synthetic */ p0 Pc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(p0 p0Var) {
        super(null);
        this.Pc = p0Var;
    }

    @Override // org.telegram.ui.bo, org.telegram.ui.Components.ah, org.telegram.ui.Components.o50
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.Pc.getContext());
    }

    @Override // org.telegram.ui.bo, org.telegram.ui.ActionBar.n2
    public final e6 getResourceProvider() {
        return this.Pc.Q1;
    }

    @Override // org.telegram.ui.bo, org.telegram.ui.Components.ah
    public final TLRPC.User i() {
        return UserConfig.getInstance(this.currentAccount).getCurrentUser();
    }

    @Override // org.telegram.ui.bo, org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.bo
    public final boolean x9() {
        return false;
    }
}
