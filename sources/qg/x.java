package qg;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class x extends yn {
    public final /* synthetic */ m0 Kc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(m0 m0Var) {
        super(null);
        this.Kc = m0Var;
    }

    @Override // org.telegram.ui.yn, org.telegram.ui.Components.dh, org.telegram.ui.Components.r50
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.Kc.getContext());
    }

    @Override // org.telegram.ui.yn, org.telegram.ui.ActionBar.n2
    public final d6 getResourceProvider() {
        return this.Kc.Q1;
    }

    @Override // org.telegram.ui.yn, org.telegram.ui.Components.dh
    public final TLRPC.User i() {
        return UserConfig.getInstance(this.currentAccount).getCurrentUser();
    }

    @Override // org.telegram.ui.yn, org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.yn
    public final boolean w9() {
        return false;
    }
}
