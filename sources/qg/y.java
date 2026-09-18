package qg;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.bo;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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

    @Override // org.telegram.ui.ActionBar.o2
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.Pc.getContext());
    }

    @Override // org.telegram.ui.bo, org.telegram.ui.ActionBar.o2
    public final f6 getResourceProvider() {
        return this.Pc.Q1;
    }

    @Override // org.telegram.ui.bo, org.telegram.ui.Components.ah
    public final TLRPC.User i() {
        return UserConfig.getInstance(this.currentAccount).getCurrentUser();
    }

    @Override // org.telegram.ui.bo, org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.bo
    public final boolean x9() {
        return false;
    }
}
