package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class z61 implements View.OnClickListener {
    public final /* synthetic */ b71 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ c71 c;

    public z61(c71 c71Var, b71 b71Var, TLRPC.TL_authorization tL_authorization) {
        this.c = c71Var;
        this.a = b71Var;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d.c(!r0.h, true);
        this.b.call_requests_disabled = !r4.d.h;
        c71.n(this.c);
    }
}
