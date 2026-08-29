package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ro implements org.telegram.ui.Components.q80 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ yo b;

    public ro(yo yoVar, Context context) {
        this.b = yoVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.q80
    public final void b() {
        this.b.X(true);
    }

    @Override // org.telegram.ui.Components.q80
    public final void j() {
        yo yoVar = this.b;
        org.telegram.ui.Components.n60 n60Var = new org.telegram.ui.Components.n60(this.a, yoVar.h0, yoVar.U, yoVar.k0, yoVar, yoVar.V, true, ChatObject.isChannel(yoVar.T));
        yo yoVar2 = this.b;
        yoVar2.l0 = n60Var;
        yoVar2.l0.show();
    }

    @Override // org.telegram.ui.Components.q80
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.q80
    public final /* synthetic */ void k() {
    }
}
