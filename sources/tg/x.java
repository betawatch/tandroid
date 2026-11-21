package tg;

import android.app.Activity;
import org.telegram.messenger.j10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class x extends bn {
    public final /* synthetic */ h0 vd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(h0 h0Var) {
        super(null);
        this.vd = h0Var;
    }

    @Override // org.telegram.ui.bn
    public final boolean V9() {
        return false;
    }

    @Override // org.telegram.ui.bn, org.telegram.ui.Components.bh, org.telegram.ui.Components.p40
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final Activity getParentActivity() {
        return org.telegram.messenger.g0.W(this.vd.getContext());
    }

    @Override // org.telegram.ui.bn, org.telegram.ui.ActionBar.g2
    public final h6 getResourceProvider() {
        return this.vd.A1;
    }

    @Override // org.telegram.ui.bn, org.telegram.ui.ActionBar.g2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.bn, org.telegram.ui.Components.bh
    public final TLRPC.User j() {
        return j10.i(this.currentAccount).f();
    }
}
