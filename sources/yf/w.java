package yf;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w extends qn {
    public final /* synthetic */ l0 Mc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(l0 l0Var) {
        super(null);
        this.Mc = l0Var;
    }

    @Override // org.telegram.ui.qn, org.telegram.ui.Components.rg, org.telegram.ui.Components.x40
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.Mc.getContext());
    }

    @Override // org.telegram.ui.qn, org.telegram.ui.ActionBar.o2
    public final b6 getResourceProvider() {
        return this.Mc.M1;
    }

    @Override // org.telegram.ui.qn, org.telegram.ui.Components.rg
    public final TLRPC.User i() {
        return UserConfig.getInstance(this.currentAccount).getCurrentUser();
    }

    @Override // org.telegram.ui.qn, org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.qn
    public final boolean x9() {
        return false;
    }
}
