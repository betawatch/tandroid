package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z11 implements View.OnClickListener {
    public final /* synthetic */ org.telegram.ui.Components.cg a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ b21 c;

    public z11(b21 b21Var, org.telegram.ui.Components.cg cgVar, TLRPC.TL_authorization tL_authorization) {
        this.c = b21Var;
        this.a = cgVar;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ((Switch) this.a.f).c(!r0.h, true);
        this.b.call_requests_disabled = !((Switch) r4.f).h;
        b21.J0(this.c);
    }
}
