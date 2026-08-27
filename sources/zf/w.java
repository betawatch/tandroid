package zf;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class w extends rn {
    public final /* synthetic */ l0 Mc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(l0 l0Var) {
        super(null);
        this.Mc = l0Var;
    }

    @Override // org.telegram.ui.rn, org.telegram.ui.Components.ng, org.telegram.ui.Components.c50
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.Mc.getContext());
    }

    @Override // org.telegram.ui.rn, org.telegram.ui.ActionBar.n2
    public final c6 getResourceProvider() {
        return this.Mc.M1;
    }

    @Override // org.telegram.ui.rn, org.telegram.ui.Components.ng
    public final TLRPC.User i() {
        return UserConfig.getInstance(this.currentAccount).getCurrentUser();
    }

    @Override // org.telegram.ui.rn, org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.rn
    public final boolean x9() {
        return false;
    }
}
