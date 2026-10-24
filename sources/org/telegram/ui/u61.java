package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class u61 implements View.OnClickListener {
    public final /* synthetic */ x61 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ y61 c;

    public u61(y61 y61Var, x61 x61Var, TLRPC.TL_authorization tL_authorization) {
        this.c = y61Var;
        this.a = x61Var;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d.c(!r0.h, true);
        this.b.encrypted_requests_disabled = !r4.d.h;
        y61.n(this.c);
    }
}
