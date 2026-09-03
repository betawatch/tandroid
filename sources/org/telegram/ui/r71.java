package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class r71 implements View.OnClickListener {
    public final /* synthetic */ t71 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ u71 c;

    public r71(u71 u71Var, t71 t71Var, TLRPC.TL_authorization tL_authorization) {
        this.c = u71Var;
        this.a = t71Var;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d.c(!r0.h, true);
        this.b.call_requests_disabled = !r4.d.h;
        u71.n(this.c);
    }
}
