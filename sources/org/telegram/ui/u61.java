package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class u61 implements View.OnClickListener {
    public final /* synthetic */ w61 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ x61 c;

    public u61(x61 x61Var, w61 w61Var, TLRPC.TL_authorization tL_authorization) {
        this.c = x61Var;
        this.a = w61Var;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d.c(!r0.h, true);
        this.b.call_requests_disabled = !r4.d.h;
        x61.n(this.c);
    }
}
