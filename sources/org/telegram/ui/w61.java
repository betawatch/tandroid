package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class w61 implements View.OnClickListener {
    public final /* synthetic */ z61 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ a71 c;

    public w61(a71 a71Var, z61 z61Var, TLRPC.TL_authorization tL_authorization) {
        this.c = a71Var;
        this.a = z61Var;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d.c(!r0.h, true);
        this.b.encrypted_requests_disabled = !r4.d.h;
        a71.n(this.c);
    }
}
