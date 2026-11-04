package ug;

import android.app.Activity;
import org.telegram.messenger.h10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w extends wm {
    public final /* synthetic */ f0 sd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(f0 f0Var) {
        super(null);
        this.sd = f0Var;
    }

    @Override // org.telegram.ui.wm
    public final boolean T9() {
        return false;
    }

    @Override // org.telegram.ui.wm, org.telegram.ui.Components.ig, org.telegram.ui.Components.x30
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final Activity getParentActivity() {
        return org.telegram.messenger.g0.W(this.sd.getContext());
    }

    @Override // org.telegram.ui.wm, org.telegram.ui.ActionBar.d2
    public final e6 getResourceProvider() {
        return this.sd.A1;
    }

    @Override // org.telegram.ui.wm, org.telegram.ui.ActionBar.d2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.wm, org.telegram.ui.Components.ig
    public final TLRPC.User j() {
        return h10.i(this.currentAccount).f();
    }
}
