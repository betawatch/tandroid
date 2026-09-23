package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class s71 implements View.OnClickListener {
    public final /* synthetic */ v71 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ w71 c;

    public s71(w71 w71Var, v71 v71Var, TLRPC.TL_authorization tL_authorization) {
        this.c = w71Var;
        this.a = v71Var;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d.c(!r0.h, true);
        this.b.encrypted_requests_disabled = !r4.d.h;
        w71.n(this.c);
    }
}
