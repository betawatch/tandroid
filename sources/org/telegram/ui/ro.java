package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ro implements org.telegram.ui.Components.p90 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ yo b;

    public ro(yo yoVar, Context context) {
        this.b = yoVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.p90
    public final void d() {
        this.b.X(true);
    }

    @Override // org.telegram.ui.Components.p90
    public final void i() {
        yo yoVar = this.b;
        org.telegram.ui.Components.l70 l70Var = new org.telegram.ui.Components.l70(this.a, yoVar.l0, yoVar.Y, yoVar.o0, yoVar, yoVar.Z, true, ChatObject.isChannel(yoVar.X));
        yo yoVar2 = this.b;
        yoVar2.p0 = l70Var;
        yoVar2.p0.show();
    }

    @Override // org.telegram.ui.Components.p90
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.Components.p90
    public final /* synthetic */ void k() {
    }
}
