package tg;

import android.app.Activity;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class w extends cn {
    public final /* synthetic */ g0 td;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(g0 g0Var) {
        super(null);
        this.td = g0Var;
    }

    @Override // org.telegram.ui.cn
    public final boolean U9() {
        return false;
    }

    @Override // org.telegram.ui.cn, org.telegram.ui.Components.jg, org.telegram.ui.Components.b40
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final Activity getParentActivity() {
        return org.telegram.messenger.g0.W(this.td.getContext());
    }

    @Override // org.telegram.ui.cn, org.telegram.ui.ActionBar.f2
    public final h6 getResourceProvider() {
        return this.td.z1;
    }

    @Override // org.telegram.ui.cn, org.telegram.ui.ActionBar.f2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.cn, org.telegram.ui.Components.jg
    public final TLRPC.User j() {
        return p10.i(this.currentAccount).f();
    }
}
