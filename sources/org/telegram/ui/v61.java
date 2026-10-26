package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class v61 implements View.OnClickListener {
    public final /* synthetic */ y61 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ z61 c;

    public v61(z61 z61Var, y61 y61Var, TLRPC.TL_authorization tL_authorization) {
        this.c = z61Var;
        this.a = y61Var;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d.c(!r0.h, true);
        this.b.encrypted_requests_disabled = !r4.d.h;
        z61.n(this.c);
    }
}
