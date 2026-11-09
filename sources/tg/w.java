package tg;

import android.app.Activity;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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

    @Override // org.telegram.ui.cn, org.telegram.ui.Components.kg, org.telegram.ui.Components.c40
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final Activity getParentActivity() {
        return org.telegram.messenger.g0.W(this.td.getContext());
    }

    @Override // org.telegram.ui.cn, org.telegram.ui.ActionBar.f2
    public final g6 getResourceProvider() {
        return this.td.z1;
    }

    @Override // org.telegram.ui.cn, org.telegram.ui.ActionBar.f2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.cn, org.telegram.ui.Components.kg
    public final TLRPC.User j() {
        return p10.i(this.currentAccount).f();
    }
}
