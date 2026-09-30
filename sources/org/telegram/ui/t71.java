package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class t71 implements View.OnClickListener {
    public final /* synthetic */ w71 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ x71 c;

    public t71(x71 x71Var, w71 w71Var, TLRPC.TL_authorization tL_authorization) {
        this.c = x71Var;
        this.a = w71Var;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d.c(!r0.h, true);
        this.b.encrypted_requests_disabled = !r4.d.h;
        x71.n(this.c);
    }
}
