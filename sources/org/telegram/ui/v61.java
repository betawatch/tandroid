package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
