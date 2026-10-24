package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class v61 implements View.OnClickListener {
    public final /* synthetic */ x61 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ y61 c;

    public v61(y61 y61Var, x61 x61Var, TLRPC.TL_authorization tL_authorization) {
        this.c = y61Var;
        this.a = x61Var;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d.c(!r0.h, true);
        this.b.call_requests_disabled = !r4.d.h;
        y61.n(this.c);
    }
}
