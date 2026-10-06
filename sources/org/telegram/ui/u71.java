package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class u71 implements View.OnClickListener {
    public final /* synthetic */ w71 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ x71 c;

    public u71(x71 x71Var, w71 w71Var, TLRPC.TL_authorization tL_authorization) {
        this.c = x71Var;
        this.a = w71Var;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d.c(!r0.h, true);
        this.b.call_requests_disabled = !r4.d.h;
        x71.n(this.c);
    }
}
