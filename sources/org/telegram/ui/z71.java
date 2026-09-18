package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class z71 implements View.OnClickListener {
    public final /* synthetic */ c81 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ d81 c;

    public z71(d81 d81Var, c81 c81Var, TLRPC.TL_authorization tL_authorization) {
        this.c = d81Var;
        this.a = c81Var;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d.c(!r0.h, true);
        this.b.encrypted_requests_disabled = !r4.d.h;
        d81.n(this.c);
    }
}
