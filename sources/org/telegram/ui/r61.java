package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class r61 implements View.OnClickListener {
    public final /* synthetic */ t61 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ u61 c;

    public r61(u61 u61Var, t61 t61Var, TLRPC.TL_authorization tL_authorization) {
        this.c = u61Var;
        this.a = t61Var;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d.c(!r0.h, true);
        this.b.call_requests_disabled = !r4.d.h;
        u61.o(this.c);
    }
}
