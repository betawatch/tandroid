package sg;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class y extends un {
    public final /* synthetic */ n0 kd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(n0 n0Var) {
        super(null);
        this.kd = n0Var;
    }

    @Override // org.telegram.ui.un
    public final boolean F9() {
        return false;
    }

    @Override // org.telegram.ui.un, org.telegram.ui.Components.bh, org.telegram.ui.Components.a60
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.kd.getContext());
    }

    @Override // org.telegram.ui.un, org.telegram.ui.ActionBar.r2
    public final u6 getResourceProvider() {
        return this.kd.F1;
    }

    @Override // org.telegram.ui.un, org.telegram.ui.Components.bh
    public final TLRPC.User i() {
        return UserConfig.getInstance(this.currentAccount).getCurrentUser();
    }

    @Override // org.telegram.ui.un, org.telegram.ui.ActionBar.r2
    public final boolean isLightStatusBar() {
        return false;
    }
}
