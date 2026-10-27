package sg;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class x extends wn {
    public final /* synthetic */ m0 od;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(m0 m0Var) {
        super(null);
        this.od = m0Var;
    }

    @Override // org.telegram.ui.wn
    public final boolean I9() {
        return false;
    }

    @Override // org.telegram.ui.wn, org.telegram.ui.Components.bh, org.telegram.ui.Components.a60
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.od.getContext());
    }

    @Override // org.telegram.ui.wn, org.telegram.ui.ActionBar.r2
    public final u6 getResourceProvider() {
        return this.od.F1;
    }

    @Override // org.telegram.ui.wn, org.telegram.ui.Components.bh
    public final TLRPC.User i() {
        return UserConfig.getInstance(this.currentAccount).getCurrentUser();
    }

    @Override // org.telegram.ui.wn, org.telegram.ui.ActionBar.r2
    public final boolean isLightStatusBar() {
        return false;
    }
}
