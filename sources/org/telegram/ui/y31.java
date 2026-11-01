package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class y31 implements View.OnClickListener {
    public final /* synthetic */ org.telegram.ui.Components.ag a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ a41 c;

    public y31(a41 a41Var, org.telegram.ui.Components.ag agVar, TLRPC.TL_authorization tL_authorization) {
        this.c = a41Var;
        this.a = agVar;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ((Switch) this.a.f).c(!r0.h, true);
        this.b.call_requests_disabled = !((Switch) r4.f).h;
        a41.J0(this.c);
    }
}
