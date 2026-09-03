package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class r71 implements View.OnClickListener {
    public final /* synthetic */ u71 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ v71 c;

    public r71(v71 v71Var, u71 u71Var, TLRPC.TL_authorization tL_authorization) {
        this.c = v71Var;
        this.a = u71Var;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d.c(!r0.h, true);
        this.b.encrypted_requests_disabled = !r4.d.h;
        v71.n(this.c);
    }
}
