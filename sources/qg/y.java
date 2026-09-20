package qg;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class y extends zn {
    public final /* synthetic */ n0 Pc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(n0 n0Var) {
        super(null);
        this.Pc = n0Var;
    }

    @Override // org.telegram.ui.zn, org.telegram.ui.Components.bh, org.telegram.ui.Components.n50
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.Pc.getContext());
    }

    @Override // org.telegram.ui.zn, org.telegram.ui.ActionBar.n2
    public final f6 getResourceProvider() {
        return this.Pc.Q1;
    }

    @Override // org.telegram.ui.zn, org.telegram.ui.Components.bh
    public final TLRPC.User i() {
        return UserConfig.getInstance(this.currentAccount).getCurrentUser();
    }

    @Override // org.telegram.ui.zn, org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.zn
    public final boolean x9() {
        return false;
    }
}
