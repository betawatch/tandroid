package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class qo implements org.telegram.ui.Components.h80 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ xo b;

    public qo(xo xoVar, Context context) {
        this.b = xoVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.h80
    public final void c() {
        this.b.X(true);
    }

    @Override // org.telegram.ui.Components.h80
    public final void g() {
        xo xoVar = this.b;
        org.telegram.ui.Components.f60 f60Var = new org.telegram.ui.Components.f60(this.a, xoVar.h0, xoVar.U, xoVar.k0, xoVar, xoVar.V, true, ChatObject.isChannel(xoVar.T));
        xo xoVar2 = this.b;
        xoVar2.l0 = f60Var;
        xoVar2.l0.show();
    }

    @Override // org.telegram.ui.Components.h80
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Components.h80
    public final /* synthetic */ void k() {
    }
}
