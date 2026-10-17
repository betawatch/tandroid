package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class s61 implements View.OnClickListener {
    public final /* synthetic */ v61 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ w61 c;

    public s61(w61 w61Var, v61 v61Var, TLRPC.TL_authorization tL_authorization) {
        this.c = w61Var;
        this.a = v61Var;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d.c(!r0.h, true);
        this.b.encrypted_requests_disabled = !r4.d.h;
        w61.o(this.c);
    }
}
